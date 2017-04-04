package com.AE;

/**
 * Created by Angel on 11/11/16.
 */
public class Room {
    private int width;
    private int heigth;
    private int length;

    public Room(int width, int heigth, int length) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }

    public int roomSquarefeet(Room room){
        return width*heigth*length;


    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getLength() {
        return length;
    }
}
