package homework2.task2;

public class Dog {

    private static int DOG_COUNT;
    private String name;
    private int age;

    public Dog(String name) {
        this.name = name;
        DOG_COUNT++;
    }

    public Dog(int age) {
        this.age = age;
        DOG_COUNT++;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        DOG_COUNT++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public static void printDogCount() {
        System.out.println("Dog count: " + DOG_COUNT);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }

}
