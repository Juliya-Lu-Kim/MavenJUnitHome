package june_lu_kim.task3;

/*
Создайте класс, содержащий набор целых чисел.
В классе
должна быть реализована следующая функци-
ональность:
Сумма элементов набора;
Среднеарифметическое элементов набора;
Максимум из элементов набора;
Минимум из элементов набора.
Протестируйте все возможности созданного класса
с использованием JUnit.
 */

public class ArrayNumbers {

  //  сумма всех элементов набора

    public int sumArray(int ... array){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];
        }
        return sum;
    }

    //среднеарифметическое элементов набора

    public int average(int ... array){
        double average= 0;
        double sum = 0;
        if (array.length > 0){
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = sum/array.length;
        }
        return (int) average;
    }

    //максимум из элементов набора

    public int maxElement(int ... array){
        int max = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }

        }
        return max;
    }

    //минимум всех элементов набора

    public int minElement(int ... array){
        int min = 1000;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
