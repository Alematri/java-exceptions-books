import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti libri vuoi inserire?");
        int numBooks = scanner.nextInt();
        scanner.nextLine();

        Book[] library = new Book[numBooks];

        for (int i = 0; i < numBooks; i++) {
            try {
                System.out.println("Inserisci i dati del libro " + (i + 1) + ":");
                System.out.print("Titolo: ");
                String title = scanner.nextLine();
                System.out.print("Autore: ");
                String author = scanner.nextLine();
                System.out.print("Editore: ");
                String publisher = scanner.nextLine();
                System.out.print("Numero di pagine: ");
                int numPages = scanner.nextInt();
                scanner.nextLine();


                library[i] = new Book(title, author, publisher, Integer.toString(numPages));
            } catch (BookException e) {
                System.out.println("Errore nella creazione del libro: " + e.getMessage());
                i--;
            }
        }

        System.out.println("Catalogo libri inserito:");
        for (Book book : library) {
            if (book != null) {
                System.out.println(book);
            }
        }

        scanner.close();
    }
}
