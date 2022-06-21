package spacetravel.seat;

public class MartianSeat extends Seat{
    public MartianSeat(int id,String name) {
        super(id,name);
    }

    @Override
    public void getMeal() {
        System.out.println("Martians get a meal!");
    }
}
