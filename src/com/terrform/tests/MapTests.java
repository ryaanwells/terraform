package com.terrform.tests;

import static org.junit.Assert.*;
import org.junit.*;

import com.terrform.map.*;

public class MapTests {
	
	Map map;
	
	@Before
	public void before(){
		map = new Map();
	}
	
	@Test
	public void getTilesOnXAxis(){
		assertEquals(map.getTilesXAxis(),12);
	}
	
	@Test
	public void getTilesOnYAxis(){
		assertEquals(map.getTilesYAxis(),10);
	}
	
	@Test
	public void validIndex_XYValid(){
		assertEquals(true,map.isValidIndex(0, 0));
	}
	
	@Test
	public void validIndex_YInvalidNegative(){
		assertEquals(false,map.isValidIndex(0, -1));
	}
	
	@Test
	public void validIndex_XInvalidNegative(){
		assertEquals(false,map.isValidIndex(-1, 0));
	}
	
	@Test
	public void validIndex_XInvalidNegativeYInvalidNegative(){
		assertEquals(false,map.isValidIndex(-1,-1));
	}
	
	@Test
	public void validIndex_YInvalidOutOfRange(){
		assertEquals(false,map.isValidIndex(0, 100));
	}
	
	@Test
	public void validIndex_XInvalidOutOfRange(){
		assertEquals(false,map.isValidIndex(100, 0));
	}
	
	@Test
	public void validIndex_XInvalidOutOfRangeYInvalidOutOfRange(){
		assertEquals(false,map.isValidIndex(100,100));
	}
}
