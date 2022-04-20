package com.company;

import java.util.Scanner;

public class FifaManager {

    private final Scanner scanner;
    private Fifa fifa;

    public FifaManager() {
        this.fifa = new Fifa();
        scanner = new Scanner(System.in);
    }

    public void addGame() {
        Game game = new Game();
        System.out.println("Enter the game date:");
        String date = scanner.nextLine();
        System.out.println("Enter the game plan:");
        String plan = scanner.nextLine();
        System.out.println("Enter place:");
        String place = scanner.nextLine();
        System.out.println("Enter the game ticket");
        String ticket = scanner.nextLine();
        game.date = date;
        game.plan = plan;
        game.place = place;
        game.ticket = ticket;
        fifa.notify(game);

    }

    public void subscribeToPlaystaion(Observer<Game> fan) {
        fifa.subscribe(fan);
    }
}
