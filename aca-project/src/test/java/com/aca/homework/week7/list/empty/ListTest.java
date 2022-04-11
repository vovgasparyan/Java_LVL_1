package com.aca.homework.week7.list.empty;

class ListTest {

    public static void main(String[] args) {

        String green = "\u001B[32m";
        String white = "\u001B[38m";

        List list1 = new FixedSizeList();
        System.out.println(green + "Examples for 'list1'");
        System.out.println(white + listIsEmpty(list1));

        list1.add("First text");
        list1.add(2000);
        list1.add("Second text");
        System.out.println(white + listIsEmpty(list1));
        System.out.println(white + "The '1' element of list is " + list1.get(1));
        System.out.println(white + "The '99' element of list is " + list1.get(98));

        List list2 = List.ofFixedSize();
        System.out.println(green + "\nExamples for 'list2'");
        System.out.println(white + listIsEmpty(list2));
        list2.add("One");
        list2.add(2);
        list2.add(3);
        list2.add("Four");
        list2.add("Five");
        list2.add("Six");
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add("Ten");
        list2.add("Five");

        System.out.println(white + listIsEmpty(list2));
        System.out.println(white + "The '8' element of list is " + list2.get(7));

        List list3 = List.ofEmpty();
        System.out.println(green + "\nExamples for 'list3'");
        list3.add("Something");


    }

    public static String listIsEmpty(List list) {
        if (list.isEmpty()) {
            return "List is empty";
        }
        return "List has " + list.size() + " elements";
    }

}