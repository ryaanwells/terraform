package com.terraform.map;

public class GameMap {
	private MapTile[][] map;
	
	public GameMap(int xtile, int ytiles) {
		map = new MapTile[xtile][ytiles];
		initialiseMap();
	}

	private void initialiseMap() {
		for (int x = 0; x < getNumberOfTilesInXDirection(); x++) {
			for (int y = 0; y < getNumberOfTilesInYDirection(); y++) {
				map[x][y] = new MapTile();
			}
		}
	}

	public int getNumberOfTilesInXDirection() {
		return map.length;
	}

	public int getNumberOfTilesInYDirection() {
		return map[0].length;
	}
	
	public boolean isValidIndex(int x, int y) {
		return (x>=0 && x<getNumberOfTilesInXDirection() && y>=0 && y<getNumberOfTilesInYDirection());
	}
	
	public MapTile getValueAtIndex(int x, int y){
		return map[x][y];
	}

	public int getTileCount() {
		return getNumberOfTilesInXDirection() * getNumberOfTilesInYDirection();
	}

	public void setValue(int x, int y, MapTile mapTile) {
		map[x][y] = mapTile;	
	}
	
}
