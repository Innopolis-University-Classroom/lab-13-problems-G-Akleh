package com.company;

import java.util.ArrayList;
import java.util.List;

class Playstaion {

    List<Observer<Game>> mObservers;

    public Playstaion() {
        this.mObservers = new ArrayList<>();
    }

    public void subscribe(Observer<Game> observer) {
        mObservers.add(observer);
    }

    public void notify(Game game) {
        mObservers.forEach(observer -> observer.update(game));
    }


}