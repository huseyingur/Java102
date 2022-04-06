import java.util.Comparator;

public class pageCountComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        return b1.getPageCount()-b2.getPageCount();
    }
}
