package org.example;

import java.util.HashMap;

public class ShowMap {

    HashMap<Integer, Character> hashMap;
    GameMap gameMap;

    public ShowMap(GameMap gameMap) {
        this.gameMap = gameMap;
        this.hashMap = new HashMap<>();
        hashMap.put(MapValueStatus.SPACE, ' ');
        hashMap.put(MapValueStatus.VALUE, ' ');
        hashMap.put(MapValueStatus.CORNER, '*');
        hashMap.put(MapValueStatus.IN_ROW, ' ');
        hashMap.put(MapValueStatus.IN_COLUMN, ' ');
        hashMap.put(MapValueStatus.VALUE_O, 'O');
        hashMap.put(MapValueStatus.VALUE_X, 'X');
        hashMap.put(MapValueStatus.ROW, '-');
        hashMap.put(MapValueStatus.COLUMN, '|');
        hashMap.put(MapValueStatus.SPACE_ROW, ' ');
        hashMap.put(MapValueStatus.SPACE_COLUMN, ' ');
        hashMap.put(MapValueStatus.SPACE_CORNER, ' ');
    }

    public void show(){
        for(int i=0; i<gameMap.getTableEdge(); i++){
            for(int j=0; j<gameMap.getTableEdge(); j++){
                System.out.print(hashMap.get(gameMap.getMapValue(i, j)) + " ");
            }
            System.out.println();
        }
    }
}
