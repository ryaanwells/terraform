package com.terraform.tests;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.*;

import com.terraform.map.MapRenderer;

public class MapRenderTest {
	
	@Test
	public void renderingNoGameMapHasNoEffect() {
		MapRenderer mapRenderer = new MapRenderer(null);
		boolean ret = mapRenderer.render();
		assertThat(ret, is(false));
	}
	
	public void renderingAGameMapShouldReturnTrueWithNoErrors() {
		
	}

}
