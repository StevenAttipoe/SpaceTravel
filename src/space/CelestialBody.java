package space;

public class CelestialBody {
    private boolean supportsLife;
    private boolean canLand;

    public CelestialBody(boolean supportsLife, boolean canLand) {
        this.supportsLife = supportsLife;
        this.canLand = canLand;
    }

    public boolean isSupportsLife() {
        return supportsLife;
    }

    public boolean isCanLand() {
        return canLand;
    }
}
