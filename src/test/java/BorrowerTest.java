import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower("Steve");
        library = new Library();
        book = new Book("A Game of Thrones", "George R. R. Martin", "Fantasy");
    }

    @Test
    public void borrowerHasName() {
        assertEquals("Steve", borrower.getName());
    }

    @Test
    public void borrowerHasCollection() {
        assertEquals(0, borrower.getCollectionCount());
    }

    @Test
    public void borrowerCanBorrowBook() {
        library.addBookToStock(book);
        borrower.borrowFromLibrary(library);
        assertEquals(1, borrower.getCollectionCount());
    }

}
