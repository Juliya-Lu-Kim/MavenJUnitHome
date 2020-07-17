package june_lu_kim.task2;

/*
Задание 2
Создайте класс Калькулятор. В классе должна быть
реализована следующая функциональность:
Сложение двух чисел;
Вычитание двух чисел;
Умножение двух чисел;
Деление двух чисел;
Максимум из двух чисел;
Минимум из двух чисел;
Процент числа;
Возведение числа в степень.
Протестируйте все возможности созданного класса
с использованием JUnit.

 */

public class Calculator {

    // Сложение двух чисел
    public int sum(int a, int b) {
        return (a + b);
    }

    // Вычитание двух чисел
    public int subtraction(int a, int b) {
        return (b - a);
    }

    // Умножение двух чисел
    public int multiplication(int a, int b) {
        return (a * b);
    }

    // Деление двух чисел
    public int division(int a, int b) {
        return (b / a);
    }

    // Максимум из двух чисел
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    // Минимум из двух чисел
    public int min(int a, int b) {
        return Math.min(a, b);
    }

    // Процент числа
    public int percentNumb(int a, int percent) {
       int result = (a * percent) / 100;
        return result;
    }
    // Возведение числа в степень
    public double raisePower(int a, int pow){
        return Math.pow(a, pow);
    }


}
