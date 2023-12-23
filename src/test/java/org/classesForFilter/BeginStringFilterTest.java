package org.classesForFilter;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeginStringFilterTest {

    @Test
    public void apply() {
        String pattern = new String("Mama wash a window");
        BeginStringFilter strFilter = new BeginStringFilter(pattern);
        String strTrue = new String("Mama");
        String strFalse = new String("wash");

        assertFalse(strFilter.apply(strFalse));
        assertTrue(strFilter.apply(strTrue));
    }
}