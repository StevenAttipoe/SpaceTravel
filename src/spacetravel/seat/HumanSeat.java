package spacetravel.seat;

public class HumanSeat extends Seat{
    public HumanSeat(int id,String name) {
        super(id,name);
    }

    @Override
    public void getMeal() {
        System.out.println("Humans get a meal!");
    }
}
