package homework2.task1;

public class Cat {

    public String name;
    public String color;
    public String adres;
    public String weight;
    public int age;

    public Cat(String name) {
        this.name = name;
            adres = "Homeless";
            weight = "3.6-4.5 kg"; //Средний вес кота
        if (age == null) {

        }
    }

    public Cat(String name, String weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(String weight, String color, String adres) {
        this.color = color;
        this.adres = adres;
        this.weight = weight;
    }
}
