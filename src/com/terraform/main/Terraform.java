package com.terraform.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.terraform.map.GameMap;
import com.terraform.map.MapRenderer;

public class Terraform implements ApplicationListener {
	
	private MapRenderer mapRenderer;

	@Override
	public void create() {
		mapRenderer = new MapRenderer (new GameMap(50,50), new ShapeRenderer());
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
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
