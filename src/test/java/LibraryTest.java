import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library();
        book = new Book("A Game of Thrones", "George R. R. Martin", "Fantasy");
        borrower = new Borrower("Steve");
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToStock() {
        library.addBookToStock(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void libraryHasCapacity() {
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void libraryCanLend() {
        library.addBookToStock(book);
        library.lend();
        assertEquals(0, library.getBookCount());
    }

}
