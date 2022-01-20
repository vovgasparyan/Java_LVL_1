package lesson1.com.company;

public class Main {

    public static void main(String[] args) {
        int i1 = 564;
        int i2 = 654;
        int i3 = 6584;
        int i4 = 6584;
        int i5 = 6888554;



        long max1 = max(15, 98);
        long max2 = max(max1, 45);
        long max3 = max(max2, 120);

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);

        // homework minimum tiv
        /*

         */
    }

    public static long max(long i1, long i2) {
        if (i1 > i2) {
            return i1;
        }
        else {
            return i2;
        }
    }
}
