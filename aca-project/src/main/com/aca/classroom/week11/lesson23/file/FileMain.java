package com.aca.classroom.week11.lesson23.file;

import java.io.*;

public class FileMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("D:/ACA/test.txt");

/*        final char b = '1';
        fileOutputStream.write(b);
        fileOutputStream.write('2');
        fileOutputStream.write('3');
        fileOutputStream.write('4');
        fileOutputStream.write('5');
        fileOutputStream.write('6');
        fileOutputStream.write('7');
        fileOutputStream.write('8');*/
/*
        fileOutputStream.write(1);
        fileOutputStream.write(Integer.MAX_VALUE);
        fileOutputStream.write(0xFF);
        fileOutputStream.write(0xAB);
        fileOutputStream.write(0xCD);

        fileOutputStream.close();*/

        Address address = new Address();
        address.setCountry("Armenia");
        address.setNumber(54);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeInt(123456789);
        objectOutputStream.writeDouble(123456789);
        objectOutputStream.writeFloat(123456789);
        objectOutputStream.writeObject(address);
        objectOutputStream.writeChars("Hello World");
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D:/ACA/test.txt");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readFloat());
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
        fileInputStream.close();
    }
}
