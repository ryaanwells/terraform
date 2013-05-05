package com.terraform.map;

import com.badlogic.gdx.graphics.Texture;

public class MapManager {

	private GameMap gameMap;
	private MapRenderer mapRenderer;


	public MapManager(GameMap gameMap, MapRenderer mapRenderer) {
		this.gameMap = gameMap;
		this.mapRenderer = mapRenderer;

		MapTile mapTile = new MapTile();
		mapTile.setTexture(new Texture(("assets/testTexture.bmp")));
		gameMap.setValue(10, 10, mapTile);
	}
	
	public int render(){
		return mapRenderer.render();
	}
	
	public void eventOn(int screenX, int screenY){

	}

	public int getTilesXAxis() {
		return gameMap.getTilesXAxis();
	}

	public int getTilesYAxis() {
		// TODO Auto-generated method stub
		return gameMap.getTilesYAxis();
	}
}
