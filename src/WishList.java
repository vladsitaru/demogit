public class WishList {
    private WishListObj wishList[] = new WishListObj[100];
    private int index;
    public WishListObj[] getWishList() {
        return wishList;
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
}
