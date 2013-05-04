package com.terrform.tests;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

import com.terrform.map.*;

public class MapTests {
	
	Map map;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
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
		assertEquals(0,map.getValueAtIndex(0, 0));
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
	
}
