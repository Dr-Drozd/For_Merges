package org.classes;

import static org.junit.Assert.*;

import org.classes.PackedPieceProduct;
import org.classes.PieceProduct;
import org.classes.ProductPackaging;
import org.junit.Test;

public class PieceProductTest {

	@Test
	public void testEquals() {
		PieceProduct whiteBread = new PieceProduct("White Bread", "Made from high quality floor", 120);
		PieceProduct grayBread = new PieceProduct("Gray Bread", "Made from high quality floor", 150);

		assertFalse(whiteBread.equals(grayBread));
	}
	
	@Test
	public void testHashCode() {
		PieceProduct whiteBread = new PieceProduct("White Bread", "Made from high-quality floor", 120);
		
		assertEquals(29911, whiteBread.hashCode());
	}

	@Test
	public void testToString() {
		PieceProduct whiteBread = new PieceProduct("White Bread", "Made from high quality floor", 120);
		
		assertEquals("PieceProduct [title=" + "White Bread" + ", description=" + "Made from high quality floor" + ", mass=" + 120 + "]", whiteBread.toString());
	}
	

}
