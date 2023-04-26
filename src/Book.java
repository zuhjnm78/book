public class Book {
    private String title;
    private Author author;
    private String publicationsYear;


    public Book(String title, Author author, String publicationsYear) {
        this.title = title;
        this.author = author;
        this.publicationsYear = publicationsYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPublicationsYear() {
        return this.publicationsYear;
    }

    public void setPublicationsYear(String publicationsYear) {
        this.publicationsYear = publicationsYear;
    }
    @Override
    public String toString(){
        return this.title + this.author + this.publicationsYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationsYear == book.publicationsYear &&
                java.util.Objects.equals(title, book.title) &&
                java.util.Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationsYear);
    }

}
