package spacetravel;

import spacetravel.seat.Seat;

import java.util.List;

public class Stardelino extends SpaceShip {

    public Stardelino() {
        super(80, 900, 8);
    }

    public Stardelino(List<Seat> structureOfSeats) {
        super(80, 900, 8,structureOfSeats);
    }
    public int getSpeed() {
        return 900;
    }
}
