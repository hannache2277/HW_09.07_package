package ru.netology.services;
public class WorkCalcService {
    public int calculate(int income, int expenses, int threshold) {
        int timeOffFromWork = 0;
        int balance = 0;
        for (int i = 0;i < 12; i ++) {
            if (balance >= threshold) {
                //отдыхаем
                balance -= expenses;
                balance /= 3;
                timeOffFromWork++;

            } else {
                // работаем
                balance += income;
                balance -= expenses;

            }

        }

        return timeOffFromWork;
    }

}
