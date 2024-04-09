package bookshelf;

import bookshelf.books.Author;
import bookshelf.books.Book;
import grocery.Product;
import grocery.MyProducts;

public class Application {
    public static void main(String[] args) {
        // создаем авторов
        Author author1 = new Author("John", "Tompson");
        Author author2 = new Author("Tom", "Cruse");
        Author author3 = new Author("Alice", "Smith");

        // создаем книги
        Book book1 = new Book("Java Basic", 200, author1);
        Book book2 = new Book("Advanced Java", 350, author2);
        Book book3 = new Book("Python Programming", 300, author3);
        Book book4 = new Book("C# Programming", 250, author1);
        Book book5 = new Book("Web Development", 400, author2);
        Book book6 = new Book("Database Management", 280, author3);
        Book book7 = new Book("Algorithms", 320, author1);

        // создаем книжные полки
        Shelf shelf1 = new Shelf(5, "коричневый");
        Shelf shelf2 = new Shelf(3, "белый");

        // добавляем книги на полки
        shelf1.addBook(book1);
        shelf1.addBook(book2);
        shelf1.addBook(book3);
        shelf1.addBook(book4);
        shelf2.addBook(book5);
        shelf2.addBook(book6);
        shelf2.addBook(book7);

        // выводим информацию о полках
        System.out.println("Первая полка: " + shelf1);
        System.out.println("Вторая полка: " + shelf2);

        // создаем продукты
        Product product1 = new Product("Яблоко", 0.5, 0.2, 10, 50);
        Product product2 = new Product("Молоко", 3.2, 3.5, 4.7, 60);
        Product product3 = new Product("Хлеб", 6.0, 2.5, 45);
        Product product4 = new Product("Рыба", 20.0, 5.0);

        // создаем список разрешенных продуктов
        MyProducts myProducts = new MyProducts(30.0, 10.0, 50.0, 300);

        // добавляем продукты в список
        myProducts.addProduct(product1);
        myProducts.addProduct(product2);
        myProducts.addProduct(product3);
        myProducts.addProduct(product4);

        // выводим список продуктов
        myProducts.printProducts();
    }
}
