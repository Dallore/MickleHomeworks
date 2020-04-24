package homework;


public class Task2 {

    public static void main ( String[] args ) {

        System.out.println ( Calculation ( 10 , '+' , 10 ) );
        System.out.println ( Calculation ( 10 , '-' , 10 ) );
        System.out.println ( Calculation ( 10 , '*' , 10 ) );
        System.out.println ( Calculation ( 10 , '/' , 10 ) );

    }

    public static int Calculation ( int n1 , char sign , int n2 ) {
        int a = 0;

        if (sign == '+') {
            a = n1 + n2;
        }

        if (sign == '-') {
            a = n1 - n2;
        }

        if (sign == '*') {
            a = n1 * n2;
        }

        if (sign == '/') {
            a = n1 / n2;
        }

        return a;
    }
}

