public class Author {
    private String name;
    private boolean isPreferred;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPreferred() {
        return isPreferred;
    }

    public void setPreferred(boolean preferred) {
        isPreferred = preferred;
    }
    Author(String name) {
        this.name = name;
        this.isPreferred = true;
    }
    public String toString () {
        return name;
    }
}
