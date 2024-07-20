package com.accenture.coffeemaker;

public class Display extends CoffeeMakerModule{
    @Override
    public void checkAvailability() throws CoffeeMakerException {

    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
