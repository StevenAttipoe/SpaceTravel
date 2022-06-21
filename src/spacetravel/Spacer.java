package spacetravel;

import spacetravel.seat.Seat;

import java.util.List;

public class Spacer extends SpaceShip{

    public Spacer() {
        super(20, 450, 4);
    }

    public Spacer(List<Seat> structureOfSeats) {
        super(20, 450, 4, structureOfSeats);
    }

//    public int getSpeed() {
//        return 450;
//    }
}
