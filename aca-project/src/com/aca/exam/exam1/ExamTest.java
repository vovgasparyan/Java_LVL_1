package com.aca.exam.exam1;

import java.util.Scanner;

public class ExamTest {

    public static void main(String[] args) {
        System.out.println("*** Ծրագրի նկարագրությունը ***");
        System.out.println("1․ 5 թվերից առավելագույնը");
        System.out.println("2․ 5 թվերից նվազագույնը");
        System.out.println("3․ 5 թվերից յուրաքանչյուրի արժեքի կրկնապատկում (այս քայլից հետո եթե օգտագործողը ընտրի " +
                "օրինակ 1 մշակումը, ապա պետք է տեսնի նախկին առավելագույն արժեքի կրկնապատիկը)");
        System.out.println("4․ 5 թվերի միջինը");
        System.out.println("5․ կպահանջի մուտքագրել N թիվ և կտպի N-րդ թիվը (եթե N-֊ը ունի անթույլատրելի արժեք, " +
                "ապա կանտեսի N-րդ թվի տպելը)");
        System.out.println("6․ 5 թվերից առավելագույնի և նվազագույնի տարբերությունը");
        System.out.println("7․ բոլոր 5 թվերում 0֊-ների քանակը");
        System.out.println("8․ ծրագրի ավարտ");
        System.out.println();

        Exam exam = new Exam();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք 5 հատ թիվ");
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        exam.setNumberOfArrays(array);
        System.out.println("Մուտքագրեք ծրագրի համարը, որի գործողությունը նկարագրվում է վերև հատվածում։");

        boolean startProgram = false;
        int checkFunctionNumber3 = 0;
        while (!startProgram) {
            int functionNumber = scanner.nextInt();

            switch (functionNumber) {
                case 1:
                    if (checkFunctionNumber3 == 3) {
                        System.out.println(exam.maxValue() * 2);
                    } else {
                        System.out.println(exam.maxValue());
                    }
                    break;
                case 2:
                    System.out.println(exam.minValue());
                    break;
                case 3:
                    checkFunctionNumber3 = 3;
                    System.out.println(exam.multiplyNumbers());
                    break;
                case 4:
                    System.out.println(exam.numbersAverage());
                    break;
                case 5:
                    System.out.println("Մուտքագրեք էլեմենտի համարը");
                    int elem = scanner.nextInt();
                    exam.printNElement(elem);
                    break;
                case 6:
                    System.out.println(exam.differenceMaxAndMinValues());
                    break;
                case 7:
                    System.out.println(exam.zeroValueCount());
                    break;
                case 8:
                    startProgram = true;
                    break;
                default:
                    System.out.println("Մուտքագրեք 1-ից 8-ը արժեքը");

            }

        }
    }

}
