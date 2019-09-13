package callCenter;

public class Client implements Runnable {
    private int clientNumber;

    public Client(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    @Override
    public void run() {
        System.out.printf("Accept a call from the client №%d.%n", clientNumber);
        try {
            Main.getSemaphore().acquire();
            int operatorNumber = -1;

            synchronized (Main.getCallCapacity()) {
                for (int i = 1; i <= Main.getCallCapacity().length; i++) {
                    if (!Main.getCallCapacity()[i]) {
                        Main.getCallCapacity()[i] = true;
                        operatorNumber = i;
                        System.out.printf("connect the client №%d " +
                                "and the operator №%d established.%n", clientNumber, i);
                        break;
                    }
                }
            }
            System.out.printf("The problem of the client №%d is solved %n", clientNumber);
            Thread.sleep(2000);
            synchronized (Main.getCallCapacity()) {
                Main.getCallCapacity()[operatorNumber] = false;
            }
            Main.getSemaphore().release();
            System.out.printf("The problem of the client №%d was finished. The operator №%d is free.%n" +
                    "", clientNumber, operatorNumber);
        } catch (InterruptedException e) {
        }
    }
}
