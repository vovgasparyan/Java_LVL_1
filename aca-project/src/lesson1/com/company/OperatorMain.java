package lesson1.com.company;

public class OperatorMain {

    public static void main(String[] args) {

        boolean condition1 = (isRedCar() || isBMW());
        boolean condition2 = isOld();

        if ((isRedCar() || isBMW()) && isOld()) {
            System.out.println("text1");
        }
    }

    public static boolean isRedCar() {
        return true;
    }

    public static boolean isBMW() {
        return true;
    }

    public static boolean isOld() {
        return false;
    }
}
