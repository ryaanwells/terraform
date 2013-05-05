package com.terraform.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

import com.badlogic.gdx.graphics.Texture;
import com.terraform.map.MapTile;

public class TileTest {


	@Test
	public void tilesAreAssignedNoTextureByDefault() {
		MapTile tile = new MapTile();
		assertThat(tile.getTexture(), nullValue());
	}

}
