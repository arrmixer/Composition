package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case thecase = new Case("220B","Dell","240", dimensions);
        Monitor theMoniter = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));
        MotherBoard theMotherboard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");
        PC thePC = new PC(thecase, theMoniter, theMotherboard);
        thePC.powerUp();
        Room livingRoom = new Room(10,10,10);
        Room bathroom = new Room(5,10,10);
        Room kitchenRoom = new Room(10, 10, 15);
        Room bedRoom = new Room(12,12,15);
        LivingRoom livingroom = new LivingRoom(livingRoom, "loveseat","sofa");
        livingroom.showLivingRoom(livingRoom);
        System.out.println(livingroom.getRoom().roomSquarefeet(livingRoom));
        Bathroom bathRoom = new Bathroom(bathroom, "bathtub", "toilet", "sink");
        bathRoom.showBathRoom(bathroom);
        Kitchen kitchen = new Kitchen(kitchenRoom,"stove", "refridgerator", "sink", "dishwasher");
        BedRoom bedroom = new BedRoom(bedRoom,"bed","dresser");
        House house = new House(bedroom, kitchen, livingroom, bathRoom);
        house.showHouse();
        System.out.println(bathRoom.getRoom().roomSquarefeet(bedRoom)+kitchen.getRoom().roomSquarefeet(kitchenRoom));

    }
}
