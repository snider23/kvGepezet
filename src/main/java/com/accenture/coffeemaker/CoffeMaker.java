package com.accenture.coffeemaker;

public class CoffeMaker {

    private BeanTray beanTray;
    private ServeTray serveTray;
    protected Display display;

    public CoffeMaker(int beanTrayCapacity){
        this.beanTray= new BeanTray(beanTrayCapacity);
        this.serveTray= new ServeTray();
        this.display= new Display();
    }

    public void makeCoffee(){
        try {
            beanTray.checkAvailability();
            serveTray.checkAvailability();
            display.checkAvailability();

            beanTray.useBeans();
            serveTray.remveCup();

            display.showMessage("Your coffee is ready!");
            display.showMessage("Remaining cups of coffee that can be made: "+ getRemainingCups());

        } catch (CoffeeMakerException e) {
            display.showMessage(e.getMessage());
        }
    }

    public void refillBeanTray(){
        beanTray.refill();
        display.showMessage("BeanTray refilled");
        display.showMessage("Remaining cups of coffee that can be made: "+ getRemainingCups());
    }

    public void placeCupOnServeTray(){
        serveTray.placeCup();
        display.showMessage("Cup placed on ServeTray");
    }
    public int getRemainingCups(){
        return beanTray.getAmount();
    }
}
