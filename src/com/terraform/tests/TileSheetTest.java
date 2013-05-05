package com.terraform.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

import org.junit.Test;

import com.terraform.map.TileSheet;

public class TileSheetTest {

	@Test
	public void possibleToUpdateTheTileSizes() {
		TileSheet tileSheet = new TileSheet(null, 0, 0);
		tileSheet.setXTileSize(32);
		tileSheet.setYTileSize(64);
		assertThat(tileSheet.getXTileSize(), is(32));
		assertThat(tileSheet.getYTileSize(), is(64));
	}
	
}
