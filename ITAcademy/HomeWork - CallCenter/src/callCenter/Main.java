package callCenter;

import java.util.concurrent.Semaphore;

public class Main {
    private static final boolean[] CallCapacity = new boolean[20];
    private static final Semaphore Semaphore = new Semaphore(CallCapacity.length, true);
    private static int numberOfClients = 25;

    public static boolean[] getCallCapacity() {
        return CallCapacity;
    }

    public static Semaphore getSemaphore() {
        return Semaphore;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= numberOfClients; i++) {
            new Thread(new Client(i)).start();
            Thread.sleep(500);
        }
    }
}
