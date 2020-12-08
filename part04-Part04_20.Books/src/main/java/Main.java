import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Title: ");
            String bookTitle = scanner.nextLine();
            
            if (bookTitle.equals("")){
                break;
            } else {
                System.out.println("Pages: ");
                int bookPages = Integer.valueOf(scanner.nextLine());
                
                System.out.println("Publication year: ");
                int bookYear = Integer.valueOf(scanner.nextLine());
                
                books.add(new Book(bookTitle, bookPages, bookYear));
            }
        }
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        
        for (Book book : books){
            if (input.equals("everything")){
                System.out.println(book);
            }
            if (input.equals("name")){
                System.out.println(book.getBook());
            }
        }
    }
}
