package com.accenture.coffeemaker;

public class BeanTray extends CoffeeMakerModule{
    private int capacity;
    private int amount;

    public BeanTray(int capacity){
        this.capacity=capacity;
        this.amount=capacity;
    }

    @Override
    public void checkAvailability() throws CoffeeMakerException {
        if (amount<=0){
            throw new CoffeeMakerException("BeanTray is empty, please refill");
        }
    }
    public void useBeans(){
        this.amount-=1;
    }
    public void refill(){
        this.amount=capacity;
    }
    public int getAmount(){
        return amount;
    }
}
