package com.terraform.map;

import com.badlogic.gdx.graphics.Texture;

public class MapManager {

	private GameMap gameMap;
	private MapRenderer mapRenderer;


	public MapManager(GameMap gameMap, MapRenderer mapRenderer) {
		this.gameMap = gameMap;
		this.mapRenderer = mapRenderer;
	}
	
	public int render(){
		return mapRenderer.render();
	}
	
	public void eventOn(int xIndex, int yIndex){

	}

	public int getTilesXAxis() {
		return gameMap.getTilesXAxis();
	}

	public int getTilesYAxis() {
		return gameMap.getTilesYAxis();
	}
	
	public void addTextureToGameMap(int x, int y, MapTile mapTile){
		gameMap.setValue(x, y, mapTile);
	}
}
