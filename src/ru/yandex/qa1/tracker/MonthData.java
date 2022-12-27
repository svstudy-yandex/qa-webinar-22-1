package ru.yandex.qa1.tracker;

public class MonthData {
    int[] days = new int[30];

    //...

    //Счетчик лучшей серии
    int bestSeries(int goalByStepsPerDay) {
        // серия - идущие подряд дни, где кол-во пройденных шагов было больше цели (goalByStepsPerDay)
        int bestSession = 0; // длина текущей серии
        int countBest = 0; // максимальная длина серии
        for (int i = 0; i < 30; i++) {
            // поиск максимальной серии
        }
        return countBest;
    }
}
