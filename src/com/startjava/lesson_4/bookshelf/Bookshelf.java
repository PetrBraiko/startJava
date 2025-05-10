package com.startjava.lesson_4.bookshelf;
import java.util.Arrays;

public class Bookshelf {
    private static final int MAX_BOOKS = 10;
    private Book[] books;
    private int bookCount;

    public Bookshelf() {
        this.books = new Book[MAX_BOOKS];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount >= MAX_BOOKS) {
            throw new IllegalStateException("Ошибка: шкаф заполнен. Невозможно добавить новую книгу.");
        }
        books[bookCount++] = book;
    }

    public Book findBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteBook(String title) {
        int index = -1;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException("Ошибка: книга '" + title + "' не найдена.");
        }

        // Сдвигаем книги влево
        System.arraycopy(books, index + 1, books, index, bookCount - index - 1);
        books[--bookCount] = null;
    }

    public void clear() {
        Arrays.fill(books, null);
        bookCount = 0;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, bookCount);
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getFreeShelves() {
        return MAX_BOOKS - bookCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В шкафу книг - ").append(bookCount).append(", свободно полок - ").append(getFreeShelves()).append("\n");

        int maxLength = 0;
        for (int i = 0; i < bookCount; i++) {
            maxLength = Math.max(maxLength, books[i].toString().length());
        }

        String shelfLine = "|" + "-".repeat(maxLength + 2) + "|\n";

        for (int i = 0; i < MAX_BOOKS; i++) {
            sb.append("|");
            if (i < bookCount) {
                String bookInfo = books[i].toString();
                sb.append(" ").append(bookInfo).append(" ".repeat(maxLength - bookInfo.length())).append(" ");
            } else {
                sb.append(" ".repeat(maxLength + 2));
            }
            sb.append("|\n").append(shelfLine);
        }

        return sb.toString();
    }
}
