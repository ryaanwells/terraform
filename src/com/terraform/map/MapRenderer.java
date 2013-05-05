package com.terraform.map;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MapRenderer {
	
	private static final int TILE_SIZE = 32;
	
	private GameMap map;
	private ShapeRenderer shapeRenderer;

	public MapRenderer(GameMap map, ShapeRenderer shapeRenderer) {
		this.map = map;
		this.shapeRenderer = shapeRenderer;
	}

	public int render() {
		if (map == null) {
			return 0;
		}
		
		int drawn = 0;
		
		for (int i = 0; i < map.getTilesXAxis(); i++) {
			for (int j = 0; j < map.getTilesYAxis(); j++) {
				/* Temporaily use a shapeRenderer for testing 
				shapeRenderer.begin(ShapeType.Rectangle);
				shapeRenderer.rect(i*TILE_SIZE, j*TILE_SIZE, TILE_SIZE, TILE_SIZE);
				shapeRenderer.end(); */
				drawn++;
			}
		}
		
		return drawn;
	}

}
