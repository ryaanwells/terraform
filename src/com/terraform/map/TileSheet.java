package com.terraform.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TileSheet {
	
	private TextureRegion textureArray[][];
	private Texture tileSheetTexture; 
	
	private int xTileSize;
	private int yTileSize;

	public TileSheet(Texture tileSheetTexture, int xTileSize, int yTileSize) {
		this.tileSheetTexture = tileSheetTexture;
		this.xTileSize = xTileSize;
		this.yTileSize = yTileSize;
		updateTextureRegion();
	}
	
	public TextureRegion getTileByOffset(int i, int j) {
		if (i >=0 &&  i < textureArray.length && j >= 0 && j < textureArray[0].length)
			return textureArray[i][j];
		return textureArray[0][0]; //Default to the lowest position - Stops the engine complaining...
	}

	public void setXTileSize(int xTileSize) {
		this.xTileSize = xTileSize;
		updateTextureRegion();
	}

	public int getXTileSize() {
		return xTileSize;
	}

	public void setYTileSize(int yTileSize) {
		this.yTileSize = yTileSize;
		updateTextureRegion();
	}

	public int getYTileSize() {
		return yTileSize;
	}
	
	public void setNewTileSheetTexutre(Texture newTileSheetTexture){
		this.tileSheetTexture = newTileSheetTexture;
	}
	
	private void updateTextureRegion() {
		textureArray = TextureRegion.split(tileSheetTexture, xTileSize, yTileSize);
	}

}
