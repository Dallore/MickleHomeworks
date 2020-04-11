package homework4.task1;

public class Transport {
    private String type;
    private String typeWork;
    private String mark;
    private String movement;

    public Transport ( String type ) {
        this.type = type;
    }

    public String isType ( String surface ) {
        if (surface.equals ( "water" )) {
            System.out.println ( "Water transport" );
        }
        else if (surface.equals ( "air" )) {
            System.out.println ( "Air transport" );
        }
        else if (surface.equals ( "ground" )) {
            System.out.println ( "Ground transport" );
        }
        return surface;
    }
}