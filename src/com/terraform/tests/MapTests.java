package com.terraform.tests;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

import com.terraform.map.GameMap;
import com.terraform.map.MapTile;

public class MapTests {
	
	private static final int MAP_SIZE_Y = 10;
	private static final int MAP_SIZE_X = 12;

	private GameMap map;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void before(){
		map = new GameMap(MAP_SIZE_X, MAP_SIZE_Y);
	}
	
	@Test
	public void getTilesOnXAxis(){
		assertEquals(map.getTilesXAxis(),MAP_SIZE_X);
	}
	
	@Test
	public void getTilesOnYAxis(){
		assertEquals(map.getTilesYAxis(),MAP_SIZE_Y);
	}
	
	@Test
	public void validIndex_XYValid(){
		assertEquals(true,map.isValidIndex(0, 0));
	}
	
	@Test
	public void validIndex_XInvalidNegative(){
		assertEquals(false,map.isValidIndex(-1, 0));
	}
	
	@Test
	public void validIndex_YInvalidNegative(){
		assertEquals(false,map.isValidIndex(0, -1));
	}
	
	@Test
	public void validIndex_XInvalidNegativeYInvalidNegative(){
		assertEquals(false,map.isValidIndex(-1,-1));
	}
	
	@Test
	public void validIndex_XInvalidOutOfRange(){
		assertEquals(false,map.isValidIndex(map.getTilesXAxis()+1, 0));
	}
	
	@Test
	public void validIndex_YInvalidOutOfRange(){
		assertEquals(false,map.isValidIndex(0, map.getTilesYAxis()+1));
	}
	
	@Test
	public void validIndex_XInvalidOutOfRangeYInvalidOutOfRange(){
		assertEquals(false,map.isValidIndex(map.getTilesXAxis()+1,map.getTilesYAxis()+1));
	}
	
	@Test
	public void getValueAtIndex_XYValid(){
		assertEquals(new MapTile(),map.getValueAtIndex(0, 0));
	}
	
	@Test
	public void getValueAtIndex_XInvalidNegative(){
		exception.expect(IndexOutOfBoundsException.class);
		map.getValueAtIndex(-1, 0);
	}
	
	@Test
	public void getValueAtIndex_YInvalidNegative(){
		exception.expect(IndexOutOfBoundsException.class);
		map.getValueAtIndex(0, -1);
	}
	
	@Test
	public void getValueAtIndex_XInvalidNegativeYInvalidNegative(){
		exception.expect(IndexOutOfBoundsException.class);
		map.getValueAtIndex(-1, -1);
	}
	
	@Test
	public void getValueAtIndex_XInvalidOutOfRange(){
		exception.expect(IndexOutOfBoundsException.class);
		map.getValueAtIndex(map.getTilesXAxis()+1, 0);
	}
	
	@Test
	public void getValueAtIndex_YInvalidOutOfRange(){
		exception.expect(IndexOutOfBoundsException.class);
		map.getValueAtIndex(0, map.getTilesYAxis()+1);
	}
	
	@Test
	public void getValueAtIndex_XInvalidOutOfRangeYInvalidOutOfRange(){
		exception.expect(IndexOutOfBoundsException.class);
		map.getValueAtIndex(map.getTilesXAxis()+1, map.getTilesYAxis()+1);
	}
	
	@Test
	public void getNumberOfTilesReturnsTheFullGridSize () {
		assertThat (map.getTileCount(), is(120));
	}
	
	@Test
	public void mapAllowsTheUserToSetTheSizeOnCreation () {
		GameMap map = new GameMap(20,20);
		assertThat(map.getTilesXAxis(), is(20));
		assertThat(map.getTilesYAxis(), is(20));
	}
	
}
