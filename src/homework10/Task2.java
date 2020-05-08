package homework10;

import homework2.task2.Dog;

public class Task2 {
    public static void main ( String[] args ) {
        Dog myDog = new Dog(1);
        System.out.println (myDog);

        Settable<Dog> s = (obj, name, age) -> {
            obj;
        };
    }

    private static class Settable<T> {
    }
}
