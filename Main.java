public class Main {
    public static void main(String[] args) {
        Book book = new Book("Fight Club", 1996, "Chuck Palahnuik", 256);
        System.out.println("Название книги: " + book.title + "\nГод выпуска книги: " + book.releaseYear + "\nАвтор книги: " + book.author + "\nВ книге " + book.pages + " страниц.");
        System.out.println(Book.isBig(book.pages));
        System.out.println(book.matches("Chuck"));
        System.out.println("Цена книги: " + book.estimatePrice(book.pages) + " рублей, при 3-ех рублях за страницу.");

    }
}   