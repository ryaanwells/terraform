package com.terraform.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.tiled.TileAtlas;

public class TileSheet {
	
	private TextureRegion textureArray[][];
	private String filename; 
	
	private int xTileSize;
	private int yTileSize;

	public TileSheet(String filename, int xTileSize, int yTileSize) {
		this.filename = filename;
		this.xTileSize = xTileSize;
		this.yTileSize = yTileSize;
		updateTextureRegion();
	}
	
	public TextureRegion getTileByOffset(int i, int j) {
		if (i >=0 &&  i < textureArray.length && j >= 0 && j < textureArray[0].length)
			return textureArray[i][j];
		return null;
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
	
	private void updateTextureRegion() {
		textureArray = TextureRegion.split(new Texture(filename), xTileSize, yTileSize);
	}

}
