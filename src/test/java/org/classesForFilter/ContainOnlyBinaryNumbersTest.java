package org.classesForFilter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainOnlyBinaryNumbersTest {

	@Test
	public void differenceStringsTest() {
		ContainOnlyBinaryNumbers bin = new ContainOnlyBinaryNumbers();
		String binary = new String("010110");
		String nonBinary = new String("072d0");
		
		assertTrue(bin.apply(binary));
		assertFalse(bin.apply(nonBinary));
	}
	
	@Test
	public void binaryStringsWithSpacesTest() {
		ContainOnlyBinaryNumbers bin = new ContainOnlyBinaryNumbers();
		String binary = new String(" 010 110  ");
		
		assertTrue(bin.apply(binary));
	}
	
	@Test
	public void voidStringTest() {
		ContainOnlyBinaryNumbers bin = new ContainOnlyBinaryNumbers();
		String binary = new String("");
		
		assertFalse(bin.apply(binary));
	}

}
