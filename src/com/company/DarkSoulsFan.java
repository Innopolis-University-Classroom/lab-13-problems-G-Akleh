package com.company;

public class DarkSoulsFan implements Observer {
    @Override
    public void update(Game data) {
        if(data.title.equals("Dark Souls")) {
            System.out.println("Dark souls fan here");
        }
    }
}
