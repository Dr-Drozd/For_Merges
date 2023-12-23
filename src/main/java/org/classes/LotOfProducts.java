package org.classes;

import org.interfaces.BoxOfPackedProducts;

import java.util.Arrays;
import java.util.Objects;

import org.SpecialExpections.IncorrectClassInputExpection;

public class LotOfProducts implements BoxOfPackedProducts {
    private String description;
    private Object[] boxOfPckProd;

    public LotOfProducts(String description, Object[] box) {
        this.description = description;
        this.boxOfPckProd = new Object[box.length];
        for (int i = 0; i < box.length; i++) {
        	boxOfPckProd[i] = box[i];
        }
        
    }   
    
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void setElement(Object o, int i) throws IncorrectClassInputExpection {
    	if (o instanceof PackedPieceProduct) {
    		boxOfPckProd[i] = (PackedPieceProduct) o;
    	} else {
    		if (o instanceof PackedWeightProduct) {
    			boxOfPckProd[i] = (PackedWeightProduct) o;
    		} else {
    			throw new IncorrectClassInputExpection("This isn't Packed Piece or Weight Product!");
    		}
    	}
	}
	
	public String getDescription() {
		return description;
	}
    
    @Override
	public Object getElement(int i) {
		return boxOfPckProd[i];
	}

	public int getMassOfLot() {
        int resultMass = 0;
        for (int i = 0; i < boxOfPckProd.length; i++) {
            if (boxOfPckProd[i] instanceof PackedPieceProduct) {
            	resultMass = resultMass + ((PackedPieceProduct)boxOfPckProd[i]).getBrutto();
        	} 
        	if (boxOfPckProd[i] instanceof PackedWeightProduct) {
        		resultMass = resultMass + ((PackedWeightProduct)boxOfPckProd[i]).getBrutto();
        	}
        }
        return resultMass;
	}
	
	public int getLengthOfArray() {
		return boxOfPckProd.length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(boxOfPckProd);
		result = prime * result + Objects.hash(description);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LotOfProducts other = (LotOfProducts) obj;
		return Arrays.deepEquals(boxOfPckProd, other.boxOfPckProd) && Objects.equals(description, other.description);
	}

	@Override
	public String toString() {
		return "LotOfProducts [description=" + description + ", boxOfPckProd=" + Arrays.toString(boxOfPckProd)
				+ "]";
	}
	
	

	





	
}
