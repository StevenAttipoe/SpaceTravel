package SeatTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import spacetravel.Money.HumanMoney;
import spacetravel.Money.MartianMoney;
import spacetravel.Spacer;
import spacetravel.seat.HumanSeat;
import spacetravel.seat.MartianSeat;
import spacetravel.seat.Seat;

import java.util.ArrayList;
import java.util.List;
public class SeatTest {

    @Test
    public void seatTypeTest(){
        ArrayList<Seat> seatList = new ArrayList<>(List.of(
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney())
        ));

        Spacer spacer = new Spacer(seatList);
        HumanSeat humanSeat = new HumanSeat(001,"Amy", new HumanMoney());
        Assert.assertEquals("HumanSeat",spacer.bookSeat(humanSeat));

        MartianSeat martianSeat = new MartianSeat(001,"XY001",new MartianMoney());
        Assert.assertEquals("No seats available",spacer.bookSeat(martianSeat));
    }

    @Test
    public void seatCapacityTest(){
        ArrayList<Seat> seatList = new ArrayList<>(List.of(
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new HumanSeat(001,"Amy", new HumanMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney()),
                new MartianSeat(001,"XY001", new MartianMoney())
                ));

        Spacer spacer = new Spacer(seatList);
        HumanSeat humanSeat = new HumanSeat(001,"Amy",new HumanMoney());
        spacer.bookSeat(humanSeat);
        spacer.bookSeat(humanSeat);

        Assert.assertEquals("No seats available",spacer.bookSeat(humanSeat));
    }
}
