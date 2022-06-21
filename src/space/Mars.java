package space;

public final class Mars extends RockyPlanet{
    private static Mars marsObject;

    private Mars() {}

    public static Mars getInstance(){
        //Instantiate object if not created
        if(marsObject==null){
            marsObject = new Mars();
        }
        return marsObject;
    }
}
