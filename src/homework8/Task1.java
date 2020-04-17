package homework8;

import java.io.*;

public class Task1 {

    public static void main ( String[] args ) throws IOException {

        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        String sourceFileName = reader.readLine ();

        if (!new File ( sourceFileName ).exists ()) {
            System.out.println ( "Файл не существует." );
            sourceFileName = reader.readLine ();
        }

        String destinationFileName = reader.readLine ();

        FileInputStream fileInputStream = new FileInputStream ( sourceFileName );
        FileOutputStream fileOutputStream = new FileOutputStream ( destinationFileName );

        while (fileInputStream.available () > 0) {
            int data = fileInputStream.read ();
            fileOutputStream.write ( data );
        }

        fileInputStream.close ();
        fileOutputStream.close ();

    }
}
