package space;

public final class Earth extends RockyPlanet{
    private static Earth earthObject;

    private Earth() {}

    public static Earth getInstance(){
        //Instantiate object if not created
        if(earthObject==null){
            earthObject = new Earth();
        }
        return earthObject;
    }
}
