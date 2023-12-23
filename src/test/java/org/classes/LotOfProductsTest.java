package org.classes;

import static org.junit.Assert.*;

import org.SpecialExpections.IncorrectClassInputExpection;
import org.junit.Test;

public class LotOfProductsTest {

	@Test
	public void baseMethondsTest() {
		ProductPackaging mohitoPack = new ProductPackaging("Mohito!", 20);
		ProductPackaging aquaPack = new ProductPackaging("Aqua!", 20);
		
		Object[] arr = new PackedPieceProduct[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = new PackedPieceProduct("Mohito", "More hit more bit!", 200, mohitoPack, 10*(1+i));
		}
		
		Object aqua = new PackedWeightProduct("Aqua", "Piece of ocean", aquaPack, 500);
		LotOfProducts lot = new LotOfProducts("Drink", arr);
		
		try {
			lot.setElement(aqua, 1);
		} catch (IncorrectClassInputExpection e) {
			e.getMessage();
		}
		
		assertTrue(lot.getElement(1).equals(aqua));
	}
	
	@Test
	public void setElementTest1() {
		ProductPackaging mohitoPack = new ProductPackaging("Mohito!", 20);
		ProductPackaging aquaPack = new ProductPackaging("Aqua!", 20);
		
		Object[] arr = new PackedPieceProduct[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = new PackedPieceProduct("Mohito", "More hit more bit!", 200, mohitoPack, 10*(1+i));
		}
		
		Object aqua = new PackedWeightProduct("Aqua", "Piece of ocean", aquaPack, 500);
		LotOfProducts lot = new LotOfProducts("Drink", arr);
		
		try {
			lot.setElement(aqua, 1);
		} catch (IncorrectClassInputExpection e) {
			e.getMessage();
		}
		
		System.out.println(lot.toString());
	}
	
	@Test
	public void getMassLotTest() {
		ProductPackaging mohitoPack = new ProductPackaging("Mohito!", 20);
		ProductPackaging aquaPack = new ProductPackaging("Aqua!", 20);
		
		Object[] arr = new PackedPieceProduct[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = new PackedPieceProduct("Mohito", "More hit more bit!", 200, mohitoPack, 10*(1+i));
		}
		
		Object aqua = new PackedWeightProduct("Aqua", "Piece of ocean", aquaPack, 500);
		LotOfProducts lot = new LotOfProducts("Drink", arr);
		
		try {
			lot.setElement(aqua, 1);
		} catch (IncorrectClassInputExpection e) {
			e.getMessage();
		}
		
		assertEquals(8560, lot.getMassOfLot());
	}

}
