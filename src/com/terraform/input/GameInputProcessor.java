package com.terraform.input;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.terraform.map.MapManager;

public class GameInputProcessor implements InputProcessor {
	
	private MapManager mapManager;
	private int screenWidth;
	private int screenHeight;
	
	public GameInputProcessor(MapManager mapManager, int width, int height){
		this.mapManager = mapManager;
		this.screenWidth = (width>0) ? width : 1;
		this.screenHeight = (height>0) ? height : 1;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Keys.ESCAPE){
			Gdx.app.exit();
			return true;
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		if(screenX<=screenWidth && screenY<=screenHeight && screenX>=0 && screenY>=0){
			int xIndex = screenX*mapManager.getTilesXAxis()/screenWidth;
			int yIndex = (screenHeight - screenY)*mapManager.getTilesYAxis()/screenHeight;
			//pass this value off to whoever cares about it
			System.out.println("[" + xIndex + ", " + yIndex + "]");
			mapManager.eventOn(xIndex, yIndex);
			return true;
		}
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
