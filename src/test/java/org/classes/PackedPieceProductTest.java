package org.classes;

import static org.junit.Assert.*;

import org.classes.PackedPieceProduct;
import org.classes.ProductPackaging;
import org.junit.Test;

public class PackedPieceProductTest {

	@Test
	public void testEquals() {
		ProductPackaging milkPack = new ProductPackaging("WhiteMilk", 20);
		PackedPieceProduct manyMilk = new PackedPieceProduct("Milk", "Natural milk from farmes", 200, milkPack, 3);
		PackedPieceProduct veryManyMilk = new PackedPieceProduct("Milk", "Natural milk from farmes, more liters", 800, milkPack, 10);
	
		assertFalse(manyMilk.equals(veryManyMilk));
	}

	@Test
	public void testToString() {
		ProductPackaging milkPack = new ProductPackaging("WhiteMilk", 20);
		PackedPieceProduct manyMilk = new PackedPieceProduct("Milk", "Natural milk from farmes", 200, milkPack, 3);
		
		assertEquals("PackedPieceProduct{" + "pack=" + "WhiteMilk" + ", someMass=" + 3 +
                '}', manyMilk.toString());
	}
	

	@Test
	public void getNettoTest() {
		ProductPackaging milkPack = new ProductPackaging("WhiteMilk", 20);
		PackedPieceProduct manyMilk = new PackedPieceProduct("Milk", "Natural milk from farmes", 200, milkPack, 3);
        
        assertEquals(600, manyMilk.getNetto());
	}
	
	@Test
	public void getBruttoTest() {
		ProductPackaging milkPack = new ProductPackaging("WhiteMilk", 20);
		PackedPieceProduct manyMilk = new PackedPieceProduct("Milk", "Natural milk from farmes", 200, milkPack, 3);
        
        assertEquals(620, manyMilk.getBrutto());
	}
	
	
}
