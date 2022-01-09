public class WishListObj {
    private Book book;
    private boolean isInMyLibrary;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean isInMyLibrary() {
        return isInMyLibrary;
    }

    public void setInMyLibrary(boolean inMyLibrary) {
        isInMyLibrary = inMyLibrary;
    }

    WishListObj(Book book, MyLibrary library) {
        System.out.println("Creating WishListObj");
        this.book = book;
        for (int i = 0; i < library.getMyBooks().length; i++) {
            System.out.println("In WishListObj loop nr " + i);
            if(library.getMyBooks()[i].equals(book)){ //&& library.getMyBooks()[i].getAuthor().getName().equals(book.getAuthor())
                isInMyLibrary = true;
            }
        }

    }
    public String toString() {
        String valToReturn = book.getName() + " | " + book.getAuthor() + " | " + isInMyLibrary();
        return valToReturn;
    }
}
