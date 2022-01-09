public class ProgramPrincipal {

    public static void main(String[] args) {
        MyLibrary library = new MyLibrary();
        WishList myWishList = new WishList();


        Book b = new Book("Ion", new Author("Liviu Rebreanu"));
        library.addBook(b);

        eBook eb = new eBook("Amintiri din copilarie", new Author("Ion Creanga"), "amintiri.pdf");
        library.addBook(eb);
        library.listBook();

        WishListObj book1 = new WishListObj(b, library);
        WishListObj book2 = new WishListObj(new Book("Frații Jderi", new Author("Mihail Sadoveanu")), library);

        myWishList.addToWishList(book1);
        myWishList.addToWishList(book2);

        myWishList.listWishList();
    }
}
