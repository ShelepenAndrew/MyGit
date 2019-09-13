package libraryExceptions;

import java.util.List;

public class ListBook {

    public static SettingsBooks findBook(List<SettingsBooks> list, int id) {
        for (SettingsBooks book : list) {
            if (book.getId() == id) {
                return book;
            }
        }
        throw new RuntimeException();
    }
}





