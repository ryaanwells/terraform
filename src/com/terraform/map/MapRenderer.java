package com.terraform.map;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MapRenderer {
	
	private GameMap map;
	private TileSheet tileSheet;
	private SpriteBatch spriteBatch;
	private ShapeRenderer shapeRenderer;
	private int tilesX, tilesY;

	public MapRenderer(GameMap map, SpriteBatch spriteBatch, ShapeRenderer shapeRender) {
		this.map = map;
		this.spriteBatch = spriteBatch;
		this.shapeRenderer = shapeRender;
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

	private void addAllValidDrawsToBatch(int screenWidth, int screenHeight) {
		for (int i = 0; i < map.getNumberOfTilesInXDirection(); i++) {
			for (int j = 0; j < map.getNumberOfTilesInYDirection(); j++) {	
				MapTile currentTile = map.getValueAtIndex(i, j);
				TextureRegion currentTileTexture = tileSheet.getTileByOffset(currentTile.getSheetIndexX(),currentTile.getSheetIndexY());
				
				if (currentTileTexture == null) 
					continue;
				
				spriteBatch.draw(currentTileTexture, (float) i*(screenWidth*1.0f/tilesX), (float) j*(screenHeight*1.0f/tilesY), (float) (screenWidth*1.0f/tilesX), (float) (screenHeight*1.0f/tilesY));
				
			}
		}
	}
	
	
	public void drawGrid (int screenWidth, int screenHeight) {
		shapeRenderer.begin(ShapeType.Rectangle);
		for (int i = 0; i < map.getNumberOfTilesInXDirection(); i++) {
			for (int j = 0; j < map.getNumberOfTilesInYDirection(); j++) {	
				shapeRenderer.rect((float) i*(screenWidth*1.0f/tilesX), (float) j*(screenHeight*1.0f/tilesY), (float)(screenWidth*1.0f/tilesX), (float)(screenHeight*1.0f/tilesY));
			}
		}
		shapeRenderer.end();
	}

	public void setTileSheet(TileSheet tileSheet) {
		this.tileSheet = tileSheet;
	}

	public TileSheet getTileSheet() {
		return this.tileSheet;
	}

}
