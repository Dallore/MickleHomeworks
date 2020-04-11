package homework;

import java.util.Scanner;

public class Task2 {

    public void main ( String[] args ) {



    }


    public static void Calculation ( int n1 , char sign , int n2 ) {

        switch (sign) {
            case '+':
                System.out.println ( n1 + n2 );
                break;
            case '-':
                System.out.println ( n1 - n2 );
                break;
            case '*':
                System.out.println ( n1 * n2 );
                break;
            case '/':
                System.out.println ( n1 / n2 );
                break;
            default:
                System.out.println ( "В вашем примере неизвестный знак..." );

        }
    }
}

