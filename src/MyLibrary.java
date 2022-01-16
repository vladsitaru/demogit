public class MyLibrary {

    private Book[] myBooks = new Book[100];
    private int index = 0;

    public void setLibrarySize(int length) {
        this.myBooks = new Book[length];
    }

    public Book[] getMyBooks() {
        return myBooks;
    }

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


    void readingStatus(WishList wishList) {
        boolean isInWishList = false;
        for(int i = 0; i < myBooks.length; i++) {
            isInWishList = false;
            if (myBooks[i] != null) {
                for (int j = 0; j < wishList.getWishList().length; i++) {
                    if (wishList.getWishList()[j] != null) {
                        if (myBooks[i].getName() == wishList.getWishList()[j].getName())
                            isInWishList = true;
                    }
                }
                if (isInWishList == true)
                    System.out.println(myBooks[i].getName() + " | " + myBooks[i].getAuthor() + " | " + "Is in wishlist: " + isInWishList);
                else System.out.println(myBooks[i].getName() + " | " + myBooks[i].getAuthor() + " | " + "Is in wishlist: False");
            }
        }
    }
}
