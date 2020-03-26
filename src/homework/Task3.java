package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String i = scanner.nextLine();
            String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(i);
            while (matcher.find()) {
                System.out.println("e-mail is true : " + matcher.group());
            }
        }
    }






