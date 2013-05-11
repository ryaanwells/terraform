package com.terraform.map;


public class MapManager {

	private GameMap gameMap;
	private MapRenderer mapRenderer;

	public MapManager(GameMap gameMap, MapRenderer mapRenderer, int screenX, int screenY) {
		this.gameMap = gameMap;
		this.mapRenderer = mapRenderer;
	}
	
	public void render(int screenWidth, int screenHeight){
		mapRenderer.render(screenWidth, screenHeight);
		mapRenderer.drawGrid(screenWidth, screenHeight);
	}
	
	public void eventOn(int xIndex, int yIndex){

	}

	public int getNumberOfTilesInXDirection() {
		return gameMap.getNumberOfTilesInXDirection();
	}

	public int getNumberOfTilesInYDirection() {
		return gameMap.getNumberOfTilesInYDirection();
	}
	
	public void addTextureToGameMap(int x, int y, MapTile mapTile){
		gameMap.setValue(x, y, mapTile);
	}
}
