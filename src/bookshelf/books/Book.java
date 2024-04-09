package bookshelf.books;

public class Book {
    private String title;
    private int pageCount;
    private Author author;

    public Book(String title, int pageCount, Author author) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 10) {
            System.out.println("Количество страниц не может быть меньше 10. Пожалуйста, введите корректное количество:");
        } else {
            this.pageCount = pageCount;
        }
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Автор не может быть null");
        }
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                '}';
    }
}
