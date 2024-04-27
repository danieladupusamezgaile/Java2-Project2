import java.util.HashMap;

public class Novels {
    private HashMap<String, String> book = new HashMap<String, String>();

    public void setAuthor(String author) {
        this.book.put("author", author);
    }

    public void setTitle(String title) {
        this.book.put("title", title);
    }

    public void setYear(String year) {
        this.book.put("year", year);
    }

    public void setPrice(String price) {
        this.book.put("price", price);
    }

    public void list(){
        System.out.printf("| %-20s | %-10s | %-20s | %-10s |%n", this.book.get("author"), this.book.get("year"), this.book.get("title"), this.book.get("price"));
    }
}
