package com.terraform.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.terraform.input.GameInputProcessor;
import com.terraform.map.GameMap;
import com.terraform.map.MapRenderer;
import com.terraform.map.MapTile;

public class Terraform implements ApplicationListener {
	
	private MapRenderer mapRenderer;
	private SpriteBatch spriteBatch;
	private GameMap gameMap;

	@Override
	public void create() {
		spriteBatch = new SpriteBatch();
		gameMap = new GameMap(20,20);
		Gdx.graphics.setDisplayMode(Gdx.graphics.getDesktopDisplayMode());
		Gdx.input.setInputProcessor(new GameInputProcessor(gameMap, Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
		//Test Code
		MapTile mapTile = new MapTile();
		mapTile.setTexture(new Texture(("assets/testTexture.bmp")));
		gameMap.setValue(10, 10, mapTile);
		
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
