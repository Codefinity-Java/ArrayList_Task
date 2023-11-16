package codefinity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookById(int id) {
        List<Book> booksToRemove = new ArrayList<>();
        for (Book book : books) {
            if (book.getId() == id) {
                booksToRemove.add(book);
            }
        }
        books.removeAll(booksToRemove);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksWithSpecifiedAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksWithSpecifiedAuthor.add(book);
            }
        }
        return booksWithSpecifiedAuthor;
    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        List<Book> booksPublishedAfterYear = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year){
                booksPublishedAfterYear.add(book);
            }
        }
        return booksPublishedAfterYear;
    }

    public void displayAllBooks() {
        System.out.println(books);
    }
}
