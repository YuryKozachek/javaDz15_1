package ru.netology.javaDz15_1;

public class Ticket implements Comparable<Ticket> {

    private int id;
    private int price;
    private String airportFrom;
    private String airportTo;
    private int travelTime;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public Ticket(int id, int price, String airportFrom, String airportTo, int travelTime) {
        this.id = id;
        this.price = price;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
