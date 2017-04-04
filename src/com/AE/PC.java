package com.AE;

/**
 * Created by Angel on 11/11/16.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // fancy graphics
       monitor.drawPixelAt(1200,50,"yellow");
    }


}
