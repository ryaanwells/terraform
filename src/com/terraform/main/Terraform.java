package com.terraform.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
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

	@Override
	public void create() {
		spriteBatch = new SpriteBatch();
		gameMap = new GameMap(20,20);
		
		MapRenderer mapRenderer = new MapRenderer (gameMap, spriteBatch);
		tileSheet = new TileSheet(new Texture("assets/testTileMap.png"),32,32);
		
		mapRenderer.setTileSheet(tileSheet);
		mapManager = new MapManager(gameMap, mapRenderer, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.input.setInputProcessor(new GameInputProcessor(mapManager, Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
		
		//test code
		MapTile mapTile = new MapTile();
		mapTile.setSheetIndex(3, 4);
		
		gameMap.setValue(10, 10, mapTile);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mapManager.render();
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
