package org.example;

public class Main {

    public static void main(String[] args) {
        GameMap gameMap = new GameMap();
        ShowMap showMap =  new ShowMap(gameMap);
        showMap.show();

        GameService gameService = new GameService(gameMap, showMap);
        gameService.doResult();
    }
}