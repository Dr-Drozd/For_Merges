package org.classesForFilter;

import org.interfaces.Filter;

public class LongerStringThanPatternStringFilter implements Filter {
	private String pattern;
	
	public LongerStringThanPatternStringFilter(String pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public boolean apply(String str) throws NullPointerException {	
		if(str == null) {
			throw new NullPointerException("String is null!");
		}
		return str.length() > pattern.length();
	}

}
