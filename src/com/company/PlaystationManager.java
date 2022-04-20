package com.company;

import java.util.Scanner;

public class PlaystationManager {

    private final Scanner scanner;
    private Playstaion playstaion;

    public PlaystationManager() {
        this.playstaion = new Playstaion();
        scanner = new Scanner(System.in);
    }

    public void addGame() {
        Game game = new Game();
        System.out.println("Enter the game titel:");
        String title = scanner.nextLine();
        System.out.println("Enter company");
        String company = scanner.nextLine();
        game.title = title;
        game.company = company;
        playstaion.notify(game);

    }

    public void subscribeToPlaystaion(Observer<Game> fan) {
        playstaion.subscribe(fan);
    }
}
