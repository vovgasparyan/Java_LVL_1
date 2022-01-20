package week2.lesson5;

public class TimerTest {

    public static void main(String[] args) {

        long startMillis = System.currentTimeMillis();
        long secondsThatIPrinted = 0;

        while (true) {

            long currentMillis = System.currentTimeMillis();
            long secondsThatIWantToPrint = (currentMillis - startMillis) / 1000;

            if (secondsThatIPrinted != secondsThatIWantToPrint) {
                System.out.println(secondsThatIWantToPrint);
                secondsThatIPrinted = secondsThatIWantToPrint;
            }
        }
    }
}
