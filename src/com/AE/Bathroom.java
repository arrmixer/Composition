package com.AE;

/**
 * Created by Angel on 11/11/16.
 */
public class Bathroom {
    private Room bathRoom;
    private String bathTub;
    private String toilet;
    private String sink;

    public Bathroom(Room bathRoom, String bathTub, String toilet, String sink) {
        this.bathRoom = bathRoom;
        this.bathTub = bathTub;
        this.toilet = toilet;
        this.sink = sink;
    }

    public void showBathRoom(Room room){

        System.out.println("the Bathroom is " + getRoom().roomSquarefeet(room) + " feet squared.");
    }

    public Room getRoom() {
        return bathRoom;
    }

    public String getBathTub() {
        return bathTub;
    }

    public String getToilet() {
        return toilet;
    }

    public String getSink() {
        return sink;
    }
}
