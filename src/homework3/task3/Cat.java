package homework3.task3;

public class Cat {

    private String name;
    private Cat mother;
    private Cat father;

    Cat(String name) {
        this.name = name;
    }

    Cat(String name, Cat mother, Cat father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        if ((mother == null) && (father == null))
            return "Cat name is " + name + ", no mother, no father";
        else if ((mother == null))
            return "Cat name is " + name + ", no mother, father is " + father.name;
        else if (father == null)
            return "Cat name is " + name + ", mother is " + mother.name + ", no father";
        else
            return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;

    }
}

