package homework8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task3 {

    public static void main ( String[] args ) throws Exception {

        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        String date = reader.readLine ();

        DateFormat intFormat = new SimpleDateFormat ( "MM/dd/yyyy" );
        Date parseDate = intFormat.parse ( date );

        String[] normalFormat = parseDate.toString ().split ( " " );
        System.out.println ( normalFormat[1].toUpperCase () + " " + normalFormat[2] + ", " + normalFormat[5] );

    }

}
