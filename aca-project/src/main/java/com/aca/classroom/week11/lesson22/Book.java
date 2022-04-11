package com.aca.classroom.week11.lesson22;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {

    private final String name;
    private final double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Set<Book> books = Set.of(
                new Book("effective", 54.99)
        );

        // strategy
        Set<Book> bookSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.compareTo(o2);
            }
        });

        // Եթե գրում ենք List<?> ապա, չի գործելու add() մեթոդը

        Set<Book> books1 = new TreeSet<>();
        books1.add(new Book("effective", 54.99));
        books1.add(new Book("effective", 54.99));
        books1.add(new Book("effective", 54.99));
        books1.add(new Book("effective", 54.99));
        books1.add(new Book("apush@", 40));

        System.out.println(books1.size());

        if (true) {
            return;
        }
        for (Book book : books1) {
            System.out.println(book);
        }

        Book book = new Book(args[0], Double.parseDouble(args[1]));
        System.out.println("We are looking the book " + book);
        System.out.println(books.contains(book));

        String s1 = "ab";
        String s2 = "ab";
        String s3 = "Ab";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

    }

    @Override
    public String toString() {
        return "name " + name + " price " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (Double.compare(book.getPrice(), getPrice()) != 0) return false;
        return getName() != null ? getName().equals(book.getName()) : book.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Book o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            return Double.valueOf(this.price).compareTo(o.price);
        }
        return result;
    }
}
