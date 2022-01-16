public class ProgramPrincipal {

    public static void main(String[] args) {
        MyLibrary library = new MyLibrary();
        WishList wishList = new WishList();


        // in library
        Book a1 = new Book("Ion", new Author("Liviu Rebreanu"));
        Book a2 = new Book("Poezii", new Author("Vasile Alecsandri"));
        Book a3 = new Book("Dănilă Prepeleac", new Author("Ion Creanga"));
        eBook b1 = new eBook("Amintiri din copilarie", new Author("Ion Creanga"), "amintiri.pdf");
        eBook b2 = new eBook("Poezii", new Author("Ion Creanga"), "poezii.pdf");
        eBook b3 = new eBook("Baltagul", new Author("Mihail Sadoveanu"), "baltagul.pdf");

        library.addBook(a1);
        library.addBook(a2);
        library.addBook(a3);
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // outside library but in wishlist

        Book a4 = new Book("Cartea 1", new Author("Autor 1"));
        Book a5 = new Book("Cartea 2", new Author("Autor 2"));
        Book a6 = new Book("Cartea 3", new Author("Autor 3"));

        // creating wishlist objects

        WishListObj book1 = new WishListObj(a1, library);
        WishListObj book2 = new WishListObj(a2, library);
        WishListObj book3 = new WishListObj(a4);
        WishListObj book4 = new WishListObj(a5);
        WishListObj book5 = new WishListObj(a6);

        // adding them to WishList

        wishList.addToWishList(book1);
        wishList.addToWishList(book2);
        wishList.addToWishList(book3);
        wishList.addToWishList(book4);
        wishList.addToWishList(book5);

        library.readingStatus(wishList);
    }
}
