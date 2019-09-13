package libraryExceptions;

import java.util.Objects;

public class SettingsBooks {
    private int id;
    private String title;
    private String author;
    private String firstName;
    private String lastName;

    public SettingsBooks(int id, String title, String firstName, String lastName) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.author = firstName + " " + lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SettingsBooks book = (SettingsBooks) o;
        return id == book.id &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(firstName, book.firstName) &&
                Objects.equals(lastName, book.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, firstName, lastName);
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }
}
