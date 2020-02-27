package homework2.task2;

public class DogTest {
    public static void main(String[] args) {
        System.out.println("Looking for dogs...");
        Dog.printDogCount();
        System.out.println("__________________________");

        Dog dog0 = new Dog(1);
        Dog dog1 = new Dog("Tessa", 7);

        Dog.printDogCount();

        System.out.println(dog0);
        System.out.println(dog1);//Думаю, я смог переопределить метод toString...
    }
}
