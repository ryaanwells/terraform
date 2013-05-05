package com.terraform.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MapRenderer {
	
	private GameMap map;
	private SpriteBatch spriteBatch;

	public MapRenderer(GameMap map, SpriteBatch spriteBatch) {
		this.map = map;
		this.spriteBatch = spriteBatch;
	}

	public int render() {
		if (map == null) {
			return 0;
		}
		
		int drawn = 0;
		
		spriteBatch.begin();
		drawn = addAllValidDrawsToBatch(drawn);
		spriteBatch.end();
		
		return drawn;
	}

	private int addAllValidDrawsToBatch(int drawn) {
		for (int i = 0; i < map.getTilesXAxis(); i++) {
			for (int j = 0; j < map.getTilesYAxis(); j++) {	
				
				Texture currentTileTexture = map.getValueAtIndex(i, j).getTexture();
				if (currentTileTexture == null) 
					continue;
				
				spriteBatch.draw(currentTileTexture, i, j);	
				drawn++;
			}
		}
		return drawn;
	}

	public void setTileSheet(TileSheet tileSheet) {
	}

	public TileSheet getTileSheet() {
		// TODO Auto-generated method stub
		return null;
	}

}
