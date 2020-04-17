package homework;

import java.util.Scanner;

public class Task2 {

    public void main ( String[] args ) {

        System.out.println ( Calculation ( 10 , '+' , 10 ) );

    }


    public static double Calculation ( int n1 , char sign , int n2 ) {
        int a = 0;

        if (sign == '+') {
            a = n1 + n2;
            System.out.println (a);
        }
        return a;
    }
}

