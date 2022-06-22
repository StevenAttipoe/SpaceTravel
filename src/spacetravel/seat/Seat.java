package spacetravel.seat;

import spacetravel.Money.Money;

public class Seat {
    private int id;
    private String name;
    private Money amount;
    public Seat(int id,String name,Money amount) {
        this.name = name;
        this.id = id;
        this.amount=amount;
    }


    public void getMeal(){
        System.out.println("Everybody gets a meal!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
