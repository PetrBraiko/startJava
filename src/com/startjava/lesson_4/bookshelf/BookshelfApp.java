package com.startjava.lesson_4.bookshelf;
import java.util.Scanner;

public class BookshelfApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printWelcomeMessage();
        Bookshelf bookshelf = new Bookshelf();

        while (true) {
            if (bookshelf.getBookCount() == 0) {
                System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            }

            printMenu();
            String choice = getUserInput("Введите номер пункта меню: ");

            switch (choice.toLowerCase()) {
                case "save":
                    saveBook(bookshelf);
                    break;
                case "delete":
                    deleteBook(bookshelf);
                    break;
                case "clear":
                    clearBookshelf(bookshelf);
                    break;
                case "exit":
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Ошибка: введите номер из списка:");
            }

            waitForEnter();
            System.out.println(bookshelf);
        }
    }

    private static void printWelcomeMessage() {
        String welcomeMessage = "Добро пожаловать в программу 'Книжный шкаф'!";
        printWithTypewriterEffect(welcomeMessage);
    }

    private static void printMenu() {
        String menu = """
                Меню:
                save - Добавить книгу
                delete - Удалить книгу
                clear - Очистить шкаф
                exit - Завершить
                """;
        System.out.print(menu);
    }

    private static void saveBook(Bookshelf bookshelf) {
        try {
            String author = getUserInput("Введите автора книги: ");
            String title = getUserInput("Введите название книги: ");
            int year = Integer.parseInt(getUserInput("Введите год издания книги: "));
            bookshelf.addBook(new Book(author, title, year));
            System.out.println("Книга успешно добавлена.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат года издания.");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteBook(Bookshelf bookshelf) {
        String title = getUserInput("Введите название книги для удаления: ");
        try {
            bookshelf.deleteBook(title);
            System.out.println("Книга успешно удалена.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void clearBookshelf(Bookshelf bookshelf) {
        bookshelf.clear();
        System.out.println("Шкаф очищен.");
    }

    private static String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static void waitForEnter() {
        System.out.println("Для продолжения работы нажмите клавишу <Enter>");
        scanner.nextLine();
    }

    private static void printWithTypewriterEffect(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}