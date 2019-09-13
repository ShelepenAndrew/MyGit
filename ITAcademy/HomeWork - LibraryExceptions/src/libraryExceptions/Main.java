package libraryExceptions;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SettingsBooks book1 = new SettingsBooks(1, "The Novice", "Mikhail", "Lermontov - ");
        SettingsBooks book2 = new SettingsBooks(2, "Anna Karenina", "Leo", "Tolstoy - ");
        SettingsBooks book3 = new SettingsBooks(3, "A Nest of the Gentry", "Ivan", "Turgenev - ");
        SettingsBooks book4 = new SettingsBooks(4, "Crime and Punishment", "Fyodor", "Dostoevsky - ");
        SettingsBooks book5 = new SettingsBooks(5, "The Railway", "Nikolay", "Nekrasov - ");
        SettingsBooks book6 = new SettingsBooks(6, "The Master and Margarita", "Mikhail", "Bulgakov - ");

        List<SettingsBooks> listBooks = new LinkedList<>();
        listBooks.add(book1);
        listBooks.add(book2);
        listBooks.add(book3);
        listBooks.add(book4);
        listBooks.add(book5);
        listBooks.add(book6);

        System.out.print("You have chosen book number ");
        try {
            System.out.println(ListBook.findBook(listBooks, 4));
        } catch (RuntimeException e) {
            System.out.println("[error!] the book is missing!");
        }
    }
}