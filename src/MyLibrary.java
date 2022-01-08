public class MyLibrary {

    private Book[] myBooks = new Book[100];
    private int index = 0;

    boolean addBook(Book book) {
        boolean ok = false;
        if (index < 100) {
            myBooks[index] = book;
            index++;
            ok = true;
        }
        return ok;
    }
    void listBook() {
        for (int i = 0; i < myBooks.length; i++) {
            Book b = myBooks[i];
            if (b != null)
            System.out.println(b);
        }
    }

}
