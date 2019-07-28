package myHomeWork1;

public class Task13 {
    /*
    Напишите программу, где двум строковым переменным присваиваются
    значения, третей же строковой переменных присвойте объединение
    (конкатенацию) двух предыдущих строк. Затем напечатайте значение
    третьей строковой переменной.
    */
    public static void main(String[] args) {
        String[] coldhot = {"Winter", "Summer"};
        String[] wintersummer = {"cold", "hot"};

        String result1 = coldhot[0].concat(" is ").concat(wintersummer[0]);
        String result2 = coldhot[1].concat(" is ").concat(wintersummer[1]);

        System.out.println(result1);
        System.out.println(result2);
    }
}
