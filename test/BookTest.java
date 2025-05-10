import com.startjava.lesson_4.bookshelf.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookCreation() {
        Book book = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);

        assertEquals("Рэй Брэдбери", book.getAuthor());
        assertEquals("451 градус по Фаренгейту", book.getTitle());
        assertEquals(1980, book.getYear());
    }

    @Test
    public void testToString() {
        Book book = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        String expected = "Ирвинг Стоун, Жажда жизни, 1973";

        assertEquals(expected, book.toString());
    }
}