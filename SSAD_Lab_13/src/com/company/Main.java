package com.company;

public class Main {

    public static void main(String[] args) {
        FifaManager manager = new FifaManager();
        BarcelonaFan Bfan= new BarcelonaFan();
        RealMadridFan RMfan= new RealMadridFan ();
        manager.subscribeToPlaystaion(Bfan);
        manager.subscribeToPlaystaion(RMfan);
        manager.addGame();
    }
}
