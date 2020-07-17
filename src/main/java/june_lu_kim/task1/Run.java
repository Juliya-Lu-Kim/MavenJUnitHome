package june_lu_kim.task1;

public class Run {
    public static void main(String[] args) {
        WorkWithFractions workWithFractions = new WorkWithFractions();
        System.out.println("Сумма: " + workWithFractions.sum(3.5, 1.2));
        System.out.println("Вычитание: " + workWithFractions.subtraction(1.2, 3.5));
        System.out.println("Умножение: " + workWithFractions.multiplication(3.5, 1.2));
        System.out.println("Деление: " + workWithFractions.division(0.2, 5.0));

    }
}
