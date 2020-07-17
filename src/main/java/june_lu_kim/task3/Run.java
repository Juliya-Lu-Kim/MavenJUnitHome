package june_lu_kim.task3;

public class Run {
    public static void main(String[] args) {
        ArrayNumbers arrayNumbers = new ArrayNumbers();

       // ArrayNumbers.sumArray();
        System.out.println("sum " + arrayNumbers.sumArray(12,23,12,34,22));
        System.out.println("average " + arrayNumbers.average(12,23,12,34,22));
        System.out.println("max " + arrayNumbers.maxElement(12,23,12,34,22));
        System.out.println("min " + arrayNumbers.minElement(12,23,12,34,22));
//        ArrayNumbers.average();
//        ArrayNumbers.maxNumber();
//        ArrayNumbers.minNumber();
    }
}
