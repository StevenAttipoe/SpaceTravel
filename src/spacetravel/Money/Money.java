package spacetravel.Money;

public  class Money {
    private String name;
    private double exchangeValue;

    public Money(String name, double exchangeValue) {
        this.name = name;
        this.exchangeValue = exchangeValue;
    }

    public String getName() {
        return name;
    }

    public double getExchangeValue() {
        return exchangeValue;
    }
}
