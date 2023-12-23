package org.classesForFilter;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongerStringThanPatternStringFilterTest {

	@Test
	public void normalStringTest() {
		LongerStringThanPatternStringFilter str = new LongerStringThanPatternStringFilter("Bibop");
		String s = new String("2087329433");
		
		assertTrue(str.apply(s));
	}
	
	@Test
	public void voidStringTest() {
		LongerStringThanPatternStringFilter str = new LongerStringThanPatternStringFilter("Bibop");
		String s = new String("");
		
		assertFalse(str.apply(s));
	}
	
	@Test
	public void nullStringTest() {
		LongerStringThanPatternStringFilter str = new LongerStringThanPatternStringFilter("Bibop");
		String s = null;
		assertThrows(NullPointerException.class,
                () -> {
                	str.apply(s);
                });
	}

}
