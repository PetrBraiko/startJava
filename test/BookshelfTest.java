import com.startjava.lesson_4.bookshelf.Book;
import com.startjava.lesson_4.bookshelf.Bookshelf;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BookshelfTest {

    private Bookshelf bookshelf;

    @BeforeEach
    public void setUp() {
        bookshelf = new Bookshelf();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        bookshelf.addBook(book);

        assertEquals(1, bookshelf.getBookCount());
        assertEquals(9, bookshelf.getFreeShelves());
    }

    @Test
    public void testAddBookWhenFull() {
        for (int i = 0; i < 10; i++) {
            bookshelf.addBook(new Book("Автор" + i, "Книга" + i, 2000 + i));
        }

        assertThrows(IllegalStateException.class, () -> {
            bookshelf.addBook(new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980));
        });
    }

    @Test
    public void testFindBook() {
        Book book = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        bookshelf.addBook(book);

        assertNotNull(bookshelf.findBook("451 градус по фаренгейту"));
        assertNull(bookshelf.findBook("Неизвестная книга"));
    }

    @Test
    public void testDeleteBook() {
        Book book = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        bookshelf.addBook(book);

        bookshelf.deleteBook("451 градус по фаренгейту");
        assertEquals(0, bookshelf.getBookCount());
        assertNull(bookshelf.findBook("451 градус по фаренгейту"));
    }

    @Test
    public void testDeleteNonexistentBook() {
        assertThrows(IllegalArgumentException.class, () -> {
            bookshelf.deleteBook("Неизвестная книга");
        });
    }

    @Test
    public void testClearBookshelf() {
        bookshelf.addBook(new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980));
        bookshelf.clear();

        assertEquals(0, bookshelf.getBookCount());
        assertEquals(10, bookshelf.getFreeShelves());
    }

    @Test
    public void testGetAllBooks() {
        Book book1 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        Book book2 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);

        Book[] allBooks = bookshelf.getAllBooks();
        assertEquals(2, allBooks.length);
        assertTrue(Arrays.asList(allBooks).contains(book1));
        assertTrue(Arrays.asList(allBooks).contains(book2));
    }
}