package homework3.task4;

public class Person {

    private String name;
    Account account;

    Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public class Account {

        private String password;

        Account(String password) {
            this.password = password;
        }

        void displayAccount() {
            System.out.println("------------------------------------------------");
            System.out.println(" Account Name: " + name + "   Password: " + password);
            System.out.println("------------------------------------------------");
        }
    }
}
