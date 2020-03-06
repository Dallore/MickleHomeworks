package homework3.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Task2 {

    public static class ConsoleReader {

        public static String readString() throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string = reader.readLine();
            return string;

        }

        public static int readInt() throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int numbers = Integer.parseInt(reader.readLine());
            return numbers;

        }

        public static double readDouble() throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double fractionalNumbers = Double.parseDouble(reader.readLine());
            return fractionalNumbers;

        }

        public static void readLn() throws IOException {

            while (true) {
                if (readString().equals("")) return;
            }
        }

        public static void main(String[] args) throws Exception {

            System.out.println("Напишите буквами(что-либо) и нажмите Enter");
            readString();
            System.out.println("Ждем повторного нажатия Enter...");
            readLn();
            System.out.println("Enter нажат"); //Это уже я просто проверял...

        }
    }
}




