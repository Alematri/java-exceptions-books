public class Book {
    private String title;
    private String author;
    private String publisher;
    private int numPages;

    public Book(String title, String author, String publisher, int numPages) throws BookException {
        if (title.isEmpty() || author.isEmpty() || publisher.isEmpty() || numPages <= 0) {
            throw new BookException("Dati libro non validi");
        }
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numPages = numPages;
    }

    // Getter e setter

    @Override
    public String toString() {
        return "Libro: " + title + ", Autore: " + author + ", Editore: " + publisher + ", Pagine: " + numPages;
    }
}