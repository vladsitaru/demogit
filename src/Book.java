public class Book {
    private String name;
    private Author author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    Book (String name, Author author) {
        this.name = name;
        this.author = author;
    }

    Book (Book book) {
        this.name = book.getName();
        this.author = book.getAuthor();
    }

    public String toString() {
        String valToReturn = name + ", " + author.getName();
        return valToReturn;
    }

    public void addToWishList(WishList wishlist) {
        WishListObj wishObj = new WishListObj(new Book(this.name, this.author));
//        if (wishlist.getWishListIndex() < wishlist.getWishListIndex()) {
            boolean added = false;
            int i = 0;
            do {
                if(wishlist.getWishList()[i] == null) {
                    wishlist.getWishList()[i] = wishObj;
                    added = true;
                    }
                i++;
                }
            while(added != true);
        }
    }
