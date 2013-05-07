package com.terraform.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

import com.terraform.map.MapTile;

public class TileTest {

	@Test
	public void tilesAreAssignedSheetIndex0ByDefault() {
		MapTile tile = new MapTile();
		assertThat(tile.getSheetIndex(), is(0));
	}

}
