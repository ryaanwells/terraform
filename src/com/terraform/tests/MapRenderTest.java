package com.terraform.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.terraform.map.GameMap;
import com.terraform.map.MapRenderer;
import com.terraform.map.TileSheet;

public class MapRenderTest {

	@Test
	public void renderingNoGameMapDrawsZeroTiles() {
		MapRenderer mapRenderer = new MapRenderer(null, null);
		int ret = mapRenderer.render();
		assertThat(ret, is(0));
	}
	
	@Test
	public void allowATileSheetToBeSet () {
		MapRenderer mapRenderer = new MapRenderer(null, null);
		TileSheet tileSheet = new TileSheet("assets/testTileMap.png");
		mapRenderer.setTileSheet(null);
		assertThat (mapRenderer.getTileSheet(), is(tileSheet));
	}
	
}
