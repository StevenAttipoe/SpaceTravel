package SeatTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import spacetravel.SpaceShip;
import spacetravel.Spacer;
import spacetravel.seat.HumanSeat;
import spacetravel.seat.MartianSeat;
import spacetravel.seat.Seat;

import java.util.ArrayList;
import java.util.List;
public class SeatTest {
    ArrayList<Seat> seatList = new ArrayList<>(List.of(
            new HumanSeat(001,"Amy"),
            new HumanSeat(001,"Amy"),
            new HumanSeat(001,"Amy"),
            new HumanSeat(001,"Amy"),
            new HumanSeat(001,"Amy"),
            new HumanSeat(001,"Amy"),
            new HumanSeat(001,"Amy"),
            new HumanSeat(001,"Amy"),
            new HumanSeat(001,"Amy"),
            new MartianSeat(001,"XY001"),
            new MartianSeat(001,"XY001"),
            new MartianSeat(001,"XY001"),
            new MartianSeat(001,"XY001"),
            new MartianSeat(001,"XY001"),
            new MartianSeat(001,"XY001"),
            new MartianSeat(001,"XY001"),
            new MartianSeat(001,"XY001"),
            new MartianSeat(001,"XY001")
            ));


    @Test
    public void seatTypeTest(){
        Spacer spacer = new Spacer(seatList);
        HumanSeat humanSeat = new HumanSeat(001,"Amy");
        Assert.assertEquals("spacetravel.seat.HumanSeat",spacer.bookSeat(humanSeat));

        MartianSeat martianSeat = new MartianSeat(001,"XY001");
        Assert.assertEquals("spacetravel.seat.MartianSeat",spacer.bookSeat(martianSeat));
    }

    @Test
    public void seatCapacityTest(){
        Spacer spacer = new Spacer(seatList);
        HumanSeat humanSeat = new HumanSeat(001,"Amy");
        spacer.bookSeat(humanSeat);
        spacer.bookSeat(humanSeat);

        Assert.assertEquals("No seats available",spacer.bookSeat(humanSeat));
    }
}
