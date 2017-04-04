package com.AE;

/**
 * Created by Angel on 11/11/16.
 */
public class House {
    private BedRoom bedRoom;
    private Kitchen kitchen;
    private LivingRoom livingRoom;
    private Bathroom bathroom;

    public House(BedRoom bedRoom, Kitchen kitchen, LivingRoom livingRoom, Bathroom bathroom) {
        this.bedRoom = bedRoom;
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
        this.bathroom = bathroom;
    }

    public void showHouse(){
        System.out.println("this house has " + bedRoom + "," + kitchen + "," + livingRoom + ", and a " + bathroom + ".");

    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }
}
