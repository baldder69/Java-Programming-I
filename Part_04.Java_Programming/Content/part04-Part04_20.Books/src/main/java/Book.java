
public class Book {
    private String book;
    private int pages;
    private int publicationYear;
    
    public Book(String initialBook, int initialPages, int initialPublicationYear){
        this.book = initialBook;
        this.pages = initialPages;
        this.publicationYear = initialPublicationYear;
    }
    
    public String getBook(){
        return this.book;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getPublicationYear(){
        return this.publicationYear;
    }
    
    public String toString(){
        return this.book + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
