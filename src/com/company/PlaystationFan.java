package com.company;

public class PlaystationFan implements Observer {
    @Override
    public void update(Game data) {
        if(data.title.equals("Playstation")) {
            System.out.println("Playstation fan here");
        }
    }
}

