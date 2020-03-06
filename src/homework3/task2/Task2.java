package homework3.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String readLn = reader.readLine();

        }
    }
}
