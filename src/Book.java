public class Book {
    private String title;
    private String author;
    private String publisher;
    private int numPages;

    public Book(String title, String author, String publisher, String numPages) throws BookException {
        if (title.isEmpty() || author.isEmpty() || publisher.isEmpty() || numPages.isEmpty()) {
            throw new BookException("Dati libro non validi");
        }

        // Verifica se numPages è un intero
        if (!numPages.matches("\\d+")) {
            throw new BookException("Il numero di pagine deve essere un numero intero");
        }

        int pages;
        try {
            pages = Integer.parseInt(numPages);
        } catch (NumberFormatException e) {
            throw new BookException("Il numero di pagine non è un numero valido");
        }

        if (pages <= 0) {
            throw new BookException("Il numero di pagine deve essere maggiore di zero");
        }

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numPages = pages;
    }

    // Getter e setter per i campi del libro

    @Override
    public String toString() {
        return "Libro: " + title + ", Autore: " + author + ", Editore: " + publisher + ", Pagine: " + numPages;
    }
}
