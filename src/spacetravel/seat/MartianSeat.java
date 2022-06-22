package spacetravel.seat;

import spacetravel.Money.Money;

public class MartianSeat extends Seat{
    public MartianSeat(int id, String name, Money amount) {
        super(id,name,amount);
    }

    @Override
    public void getMeal() {
        System.out.println("Martians get a meal!");
    }
}
