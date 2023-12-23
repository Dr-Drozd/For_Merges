package org.classes;

import org.interfaces.Filter;

public class ProductService{

    public static int countByFilter(LotOfProducts lot, Filter filter) {
    	int count = 0;
    	Object buffer = new Object();
    	for(int i = 0; i < lot.getLengthOfArray(); i++) {
    		buffer = lot.getElement(i);
    		if(buffer instanceof PackedPieceProduct) {
    			if (filter.apply(((PackedPieceProduct) buffer).getTitle())) {
    				count++;
    			}
    		} else {
    			if(buffer instanceof PackedWeightProduct) {
        			if (filter.apply(((PackedWeightProduct) buffer).getTitle())) {
        				count++;
        			}
    			}
    		}	
    	}
		return count;   
		
    }
}