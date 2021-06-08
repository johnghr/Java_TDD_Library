import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("A Game of Thrones", "George R. R. Martin", "Fantasy");
    }

    @Test
    public void bookHasName() {
        assertEquals("A Game of Thrones", book.getName());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("George R. R. Martin", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }

}
