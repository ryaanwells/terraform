package com.terraform.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.terraform.input.GameInputProcessor;
import com.terraform.map.GameMap;
import com.terraform.map.MapManager;
import com.terraform.map.MapRenderer;
import com.terraform.map.MapTile;
import com.terraform.map.TileSheet;

public class Terraform implements ApplicationListener {
	
	private SpriteBatch spriteBatch;
	private GameMap gameMap;
	private TileSheet tileSheet;
	private MapManager mapManager;
	private int screenWidth;
	private int screenHeight;

	@Override
	public void create() {
		screenWidth = Gdx.graphics.getWidth();
		screenHeight = Gdx.graphics.getHeight();
		
		spriteBatch = new SpriteBatch();
		gameMap = new GameMap(20,20);
		
		MapRenderer mapRenderer = new MapRenderer (gameMap, spriteBatch);
		tileSheet = new TileSheet(new Texture("assets/testTileMap.png"),32,32);
		
		mapRenderer.setTileSheet(tileSheet);
		mapManager = new MapManager(gameMap, mapRenderer, screenWidth, screenHeight);
		Gdx.input.setInputProcessor(new GameInputProcessor(mapManager, screenWidth,screenHeight));
		
		//test code
		MapTile mapTile = new MapTile();
		mapTile.setSheetIndex(3, 4);
		
		gameMap.setValue(10, 10, mapTile);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mapManager.render(screenWidth, screenHeight);
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
