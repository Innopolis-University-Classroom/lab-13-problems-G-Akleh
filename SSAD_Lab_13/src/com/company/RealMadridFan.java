package com.company;

public class RealMadridFan implements Observer {
    @Override
    public void update(Game data) {
        if(data.place.equals("Santiago Bernabeu Stadium")){
            System.out.println("Yay a real madrid match!");
        }
    }
}
