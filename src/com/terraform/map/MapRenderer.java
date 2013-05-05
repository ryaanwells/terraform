package com.terraform.map;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MapRenderer {
	
	private static final int TILE_SIZE = 32;
	
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
		
		for (int i = 0; i < map.getTilesXAxis(); i++) {
			for (int j = 0; j < map.getTilesYAxis(); j++) {
			
				drawn++;
			}
		}
		
		return drawn;
	}

}
