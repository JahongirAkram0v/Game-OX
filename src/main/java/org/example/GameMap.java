package org.example;

public class GameMap {

    private final int tableEdge;
    private final int[][] map;

    public GameMap() {
        this.tableEdge = 19;
        this.map = new int[][]{
                {11, 9, 9, 9, 9, 9, 9, 9, 2, 7, 2, 9, 9, 9, 9, 9, 9, 9, 11},
                {10, 0, 0, 0, 0, 0, 0, 0, 8, 1, 8, 0, 0, 0, 0, 0, 0, 0, 10},
                {10, 0, 0, 0, 0, 0, 2, 7, 2, 3, 2, 7, 2, 0, 0, 0, 0, 0, 10},
                {10, 0, 0, 0, 0, 0, 8, 1, 4, 1, 4, 1, 8, 0, 0, 0, 0, 0, 10},
                {10, 0, 0, 0, 2, 7, 2, 3, 2, 3, 2, 3, 2, 7, 2, 0, 0, 0, 10},
                {10, 0, 0, 0, 8, 1, 4, 1, 4, 1, 4, 1, 4, 1, 8, 0, 0, 0, 10},
                {10, 0, 2, 7, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 7, 2, 0, 10},
                {10, 0, 8, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 8, 0, 10},
                 {2, 7, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 7, 2},
                 {8, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 8},
                 {2, 7, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 7, 2},
                {10, 0, 8, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 8, 0, 10},
                {10, 0, 2, 7, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 7, 2, 0, 10},
                {10, 0, 0, 0, 8, 1, 4, 1, 4, 1, 4, 1, 4, 1, 8, 0, 0, 0, 10},
                {10, 0, 0, 0, 2, 7, 2, 3, 2, 3, 2, 3, 2, 7, 2, 0, 0, 0, 10},
                {10, 0, 0, 0, 0, 0, 8, 1, 4, 1, 4, 1, 8, 0, 0, 0, 0, 0, 10},
                {10, 0, 0, 0, 0, 0, 2, 7, 2, 3, 2, 7, 2, 0, 0, 0, 0, 0, 10},
                {10, 0, 0, 0, 0, 0, 0, 0, 8, 1, 8, 0, 0, 0, 0, 0, 0, 0, 10},
                {11, 9, 9, 9, 9, 9, 9, 9, 2, 7, 2, 9, 9, 9, 9, 9, 9, 9, 11}
        };
    }

    public void addMapValue(int y, int x, int value) {
        this.map[y][x] = this.map[y][x] + value;
    }

    public int getMapValue(int y, int x){
        return this.map[y][x];
    }

    public int getTableEdge() {
        return this.tableEdge;
    }
}
