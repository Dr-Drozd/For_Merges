package org.classesForFilter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainOnlyBinaryNumbersTest {

	@Test
	public void differenceStringsTest() {
		ContainOnlyBinaryNumbersFilter bin = new ContainOnlyBinaryNumbersFilter();
		String binary = new String("010110");
		String nonBinary = new String("072d0");
		
		assertTrue(bin.apply(binary));
		assertFalse(bin.apply(nonBinary));
	}
	
	@Test
	public void binaryStringsWithSpacesTest() {
		ContainOnlyBinaryNumbersFilter bin = new ContainOnlyBinaryNumbersFilter();
		String binary = new String(" 010 110  ");
		
		assertTrue(bin.apply(binary));
	}
	
	@Test
	public void voidStringTest() {
		ContainOnlyBinaryNumbersFilter bin = new ContainOnlyBinaryNumbersFilter();
		String binary = new String("");
		
		assertFalse(bin.apply(binary));
	}

}
