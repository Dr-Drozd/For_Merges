package org.classesForFilter;

import org.interfaces.Filter;

public class ContainOnlyBinaryNumbers implements Filter {

	@Override
	public boolean apply(String str) {
		boolean flag = true;
		if (str.equals("")) {
			flag = false;
		} else {
			str = str.replace(" ", "");
			for(int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '0' || str.charAt(i) == '1') {
					
				} else {
					flag = false;
					break;
				}
			}
		}
		
		
		return flag;
	}
	
}
