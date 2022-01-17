public class WishList {
    private WishListObj wishList[] = new WishListObj[100];
    private int index;

    public WishListObj[] getWishList() {
        return wishList;
    }

    public int getWishListIndex() {
        return index;
    }

    void listWishList() {
        for (int i = 0; i < wishList.length; i++) {
            WishListObj Obj = wishList[i];
            if (Obj != null)
                System.out.println(Obj);
        }
    }

    boolean addToWishList(WishListObj wishedBook) {
        boolean ok = false;
        if (index < 100) {
            wishList[index] = wishedBook;
            index++;
            ok = true;
        }
        return ok;
    }

    public void doIOwnTheseBooks(MyLibrary library) {
        for (int i = 0; i < wishList.length; i++) {
            boolean match = false;
            if (wishList[i] != null) {
            for (int j = 0; j < library.getMyBooks().length; j++) {
                if (library.getMyBooks()[j] != null)
                    if (wishList[i].getName() == library.getMyBooks()[j].getName()) {
                        System.out.println("I own the book: " + wishList[i].getName());
                        match = true;
                    }
                }
            if (match == false)
                System.out.println("I do not own: " + wishList[i].getName());
            }
        }
    }

    public void printWishList() {
        for (int i = 0; i < wishList.length; i++) {
            if (wishList[i] != null) {
                System.out.println("Carte: " + wishList[i].getName() + " | Autor:" + wishList[i].getAuthor());
            }
        }
    }
}
