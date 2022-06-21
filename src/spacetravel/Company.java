package spacetravel;

import java.util.List;

public class Company {
    private String companyName;
    private List<SpaceShip> fleet;

    public Company(String companyName, List<SpaceShip> fleet) {
        this.companyName = companyName;
        this.fleet = fleet;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<SpaceShip> getFleet() {
        return fleet;
    }

    public void setFleet(List<SpaceShip> fleet) {
        this.fleet = fleet;
    }
}
