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
	
	//Test code
	private MapRenderer mapRenderer;

	@Override
	public void create() {
		//Gdx.graphics.setDisplayMode(Gdx.graphics.getDesktopDisplayMode()); - This line doesn't work!
		
		spriteBatch = new SpriteBatch();
		gameMap = new GameMap(20,20);
		//System.out.println(Gdx.graphics.getWidth() + " " + Gdx.graphics.getHeight());
		//mapManager = new MapManager(gameMap, new MapRenderer (gameMap, spriteBatch), Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		//Gdx.input.setInputProcessor(new GameInputProcessor(mapManager, Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
		//test code
		MapTile mapTile = new MapTile();
		mapTile.setSheetIndex(3, 4);
		tileSheet = new TileSheet(new Texture("assets/testTileMap.png"),32,32);
		mapRenderer = new MapRenderer(gameMap, spriteBatch);
		mapRenderer.setTileSheet(tileSheet);
		gameMap.setValue(10, 10, mapTile);
		//mapManager.addTextureToGameMap(10, 10, mapTile);
		//mapManager.addTextureToGameMap(0, 5, mapTile);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//mapManager.render();
		mapRenderer.render(480, 320);

		/*spriteBatch.begin();
		spriteBatch.draw(tileSheet.getTileByOffset(2, 2),100,100);
		spriteBatch.draw(tileSheet.getTileByOffset(0, 0),200,200);
		spriteBatch.end();*/ 
		
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
