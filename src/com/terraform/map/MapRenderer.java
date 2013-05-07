package com.terraform.map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MapRenderer {
	
	private GameMap map;
	private TileSheet tileSheet;
	private SpriteBatch spriteBatch;
	private int tilesX, tilesY;

	public MapRenderer(GameMap map, SpriteBatch spriteBatch) {
		this.map = map;
		this.spriteBatch = spriteBatch;
		tilesX = map.getTilesXAxis();
		tilesY = map.getTilesYAxis();
	}

	public void render(int screenX, int screenY) {
		if (map == null)
			return;
		
		spriteBatch.begin();
		addAllValidDrawsToBatch(screenX, screenY);
		spriteBatch.end();
		
	}

	private void addAllValidDrawsToBatch(float screenX, float screenY) {
		for (int i = 0; i < map.getTilesXAxis(); i++) {
			for (int j = 0; j < map.getTilesYAxis(); j++) {	
				
				Texture currentTileTexture = map.getValueAtIndex(i, j).getTexture();
				if (currentTileTexture == null) 
					continue;
				
				spriteBatch.draw(currentTileTexture, i*(screenX/tilesX), j*(screenY/tilesY));	
				
			}
		}
	}

	public void setTileSheet(TileSheet tileSheet) {
		this.tileSheet = tileSheet;
	}

	public TileSheet getTileSheet() {
		return this.tileSheet;
	}

}
