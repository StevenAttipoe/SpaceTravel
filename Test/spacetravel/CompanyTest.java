package spacetravel;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompanyTest {

    Company spaceT = new Company("SpaceT",List.of(
            new Spacer(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship()
    ));
    Company turntablGalactic = new Company("turntablGalactic",List.of(
            new Spacer(),
            new Spacer(),
            new Spacer(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship()
    ));

    @Test
    public void totalSizeOfFleet(){
        Assert.assertEquals(20,spaceT.getFleet().size());
        Assert.assertEquals(22,turntablGalactic.getFleet().size());
    }

    @Test
    public void totalCapacity(){
        AtomicInteger totalCapacityOfSpaceT= new AtomicInteger();
        spaceT.getFleet().forEach(spaceShip -> totalCapacityOfSpaceT.addAndGet(spaceShip.getCapacity()));

        Assert.assertEquals(1680, totalCapacityOfSpaceT.get());

        AtomicInteger totalCapacityOfturntablGalactic= new AtomicInteger();
        turntablGalactic.getFleet().forEach(spaceShip -> totalCapacityOfturntablGalactic.addAndGet(spaceShip.getCapacity()));
        Assert.assertEquals(1700, totalCapacityOfturntablGalactic.get());
    }

    @Test
    public void totalSizeOfFleetWhereSafetyRatingGT4(){
        List<SpaceShip> combinedList =
                 Stream.of(spaceT.getFleet(),turntablGalactic.getFleet())
                         .flatMap(Collection::stream)
                         .collect(Collectors.toList());

        int count = (int) combinedList.stream()
                .filter(spaceShip -> spaceShip.getSafetyRating()>4)
                .mapToInt(spaceShip -> spaceShip.getCapacity())
                .sum();

        Assert.assertEquals(2000,count);
    }

    @Test
    public void fastestFleet(){
        List<SpaceShip> combinedList =
                Stream.of(spaceT.getFleet(),turntablGalactic.getFleet())
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());

        AtomicInteger maxSpeed = new AtomicInteger();
        combinedList.forEach(spaceShip -> maxSpeed.set(Math.max(maxSpeed.get(), spaceShip.getSpeed())));

        int countSpaceT = (int) spaceT.getFleet().stream()
                .filter(spaceShip -> spaceShip.getSpeed()== maxSpeed.get())
                .count();

        int countTurntablG = (int) turntablGalactic.getFleet().stream()
                .filter(spaceShip -> spaceShip.getSpeed()== maxSpeed.get())
                .count();

        String fastestFleet = (countSpaceT > countTurntablG) ? spaceT.getCompanyName()
                : turntablGalactic.getCompanyName();

        Assert.assertEquals(fastestFleet,"SpaceT");
    }

    @Test
    public void fastestFleetPostWarp(){
        List<SpaceShip> combinedList =
                Stream.of(spaceT.getFleet(),turntablGalactic.getFleet())
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());

        AtomicInteger maxSpeed = new AtomicInteger();
        combinedList.forEach(spaceShip ->
                maxSpeed.set(Math.max(maxSpeed.get(), spaceShip.getSpeed()))
        );

        int countSpaceT = (int) spaceT.getFleet().stream()
                .filter(spaceShip -> spaceShip.getSpeed()== maxSpeed.get())
                .count();

        int countTurntablG = (int) turntablGalactic.getFleet().stream()
                .filter(spaceShip -> spaceShip.getSpeed()== maxSpeed.get())
                .count();

        String fastestFleet = (countSpaceT > countTurntablG) ? spaceT.getCompanyName()
                : turntablGalactic.getCompanyName();

        Assert.assertEquals(fastestFleet,"SpaceT");
    }
//    @Test
//    public void warpshipTest(){
//        Warpship warpship = new Warpship();
//        Assert.assertEquals(1500,warpship.getSafetyRating());
//    }

}
