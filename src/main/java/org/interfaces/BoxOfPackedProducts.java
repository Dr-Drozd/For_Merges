package org.interfaces;

import org.SpecialExpections.IncorrectClassInputExpection;

public interface BoxOfPackedProducts {
	
	void setElement(Object o, int i) throws IncorrectClassInputExpection;
	
	Object getElement(int i);
}
