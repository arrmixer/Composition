package com.AE;

/**
 * Created by Angel on 11/11/16.
 */
public class BedRoom {
    private Room bedRoom;
    private String bed;
    private String dresser;

    public BedRoom(Room bedRoom, String bed, String dresser) {
        this.bedRoom = bedRoom;
        this.bed = bed;
        this.dresser = dresser;
    }

    public void showBedRoom(Room bedRoom){

        System.out.println("the living room is " + getRoom().roomSquarefeet(bedRoom) + " feet squared.");
    }

    public Room getRoom() {
        return bedRoom;
    }

    public String getBed() {
        return bed;
    }

    public String getDresser() {
        return dresser;
    }
}
