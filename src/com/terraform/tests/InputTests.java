package com.terraform.tests;

import static org.junit.Assert.*;

import com.terraform.input.GameInputProcessor;
import com.terraform.map.*;
import org.junit.*;

public class InputTests {

	private GameMap gameMap;
	private GameInputProcessor GIP;
	private int screenWidth = 100;
	private int screenHeight = 100;
	
	@Before
	public void Before(){
		gameMap = new GameMap(50,50);
		GIP = new GameInputProcessor(gameMap,screenWidth,screenHeight);
	}
	
	@Test
	public void touchDown_OriginValues(){
		assertTrue(GIP.touchDown(0, 0, 0, 0));
	}
	
	@Test
	public void touchDown_MaxValues(){
		assertTrue(GIP.touchDown(screenWidth,screenHeight,0,0));
	}
	
	@Test
	public void touchDown_OverMaxValues(){
		assertFalse(GIP.touchDown(screenWidth+1, screenHeight+1, 0, 0));
	}
	
	@Test
	public void touchDown_UnderMinValues(){
		assertFalse(GIP.touchDown(-1,-1,0,0));
	}
}
