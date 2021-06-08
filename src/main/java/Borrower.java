import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int getCollectionCount() {
        return this.collection.size();
    }

    public void borrowFromLibrary(Library library) {
        Book book = library.lend();
        this.collection.add(book);
    }
}
