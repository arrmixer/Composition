package com.AE;

/**
 * Created by Angel on 11/11/16.
 */
public class LivingRoom {
    private Room livingRoom;
    private String sofa;
    private String loveSeat;

    public LivingRoom(Room livingRoom, String sofa, String loveseat) {
        this.livingRoom = livingRoom;
        this.sofa = sofa;
        this.loveSeat = loveSeat;
    }

    public void showLivingRoom(Room livingRoom){

        System.out.println("the living room is " + getRoom().roomSquarefeet(livingRoom) + " feet squared.");
    }

    public Room getRoom() {
        return livingRoom;
    }

    public String getSofa() {
        return sofa;
    }

    public String getLoveSeat() {
        return loveSeat;
    }
}
