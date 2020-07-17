package june_lu_kim.task1;

/*
Создайте класс по работе с дробями. В классе должна
быть реализована следующая функциональность:
Сложение дробей;
Вычитание дробей;
Умножение дробей;
Деление дробей.
Протестируйте все возможности созданного класса
с использованием JUnit.
 */

public class WorkWithFractions {

    // Сложение дробей
    public double sum(double a, double b) {
        return (a + b);
    }

    // Вычитание дробей
    public double subtraction(double a, double b) {
        return (b - a);
    }

    // Умножение дробей
    public double multiplication(double a, double b) {
        return (a * b);
    }

    // Деление дробей
    public double division(double a, double b) {
        return (b / a);
    }
}
