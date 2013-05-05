package com.terraform.map;

public class GameMap {
	private int[][] map;
	
	public GameMap(int xtile, int ytiles) {
		map = new int[xtile][ytiles];
	}

	public int getTilesXAxis() {
		return map.length;
	}

	public int getTilesYAxis() {
		return map[0].length;
	}
	
	public boolean isValidIndex(int x, int y) {
		return (x>=0 && x<getTilesXAxis() && y>=0 && y<getTilesYAxis());
	}
	
	public int getValueAtIndex(int x, int y){
		return map[x][y];
	}

	public int getTileCount() {
		return getTilesXAxis() * getTilesYAxis();
	}
	
}
