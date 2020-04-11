package homework7.task1;

import java.util.*;

public class Vocabulary {

    public static void main ( String[] args ) {
        Map<String, String> map = new HashMap<> ();
        map.put ( "june" , "Mike" );
        map.put ( "july" , "Artur" );
        map.put ( "august" , "Amaliya" );
        map.put ( "october" , "Jora" );
        map.put ( "november" , "Nastya" );
        map.put ( "september" , "Jora2" );
        map.put ( "december" , "Kristina" );
        map.put ( "january" , "Dyachenko" );
        map.remove ( "june" );
        map.remove ( "july" );
        map.remove ( "august" );
        System.out.println ( map );
    }
}