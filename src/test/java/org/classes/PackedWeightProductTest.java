package org.classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PackedWeightProductTest {

	@Test
	public void getNettoTest() {
		ProductPackaging pck = new ProductPackaging("tes", 100);
        PackedWeightProduct prod = new PackedWeightProduct("Prod", "Testing", pck, 200);
        
        assertEquals(200, prod.getNetto());
	}
	
	@Test
	public void getBruttoTest() {
		ProductPackaging pck = new ProductPackaging("tes", 100);
        PackedWeightProduct prod = new PackedWeightProduct("Prod", "Testing", pck, 200);
        
        assertEquals(300, prod.getBrutto());
	}
	
	

}
