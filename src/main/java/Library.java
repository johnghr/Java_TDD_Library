import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private Integer bookCapacity;

    public Library() {
        this.books = new ArrayList<>();
        this.bookCapacity = 2;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBookToStock(Book book) {
        if (this.bookCapacity > books.size()) {
            this.books.add(book);
        }
    }

    public Book lend() {
        return this.books.remove(0);
    }

}
