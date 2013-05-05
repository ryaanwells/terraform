package com.terraform.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.terraform.map.GameMap;
import com.terraform.map.MapRenderer;

public class MapRenderTest {

	@Test
	public void renderingNoGameMapDrawsZeroTiles() {
		MapRenderer mapRenderer = new MapRenderer(null, null);
		int ret = mapRenderer.render();
		assertThat(ret, is(0));
	}
	
	//TODO: Change this to look at visible tiles
	@Test
	public void renderingAGameMapDrawsAllTiles() {
		GameMap map = new GameMap(10,10);
		MapRenderer mapRenderer = new MapRenderer(map, null);
		int ret = mapRenderer.render();
		assertThat(ret, is(100));
	}
}
