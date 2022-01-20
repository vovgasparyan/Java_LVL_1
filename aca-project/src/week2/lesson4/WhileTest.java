package week2.lesson4;

public class WhileTest {

    public static void main(String[] args) {

        long startMillis = System.currentTimeMillis();

        long nextDigit = 0;
        while (true) {
            long firstDigit = (System.currentTimeMillis() - startMillis) / 1000;
            if (firstDigit - nextDigit == 1) {
                System.out.println(firstDigit);
                nextDigit = firstDigit;
            }

        }
    }
}
