package com.terraform.map;

public class MapTile {
	
	private int sheetIndexX, sheetIndexY;
	
	public MapTile() {}

	public int getSheetIndexX() {
		return sheetIndexX;
	}

	public int getSheetIndexY() {
		return sheetIndexY;
	}

	public void setSheetIndex(int x, int y) {
		sheetIndexX = x;
		sheetIndexY = y;
	}
	
	

}
