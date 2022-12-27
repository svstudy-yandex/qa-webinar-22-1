package ru.yandex.qa1.tracker;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();

            int i = scanner.nextInt();
            if (i == 1) {
                // здесь будет логика команды 1
            } else if (i == 2) {
                // здесь будет логика команды 2
            } else if (i == 3) {
                // здесь будет логика команды 3
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu() {
        // Вывод доступных команд
    }
}
