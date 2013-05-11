package com.terraform.map;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MapRenderer {
	
	private GameMap map;
	private TileSheet tileSheet;
	private SpriteBatch spriteBatch;
	private int tilesX, tilesY;

	public MapRenderer(GameMap map, SpriteBatch spriteBatch) {
		this.map = map;
		this.spriteBatch = spriteBatch;
		tilesX = map.getNumberOfTilesInXDirection();
		tilesY = map.getNumberOfTilesInYDirection();
	}

	public void render(int screenX, int screenY) {
		if (map == null)
			return;
		
		spriteBatch.begin();
		addAllValidDrawsToBatch(screenX, screenY);
		spriteBatch.end();
		
	}

	private void addAllValidDrawsToBatch(float screenX, float screenY) {
		for (int i = 0; i < map.getNumberOfTilesInXDirection(); i++) {
			for (int j = 0; j < map.getNumberOfTilesInYDirection(); j++) {	
				MapTile currentTile = map.getValueAtIndex(i, j);
				TextureRegion currentTileTexture = tileSheet.getTileByOffset(currentTile.getSheetIndexX(),currentTile.getSheetIndexY());
				
				if (currentTileTexture == null) 
					continue;
				
				spriteBatch.draw(currentTileTexture, i*(screenX/tilesX), j*(screenY/tilesY), 32, 32);
				
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
