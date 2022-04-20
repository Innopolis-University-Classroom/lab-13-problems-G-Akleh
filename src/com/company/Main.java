package com.company;

public class Main {

    public static void main(String[] args) {
        PlaystationManager manager = new PlaystationManager();
        DarkSoulsFan DSfan= new DarkSoulsFan();
        PlaystationFan PSfan= new PlaystationFan();
        manager.subscribeToPlaystaion(DSfan);
        manager.subscribeToPlaystaion(PSfan);
        manager.addGame();
    }
}

