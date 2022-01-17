public class ProgramPrincipal {

    public static void main(String[] args) {
        MyLibrary library = new MyLibrary();
        WishList wishList = new WishList();


        // in library
        Book a1 = new Book("Ion", new Author("Liviu Rebreanu"));
        Book a2 = new Book("Povestiri V.A.", new Author("Vasile Alecsandri"));
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


        // adding books to WishList

        a1.addToWishList(wishList);
        a2.addToWishList(wishList);
        b1.addToWishList(wishList);
        b2.addToWishList(wishList);
        a4.addToWishList(wishList);
        a5.addToWishList(wishList);

        //print wishlist

        wishList.printWishList();

        System.out.println();
        System.out.println("Library reading status");
        System.out.println();

        // shows books in library (being read) and if they are in wishlist
        library.readingStatus(wishList);

        System.out.println();
        System.out.println("Wishlist own status");
        System.out.println();

        // prints wishlist and shows which are in library, which not

        wishList.doIOwnTheseBooks(library);
    }
}
