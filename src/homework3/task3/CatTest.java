package homework3.task3;

public class CatTest {

    public static void main(String[] args) {

        Cat cat0 = new Cat("дедушка Вася");
        Cat cat1 = new Cat("бабушка Мурка");
        Cat cat2 = new Cat("папа Котофей", null, cat0);
        Cat cat3 = new Cat("мама Василиса", cat1, null);
        Cat cat4 = new Cat("сын Мурчик", cat3, cat2);
        Cat cat5 = new Cat("дочь Пушинка", cat3, cat2);

        System.out.println(cat0);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);

    }
}
