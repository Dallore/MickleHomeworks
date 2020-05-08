package homework4.task1;

public class Plane extends Transport {

    private String airplaneWings;

    public Plane ( String type ) {
        super ( type );
    }
        public void typeWorkSelection ( String obj ) {
            if (obj.equals ( "people" )) {
                System.out.println ( "Passenger plane" );
            }
            else if (obj.equals ( "Things" )) {
                System.out.println ( "freight plane" );
            }
        }
    }

