package myHomeWork1;

import java.util.Scanner;

public class AdvancedLevel {
    /*
    Напишите программу, которая будет считать количество часов,
    минут и секунд в n-ном количестве суток.
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        float countDays = in.nextFloat();
        float oclock = countDays * 24;
        float minutes = countDays * 1440;
        float seconds = countDays * 86400;

        System.out.println("В " + countDays + " днях " + oclock + " часов " + minutes + " минут " + seconds + " секунд ");
    }
}
