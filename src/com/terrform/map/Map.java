package com.terrform.map;

public class Map {
	private int[][] map;
		
	public Map(){
		map = new int[12][10];
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
	
}
