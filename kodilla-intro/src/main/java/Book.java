public class Book {
    private String author;
    private String title;

    public  Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    Book book = Book.of ("Adam Mickiewicz", "Pan Tadeusz");
}