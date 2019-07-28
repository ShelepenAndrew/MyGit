package myHomeWork1;

public class Task8 {
    /*
    Пройти циклом по числам от 1 до 12 и вывести название месяца,
    соответствующее каждому числу (используя цикл и оператор if else)
    */
    public static void main(String[] args) {
        for (int a = 1; a <= 12; a++) {
            if (a == 1) {
                System.out.println("январь");
            } else if (a == 2) {
                System.out.println("февраль");
            } else if (a == 3) {
                System.out.println("март");
            } else if (a == 4) {
                System.out.println("апрель");
            } else if (a == 5) {
                System.out.println("май");
            } else if (a == 6) {
                System.out.println("июнь");
            } else if (a == 7) {
                System.out.println("июль");
            } else if (a == 8) {
                System.out.println("август");
            } else if (a == 9) {
                System.out.println("сентябрь");
            } else if (a == 10) {
                System.out.println("октябрь");
            } else if (a == 11) {
                System.out.println("ноябрь");
            } else if (a == 12) {
                System.out.println("декабрь");
            }
        }
    }
}
