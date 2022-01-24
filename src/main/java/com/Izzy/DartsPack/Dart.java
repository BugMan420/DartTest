package com.Izzy.DartsPack;

public class Dart {
    private String name;
    private int length;
    private int weight;
    private String flight;

    public Dart(){
        name = "BBT";
        length = 15;
        weight = 22;
        flight = "Parabol";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "You are using "+name+ " darts which are "+length+ " cms long, weigh "+ weight+"gs and are using "+flight+ " flights";
    }
}

