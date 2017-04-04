package com.AE;

/**
 * Created by Angel on 11/11/16.
 */
public class Kitchen {
    private Room kitchen;
    private String stove;
    private String refridgerator;
    private String sink;
    private String Dishwasher;

    public Kitchen(Room kitchen, String stove, String refridgerator, String sink, String dishwasher) {
        this.kitchen = kitchen;
        this.stove = stove;
        this.refridgerator = refridgerator;
        this.sink = sink;
        Dishwasher = dishwasher;
    }

    public void showKitchen(Room room){

        System.out.println("the Kitchen is " + getRoom().roomSquarefeet(room) + " feet squared.");
    }

    public Room getRoom() {
        return kitchen;
    }

    public String getStove() {
        return stove;
    }

    public String getRefridgerator() {
        return refridgerator;
    }

    public String getSink() {
        return sink;
    }

    public String getDishwasher() {
        return Dishwasher;
    }
}
