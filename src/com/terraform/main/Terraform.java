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

public class Terraform implements ApplicationListener {
	
	private SpriteBatch spriteBatch;
	private GameMap gameMap;
	private MapManager mapManager;

	@Override
	public void create() {
		spriteBatch = new SpriteBatch();
		gameMap = new GameMap(20,20);
		Gdx.graphics.setDisplayMode(Gdx.graphics.getDesktopDisplayMode());
		System.out.println(Gdx.graphics.getWidth() + " " + Gdx.graphics.getHeight());
		//Test Code
		mapManager = new MapManager(gameMap, new MapRenderer (gameMap, spriteBatch));
		Gdx.input.setInputProcessor(new GameInputProcessor(mapManager, Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));

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
