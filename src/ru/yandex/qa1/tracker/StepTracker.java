package ru.yandex.qa1.tracker;

import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData;

    StepTracker(Scanner scan) {
        scanner = scan;

        monthToData = new MonthData[12];
        for (int i = 0; i < 12; i++) {
            monthToData[i] = new MonthData();
        }
    }

    //Добавление количества шагов за определённый день
    void addNewNumberStepsPerDay() {
        // 1. получить значения номера месяца, номера дня и количества шагов от пользователя и сохранить их в переменные

        // 2. Использовать эти переменные, чтобы обновить значение (сохранить данные)
        // 2.1 Получить "месяц" (данные по месяцу) по его номеру
        // 2.2 В "месяце" обновить значение кол-ва шагов по номеру дня

        //MonthData monthData = ...
        //monthData.days[...] = ...
    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        printMonth();
        // ввод и проверка номера месяца

        //MonthData monthData = // получение соответствующего месяца
        //int sumSteps = // получение суммы шагов за месяц
            // вывод общей статистики
            // вывод суммы шагов за месяц
            // вывод максимального пройденного количества шагов за месяц
            // подсчёт и вывод максимального пройденного количества шагов за месяц
            // вывод пройденной за месяц дистанции в км
            // вывод количества сожжённых килокалорий за месяц
            // вывод лучшей серии
            System.out.println(); //дополнительный перенос строки
    }

    void printMonth() {
        // TODO
    }
}
