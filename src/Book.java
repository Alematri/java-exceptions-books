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

    // Getter per il campo title
    public String getTitle() {
        return title;
    }

    // Setter per il campo title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter per il campo author
    public String getAuthor() {
        return author;
    }

    // Setter per il campo author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter per il campo publisher
    public String getPublisher() {
        return publisher;
    }

    // Setter per il campo publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter per il campo numPages
    public int getNumPages() {
        return numPages;
    }

    // Setter per il campo numPages
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Libro: " + title + ", Autore: " + author + ", Editore: " + publisher + ", Pagine: " + numPages;
    }
}