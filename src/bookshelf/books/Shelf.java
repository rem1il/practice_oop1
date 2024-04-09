package bookshelf;

import bookshelf.books.Book;

import java.util.Arrays;

public class Shelf {
    private String color;
    private Book[] books;

    public Shelf(int capacity, String color) {
        this.color = color;
        this.books = new Book[capacity];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        System.out.println("Книге автора " + book.getAuthor().toString() + " не хватило места на полке");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "color='" + color + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
