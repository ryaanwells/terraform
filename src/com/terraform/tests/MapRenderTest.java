package com.terraform.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.terraform.map.MapRenderer;

public class MapRenderTest {

	@Test
	public void renderingNoGameMapHasNoEffect() {
		MapRenderer mapRenderer = new MapRenderer(null, null);
		boolean ret = mapRenderer.render();
		assertThat(ret, is(false));
	}
}
