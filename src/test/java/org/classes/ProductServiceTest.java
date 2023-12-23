package org.classes;

import static org.junit.Assert.*;

import org.SpecialExpections.IncorrectClassInputExpection;
import org.classesForFilter.*;
import org.interfaces.Filter;
import org.junit.Test;

public class ProductServiceTest {

	@Test
	public void countByFilter_BeginStringFilter() {
        ProductPackaging mohitoPack = new ProductPackaging("Mohito!", 20);
		ProductPackaging aquaPack = new ProductPackaging("Aqua!", 20);
		
		Object[] arr = new PackedPieceProduct[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = new PackedPieceProduct("Mohito", "More hit more bit!", 200, mohitoPack, 10*(1+i));
		}
		
		Object aqua = new PackedWeightProduct("Aqua", "Piece of ocean", aquaPack, 500);
		LotOfProducts lot = new LotOfProducts("Drink", arr);
		try {
			lot.setElement(aqua, 0);
		} catch (IncorrectClassInputExpection e) {
			e.getMessage();
		}
		
		Filter fil = new BeginStringFilter("Mohito");
        assertEquals(2, ProductService.countByFilter(lot, fil));
	}
	
	@Test
	public void countByFilter_ContainOnlyBinaryNumbers() {
        ProductPackaging mohitoPack = new ProductPackaging("Mohito!", 20);
		ProductPackaging aquaPack = new ProductPackaging("Aqua!", 20);
		
		Object[] arr = new PackedPieceProduct[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = new PackedPieceProduct("Mohito", "More hit more bit!", 200, mohitoPack, 10*(1+i));
		}
		
		Object aqua = new PackedWeightProduct("Aqua", "Piece of ocean", aquaPack, 500);
		LotOfProducts lot = new LotOfProducts("Drink", arr);
		try {
			lot.setElement(aqua, 0);
		} catch (IncorrectClassInputExpection e) {
			e.getMessage();
		}
		
		Filter fil = new ContainOnlyBinaryNumbersFilter();
        assertEquals(0, ProductService.countByFilter(lot, fil));
	}
	
	@Test
	public void countByFilter_LongerStringThanPatternStringFilter() {
        ProductPackaging pumpkinPack = new ProductPackaging("Pumpkins!", 120);
		ProductPackaging cabbagePack = new ProductPackaging("Cabbages!", 100);
		
		Object[] arr = new PackedPieceProduct[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = new PackedPieceProduct("Pumpkin", "Big orange sphere", 1200, pumpkinPack, 3*(1+i));
		}
		
		Object cabbage = new PackedWeightProduct("Cabbage", "It's green thing", cabbagePack, 2000);
		LotOfProducts lot = new LotOfProducts("Vegetables", arr);
		try {
			lot.setElement(cabbage, 0);
		} catch (IncorrectClassInputExpection e) {
			e.getMessage();
		}
		
		Filter fil = new LongerStringThanPatternStringFilter("Carrot");
        assertEquals(3, ProductService.countByFilter(lot, fil));
	}

}
