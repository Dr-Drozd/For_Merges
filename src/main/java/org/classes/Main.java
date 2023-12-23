package org.classes;

import org.interfaces.*;
import org.SpecialExpections.IncorrectClassInputExpection;
import org.classesForFilter.*;

public class Main {
    public static void main(String[] args) throws IncorrectClassInputExpection {
        System.out.println(3);
        ProductPackaging pck = new ProductPackaging("tes", 100);
        PackedWeightProduct p = new PackedWeightProduct("Prod", "Testing", pck, 2000);
        PackedWeightProduct p0 = new PackedWeightProduct("Prod", "Testing", pck, 2);
        p0.setSomeMass(2000);
        System.out.println(p.equals(p0));
        Filter fil = new BeginStringFilter("Milk");
        ProductPackaging mohitoPack = new ProductPackaging("Mohito!", 20);
		ProductPackaging aquaPack = new ProductPackaging("Aqua!", 20);
		
		Object[] arr = new PackedPieceProduct[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = new PackedPieceProduct("Mohito", "More hit more bit!", 200, mohitoPack, 10*(1+i));
		}
		
		Object aqua = new PackedWeightProduct("Aqua", "Piece of ocean", aquaPack, 500);
		LotOfProducts lot = new LotOfProducts("Drink", arr);
		lot.setElement(aqua, 0);
        int res = ProductService.countByFilter(lot, fil);
        System.out.println(res);
    }
}
