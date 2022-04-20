package com.company;

public class BarcelonaFan implements Observer {
    @Override
    public void update(Game data) {
        if(data.place.equals("Camp Nou Stadium")){
            System.out.println("Yay a Barcelona match!");
        }
    }
}
