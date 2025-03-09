import java.sql.PreparedStatement;

public class Book {
    String title;
    int releaseYear;
    String author;
    int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;

    }

    public static boolean isBig(int pages) {
        if (pages > 500) {
            System.out.println("Это большая книга.");
            return true;
        } else {
            System.out.println("Это небольшая книга.");
            return false;
        }
    }

    public boolean matches(String word) {
        if (title.contains(word)) {
            System.out.println("Это подходит под описание.");
            return true;
        } else if (author.contains(word)) {
            System.out.println("Это подходит под описание.");
            return true;
        } else {
            System.out.println("Это не подходит под описание.");
            return false;
        }
    }
    public int estimatePrice(int pages){
        int price = 0;
        for(int i = 0; i < pages; i++){
            price += 3;
        }
        if(price < 250){
            price = 250;
        }
        return price;
    }


}
