package org.example;

import java.util.Random;
import java.util.Scanner;

public class GameService {

    private final GameMap gameMap;
    private final ShowMap showMap;
    private int s = 0;
    private int playerO = 0;
    private int player = 0;

    public GameService(GameMap gameMap,ShowMap showMap) {
        this.gameMap = gameMap;
        this.showMap = showMap;
    }

    public void doResult(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int r, y, x;
        while(s <= 41){
            r = random.nextInt(6) + 1;
            System.out.println(r);
            while (r > 0){
                y = scanner.nextInt();
                x = scanner.nextInt();
                r = move(y, x, r, gameMap);
                showMap.show();
            }
            player = 1-player;
        }
        System.out.println("O :" + playerO + ", X :" + (41 - playerO));
        scanner.close();
    }

    private int move(int y,  int x, int r, GameMap gameMap) {

        if(gameMap.getMapValue(y, x) == MapValueStatus.IN_ROW || gameMap.getMapValue(y, x) == MapValueStatus.IN_COLUMN){
            gameMap.addMapValue(y, x, 4);
            if(y % 2 == 0){
                checkGame(y - 1, x, gameMap);
                checkGame(y + 1, x, gameMap);
            } else {
                checkGame(y, x - 1, gameMap);
                checkGame(y, x + 1, gameMap);
            }
            return r - 1;
        }
        return r;
    }

    private void checkGame(int y, int x, GameMap gameMap) {
        if(
                gameMap.getMapValue(y-1, x) == MapValueStatus.ROW &&
                gameMap.getMapValue(y+1, x) == MapValueStatus.ROW &&
                gameMap.getMapValue(y, x-1) == MapValueStatus.COLUMN &&
                gameMap.getMapValue(y, x+1) == MapValueStatus.COLUMN &&
                    gameMap.getMapValue(y, x) == MapValueStatus.VALUE
        ) {
            this.playerO += (gameMap.getMapValue(y, x) == 4) ? 1 : 0;
            gameMap.addMapValue(y, x, 4+player);
            s += 1;
        }
    }
}
