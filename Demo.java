import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    Scanner sc = new Scanner(System.in);
    List<Science> scienceBooks = new ArrayList<>();
    List<Technology> technologyBooks = new ArrayList<>();
    List<Novels> novelsBooks = new ArrayList<>();

    public void menu(){
        sc.useDelimiter("\n");
        int option;
        System.out.println("----------------------------------");
        System.out.println("| Library Management System Menu |");
        System.out.println("----------------------------------");
        System.out.println("| 1. Add Science Book            |");
        System.out.println("| 2. Add Technology Book         |");
        System.out.println("| 3. Add Novel Book              |");
        System.out.println("| 4. Print Library Inventory     |");
        System.out.println("| 5. Exit                        |");
        System.out.println("----------------------------------");
        System.out.println("Enter your choise: ");
        System.out.print("-->");

        while (!sc.hasNextInt()) { // check if integer value entered
            System.out.println("Not a valid option!");
            System.out.println("Enter your choise: ");
            System.out.print("-->");
            sc.next();
        }
        option = sc.nextInt();
        while(option < 1 || option > 5){
            System.out.println("Please, choose from offered options");
            System.out.println("Enter your choise: ");
            System.out.print("-->");

            while (!sc.hasNextInt()) { // check if integer value entered
                System.out.println("Not a valid option!");
                System.out.println("Enter your choise: ");
                System.out.print("-->");
                sc.next();
            }
            option = sc.nextInt();
        }
        switch (option) {
            case 1:
                this.addScienceBook();
                break;
            case 2:
                this.addTechnologyBook();
                break;
            case 3:
                this.addNovelsBook();
                break;
            case 4:
                this.printInventory();
                break;
            default:
                System.out.println("Thank You, bye");
                break;
        }
    }

    public void addScienceBook(){
        Science science1 = new Science();

        System.out.println("---------------------------------------");
        System.out.println("| Enter details for the Science book: |");
        System.out.println("---------------------------------------");
        System.out.print("Author Name: ");
        String author = sc.next();
        System.out.print("Year of publishing: ");

        while (!sc.hasNextInt()) {
            System.out.println("Not a valid year");
            System.out.print("Year of publishing:");
            sc.next();
        }
        int year = sc.nextInt();
        while (year < 1000 || year > 2024) {
            System.out.println("Not a valid year");
            System.out.print("Year of publishing:");
            while (!sc.hasNextInt()) {
                System.out.println("Not a valid year");
                System.out.print("Year of publishing:");
                sc.next();
            }
            year = sc.nextInt();
        }
        System.out.print("Title: ");
        String title = sc.next();
        System.out.print("Price: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Not a valid price");
            System.out.print("Price:");
            sc.next();
        }
        double price = sc.nextDouble();
        while (price < 0) {
            System.out.println("Not a valid price");
            System.out.print("Price:");
            while (!sc.hasNextDouble()) {
                System.out.println("Not a valid price");
                System.out.print("Price:");
                sc.next();
            }
            price = sc.nextDouble();
        }
        
        science1.setAuthor(author);
        science1.setTitle(title);
        science1.setYear(String.valueOf(year));
        science1.setPrice(String.valueOf(price));
        scienceBooks.add(science1);
        System.out.println("Book added successfully to the Science Category");
        System.out.print("Press Enter to continue");
        sc.nextLine();
        if(sc.hasNextLine()){
            this.menu();
        }
    }

    public void addTechnologyBook(){
        Technology technology = new Technology();

        System.out.println("------------------------------------------");
        System.out.println("| Enter details for the Technology book: |");
        System.out.println("------------------------------------------");
        System.out.print("Author Name: ");
        String author = sc.next();
        System.out.print("Year of publishing: ");
        while (!sc.hasNextInt()) {
            System.out.println("Not a valid year");
            System.out.print("Year of publishing:");
            sc.next();
        }
        int year = sc.nextInt();
        while (year < 1000) {
            System.out.println("Not a valid year");
            System.out.print("Year of publishing:");
            while (!sc.hasNextInt()) {
                System.out.println("Not a valid year");
                System.out.print("Year of publishing:");
                sc.next();
            }
            year = sc.nextInt();
        }
        System.out.print("Title: ");
        String title = sc.next();
        System.out.print("Price: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Not a valid price");
            System.out.print("Price:");
            sc.next();
        }
        double price = sc.nextDouble();
        while (price < 0) {
            System.out.println("Not a valid price");
            System.out.print("Price:");
            while (!sc.hasNextDouble()) {
                System.out.println("Not a valid price");
                System.out.print("Price:");
                sc.next();
            }
            price = sc.nextDouble();
        }
        
        technology.setAuthor(author);
        technology.setTitle(title);
        technology.setYear(String.valueOf(year));
        technology.setPrice(String.valueOf(price));
        technologyBooks.add(technology);
        System.out.println("Book added successfully to the Technology Category");
        System.out.print("Press Enter to continue");
        sc.nextLine();
        if(sc.hasNextLine()){
            this.menu();
        }
    }

    public void addNovelsBook(){
        Novels novels = new Novels();

        System.out.println("--------------------------------------");
        System.out.println("| Enter details for the Novels book: |");
        System.out.println("--------------------------------------");
        System.out.print("Author Name: ");
        String author = sc.next();
        System.out.print("Year of publishing: ");
        while (!sc.hasNextInt()) {
            System.out.println("Not a valid year");
            System.out.print("Year of publishing:");
            sc.next();
        }
        int year = sc.nextInt();
        while (year < 1000) {
            System.out.println("Not a valid year");
            System.out.print("Year of publishing:");
            while (!sc.hasNextInt()) {
                System.out.println("Not a valid year");
                System.out.print("Year of publishing:");
                sc.next();
            }
            year = sc.nextInt();
        }
        System.out.print("Title: ");
        String title = sc.next();
        System.out.print("Price: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Not a valid price");
            System.out.print("Price:");
            sc.next();
        }
        double price = sc.nextDouble();
        while (price < 0) {
            System.out.println("Not a valid price");
            System.out.print("Price:");
            while (!sc.hasNextDouble()) {
                System.out.println("Not a valid price");
                System.out.print("Price:");
                sc.next();
            }
            price = sc.nextDouble();
        }
        
        novels.setAuthor(author);
        novels.setTitle(title);
        novels.setYear(String.valueOf(year));
        novels.setPrice(String.valueOf(price));
        novelsBooks.add(novels);
        System.out.println("Book added successfully to the Novels Category");
        System.out.print("Press Enter to continue");
        sc.nextLine();
        if(sc.hasNextLine()){
            this.menu();
        }
    }

    public void printInventory(){
        Library library = new Library(scienceBooks, technologyBooks, novelsBooks);
        library.listBooks();
        System.out.print("Press Enter to continue");
        sc.nextLine();
        if(sc.hasNextLine()){
            this.menu();
        }
    }
    
    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.menu();
    }
}
