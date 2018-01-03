package com.ja0ck5.dp.iterator;

/**
 * 不要使用具体类来编程，要优先使用抽象类和接口来编程
 */
public class Main {
    public static void main(String[] args) {
        // 将 bookShelf 里面的数组换成其他实现也不影响迭代器
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {// 这里的 while 并不依赖 BookShelf 的实现
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}