public class ProgramPrincipal {

    public static void main(String[] args) {
        MyLibrary library = new MyLibrary();

        Book b = new Book("Ion", new Author("Liviu Rebreanu"));
        library.addBook(b);

        eBook eb = new eBook("Amintiri din copilarie", new Author("Ion Creanga"), "amintiri.pdf");
        library.addBook(eb);
        library.listBook();
    }
}
