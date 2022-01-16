public class WishListObj extends Book {
    private boolean isInMyLibrary;
    static private int index = 0;


    // getters

    public static int getIndex() {
        return index;
    }

    public boolean getIsInMyLibrary() {
        return isInMyLibrary;
    }

    //setter
    public void setInMyLibrary(boolean inMyLibrary) {
        isInMyLibrary = inMyLibrary;
    }

    //constructor
    WishListObj(Book book, MyLibrary library) {
        super(book);
        index++;
        for (int i = 0; i < library.getMyBooks().length; i++) {
            if (library.getMyBooks()[i] != null){
                if(library.getMyBooks()[i].getName() == book.getName()) {
                    isInMyLibrary = true;
                    }
            }
        }

    }
    WishListObj(Book book) {
        super(book);
        index++;
        isInMyLibrary = false;
    }
    @Override
    public String toString() {
        String valToReturn = super.getName() + " | " + super.getAuthor() + " | " + getIsInMyLibrary();
        return valToReturn;
    }
}
