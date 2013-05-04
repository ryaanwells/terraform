package com.terrform.map;

public class Map implements MapInterface {
	private int xtiles;
	private int ytiles;
	
	public Map(){
		xtiles = 12;
		ytiles = 10;
	}
	
	@Override
	public int getTilesXAxis() {
		return xtiles;
	}

	@Override
	public int getTilesYAxis() {
		return ytiles;
	}

}
