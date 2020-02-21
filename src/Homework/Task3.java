package Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {


    public static void main(String[] args) {
        System.out.println("Enter Email");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(i);

        System.out.println("Your Email entered - " + matcher.lookingAt() + "!");


    }

}






