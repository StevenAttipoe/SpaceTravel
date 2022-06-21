package spacetravel.seat;

public class Seat {
    private int id;
    private String name;
    public Seat(int id,String name) {
        this.name = name;
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
    }

}
