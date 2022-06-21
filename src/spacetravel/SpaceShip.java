package spacetravel;

import spacetravel.seat.HumanSeat;
import spacetravel.seat.MartianSeat;
import spacetravel.seat.Seat;

import java.util.List;

public class SpaceShip {
    private int capacity;
    private int speed;
    private int safetyRating;
    private List<Seat> structureOfSeats;

    public SpaceShip(int capacity, int speed, int safetyRating) {
        this.capacity = capacity;
        this.speed = speed;
        this.safetyRating = safetyRating;
    }
    public SpaceShip(int capacity, int speed, int safetyRating, List<Seat> structureOfSeats) {
        this.structureOfSeats = structureOfSeats;
        this.capacity = capacity;
        this.speed = speed;
        this.safetyRating = safetyRating;
    }

    public String bookSeat(HumanSeat humanSeat){
        if(structureOfSeats.size()!=getCapacity()){
            structureOfSeats.add(humanSeat);
            humanSeat.getMeal();
            return humanSeat.getClass().getName();
        } else{
            return "No seats available";
        }
    }

    public String bookSeat(MartianSeat martianSeat){
        if(structureOfSeats.size()!=getCapacity()){
            structureOfSeats.add(martianSeat);
            martianSeat.getName();
            return martianSeat.getClass().getName();
        }else{
            return "No seats available";
        }
    }

    public  int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }

}
