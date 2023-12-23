package org.classesForFilter;

import org.interfaces.Filter;

public class BeginStringFilter implements Filter {
	private String pattern;
	
	public BeginStringFilter(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean apply(String str) {
		boolean flag = false;
		if (pattern.startsWith(str)) {
			flag = true;
		}
		return flag;
	}
	
}
