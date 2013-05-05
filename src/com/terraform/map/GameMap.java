package com.terraform.map;

public class GameMap {
	private MapTile[][] map;
	
	public GameMap(int xtile, int ytiles) {
		map = new MapTile[xtile][ytiles];
		initialiseMap();
	}

	private void initialiseMap() {
		for (int x = 0; x < getTilesXAxis(); x++) {
			for (int y = 0; y < getTilesYAxis(); y++) {
				map[x][y] = new MapTile();
			}
		}
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
	
	public MapTile getValueAtIndex(int x, int y){
		return map[x][y];
	}

	public int getTileCount() {
		return getTilesXAxis() * getTilesYAxis();
	}
	
}
