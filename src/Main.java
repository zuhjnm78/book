public class Main {
    public static void main(String[] args) {

        Author king = new Author("Stephen ","King");
        Author schildt = new Author("Herbert ", "Schildt");
        Book fairyTale = new Book("Fairy Tale ", king, 2022);
        Book javaProgramming = new Book("JAVA Programming ", schildt, 2007);
        javaProgramming.setPublicationsYear(2014);
        System.out.println(javaProgramming.getTitle() + schildt.getName() + schildt.getLastName() + " "
                +javaProgramming.getPublicationsYear());
        System.out.println(fairyTale.getTitle() + king.getName() + king.getLastName() + " " + fairyTale.getPublicationsYear());



    }
}
