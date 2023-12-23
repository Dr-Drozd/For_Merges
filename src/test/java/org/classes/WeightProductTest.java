package org.classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeightProductTest {

    @Test
    public void testEquals() {
        WeightProduct melon = new WeightProduct("Melon", "It's just sweet melon");
        WeightProduct watermelon = new WeightProduct("Watermelon", "It's just sweet watermelon");

        assertFalse(melon.equals(watermelon));
    }

    @Test
    public void testHashCode() {
        WeightProduct melon = new WeightProduct("Melon", "It's just sweet melon");

        assertEquals(961, melon.hashCode());
    }

    @Test
    public void testToString() {
        WeightProduct melon = new WeightProduct("Melon", "It's just sweet melon");

        assertEquals("WeightProduct{title=Melon, description=It's just sweet melon}", melon.toString());
    }
}