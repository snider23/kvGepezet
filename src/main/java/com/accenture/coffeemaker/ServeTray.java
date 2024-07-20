package com.accenture.coffeemaker;

public class ServeTray extends CoffeeMakerModule {

    private boolean hasCup;

    public ServeTray() {
        this.hasCup = false;
    }

    @Override
    public void checkAvailability() throws CoffeeMakerException {
        if (!hasCup) {
            throw new CoffeeMakerException("ServeTray is empty. Please place a cup on the tray.");
        }
    }

    public void placeCup() {
        this.hasCup = true;
    }

    public void remveCup() {
        this.hasCup = false;
    }
}
