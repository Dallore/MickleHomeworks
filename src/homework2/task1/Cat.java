package homework2.task1;

public class Cat {

    public String name;
    public String color;
    public String adres = "Homeless";
    public double weight = 4.5;
    public int age = 6;

    public Cat(String name) {
        this.name = name;

    }

    public Cat(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(double weight, String color, String adres) {
        this.color = color;
        this.adres = adres;
        this.weight = weight;
    }
}
