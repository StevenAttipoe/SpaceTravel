package spacetravel;

import spacetravel.seat.Seat;

import java.util.List;

public class Bulletship extends SpaceShip{

    public Bulletship() {
        super(100, 1800, 2);
    }

    public Bulletship(List<Seat> structureOfSeats) {
        super(100, 1800, 2,structureOfSeats);
    }

//    public int getSpeed() {
//        return 1800;
//    }

    @Override
    public void setSpeed(int speed) {
        if(speed>900 && speed<2200) {
            super.setSpeed(speed);
        }
    }
}
