package com.aca.classroom.week9.lesson18.clone;

public class CloneMaker<T extends ConstructorClonable<T>> {

    public T printCloneAndPrint(T input)  {
        System.out.println(input);
        T newClonedObject = input.doClone();
        System.out.println(newClonedObject);
        return newClonedObject;
    }

    public static void main(String[] args) {
        CloneMaker<Car> carCloneMaker = new CloneMaker<>();
        carCloneMaker.printCloneAndPrint(new Car(54));

        CloneMaker<Computer> computerCloneMaker = new CloneMaker<>();
        computerCloneMaker.printCloneAndPrint(new Computer("Dell"));

     }
}
