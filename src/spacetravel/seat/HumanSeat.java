package spacetravel.seat;

import spacetravel.Money.Money;

public class HumanSeat extends Seat{
    public HumanSeat(int id, String name, Money amount) {
        super(id,name,amount);
    }

    @Override
    public void getMeal() {
        System.out.println("Humans get a meal!");
    }
}
