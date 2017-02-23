package com.nabrissa;

/**
 * Created by lucasjcastro on 23/2/17.
 */
public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 20) {
            changeGear(1);
        } else if (newVelocity > 20 && newVelocity <= 40) {
            changeGear(2);
        } else if (newVelocity > 40 && newVelocity <= 60) {
            changeGear(3);
        } else if (newVelocity > 60 && newVelocity <= 80) {
            changeGear(4);
        } else {
            changeGear(5);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }

}
