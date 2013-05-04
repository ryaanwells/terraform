package com.terrform.tests;

import static org.junit.Assert.*;
import org.junit.*;

import com.terrform.map.*;

public class MapTests {
	
	MapInterface map;
	
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
}
