package space;

public class Pluto extends CelestialBody{
    private boolean isAlien;

    public Pluto(boolean supportsLife, boolean canLand, boolean isAlien) {
        super(supportsLife, canLand);
        this.isAlien = isAlien;
    }

    public void getInfo(boolean isAlien){
        if(isAlien){

        }
    }

}
