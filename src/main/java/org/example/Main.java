package org.example;

public class Main {
    // Завдання 1:
    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Неможливо ділити на нуль!");
            return;
        }
        int result = a / b;
        System.out.println("Результат ділення " + a + " на " + b + " = " + result);

        // Відповіді на запитання:
        // 1. Метод div має параметри:
        // - тип: int a
        // - тип: int b
        // 2. Метод div не повертає значення, тобто його тип повернення - void.
    }

    // Завдання 2:
    public static double addTenPercent(int number) {
        double result = number * 1.1; // Збільшуємо число на 10%
        return result; // Повертаємо результат
    }

    public static void main(String[] args) {
        // Виклик методу div
        div(10, 2); // Приклад ділення 10 на 2

        // Виклик методу addTenPercent
        int originalNumber = 100;
        double result = addTenPercent(originalNumber);
        System.out.println("Початкове число: " + originalNumber);
        System.out.println("Число після збільшення на 10%: " + result);

        // Відповіді на запитання:
        //1. Метод addTenPercent має параметр: тип: int number
        //2. Метод addTenPercent повертає значення, тобто його тип повернення - double.
    }
}
