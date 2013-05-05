package com.terraform.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.terraform.map.GameMap;
import com.terraform.map.MapRenderer;
import com.terraform.map.MapTile;
import com.terraform.map.TileSheet;

public class Terraform implements ApplicationListener {
	
	private MapRenderer mapRenderer;
	private SpriteBatch spriteBatch;
	private GameMap gameMap;
	
	TileSheet tileSheet;

	@Override
	public void create() {
		spriteBatch = new SpriteBatch();
		gameMap = new GameMap(20,20);
		
		//Test Code
		MapTile mapTile = new MapTile();
		mapTile.setTexture(new Texture(("assets/testTexture.bmp")));
		gameMap.setValue(10, 10, mapTile);
		
		tileSheet = new TileSheet("assets/testTileMap.png", 32, 32);
		
		
		mapRenderer = new MapRenderer (gameMap, spriteBatch);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mapRenderer.render();
		spriteBatch.begin();
		spriteBatch.draw(tileSheet.getTileByOffset(5, 3),100,100);
		spriteBatch.draw(tileSheet.getTileByOffset(0, 0),150,100);
		spriteBatch.end();
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
