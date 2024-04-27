import java.util.List;

public class Library {
    List<Science> science;
    List<Technology> technology;
    List<Novels> novels;

    Library(List<Science>  scienceBook, List<Technology> technologyBook, List<Novels> novelsBook){
        this.science = scienceBook;
        this.technology = technologyBook;
        this.novels = novelsBook;
    }

    public void listBooks(){
        System.out.println("\nScience books: ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-20s | %-10s |%n", "Author Name", "Published", "Title", "Price");
        System.out.println("-------------------------------------------------------------------------");
        for (Science book : science) {
            book.list();
        }
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("\nTechnology books: ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-20s | %-10s |%n", "Author Name", "Published", "Title", "Price");
        System.out.println("-------------------------------------------------------------------------");
        for (Technology book : technology) {
            book.list();
        }
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("\nNovels books: ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-20s | %-10s |%n", "Author Name", "Published", "Title", "Price");
        System.out.println("-------------------------------------------------------------------------");
        for (Novels book : novels) {
            book.list();
        }
        System.out.println("-------------------------------------------------------------------------");
    }
}