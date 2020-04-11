package homework4.task1;

public class Train extends Transport {

    private String RailwaysDrive;

    public Train ( String type ) {
        super ( type );
    }

    public void typeWorkSelection ( String object ) {
        if (object.equals ( "people" )) {
            System.out.println ( "Passenger train" );
        }
        else if (object.equals ( "Things" )) {
            System.out.println ( "freight train" );
        }
    }
}
