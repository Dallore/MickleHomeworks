package Homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример(поставьте между каждым знаком пробел!).");
        int n1 = scanner.nextInt();
        char sign = scanner.next().charAt(0);
        int n2 = scanner.nextInt();
        switch (sign) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("В вашем примере неизвестный знак...");
        }

    }
}

