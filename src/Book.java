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

    public String toString() {
        String valToReturn = name + ", " + author.getName();
        return valToReturn;
    }


}
