public class eBook extends Book {
    private String fileName;

    public eBook(String name, Author author, String fileName) {
        super(name, author);
        this.fileName = fileName;
    }
    public String toString() {
        String valToReturn =  super.getName() + ", " + super.getAuthor().getName() + "," + fileName;
        return valToReturn;
    }
}
