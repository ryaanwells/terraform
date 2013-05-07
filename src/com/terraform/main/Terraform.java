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
	TileSheet tileSheet;
	private MapManager mapManager;

	@Override
	public void create() {
		Gdx.graphics.setDisplayMode(Gdx.graphics.getDesktopDisplayMode());
		spriteBatch = new SpriteBatch();
		gameMap = new GameMap(20,20);
		System.out.println(Gdx.graphics.getWidth() + " " + Gdx.graphics.getHeight());
		mapManager = new MapManager(gameMap, new MapRenderer (gameMap, spriteBatch), Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.input.setInputProcessor(new GameInputProcessor(mapManager, Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
		//test code
		MapTile mapTile = new MapTile();
		mapManager.addTextureToGameMap(10, 10, mapTile);
		mapManager.addTextureToGameMap(0, 5, mapTile);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mapManager.render();

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
