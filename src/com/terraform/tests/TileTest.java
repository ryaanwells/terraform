package com.terraform.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.terraform.map.MapTile;

public class TileTest {

	@Test
	public void tilesAreAssignedSheetIndex00ByDefault() {
		MapTile tile = new MapTile();
		assertThat(tile.getSheetIndexX(), is(0));
		assertThat(tile.getSheetIndexY(), is(0));
	}
	
	@Test
	public void tilesShouldBeAllocatedAValidSheetIndex() {
		MapTile tile = new MapTile();
		tile.setSheetIndex(2,2);
		assertThat(tile.getSheetIndexX(), is(2));
		assertThat(tile.getSheetIndexY(), is(2));
	}
	
}
