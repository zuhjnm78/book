public class Book {
    private String title;
    private Author author;
    private int publicationsYear;


    public Book(String title, Author author, int publicationsYear) {
        this.title = title;
        this.author = author;
        this.publicationsYear = publicationsYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationsYear() {
        return this.publicationsYear;
    }

    public void setPublicationsYear(int publicationsYear) {
        this.publicationsYear = publicationsYear;
    }
}
