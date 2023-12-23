package org.classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testEquals() {
        Product prod = new Product("SomethingSmart", "This is smart thing");
        Product prodFalse = new Product("Something", "This is thing");

        assertFalse(prod.equals(prodFalse));
    }

    @Test
    public void testHashCode() {
        Product prod = new Product("SomethingSmart", "This is smart thing");

        assertEquals(-193675371, prod.hashCode());
    }

    @Test
    public void testToString() {
        Product prod = new Product("SomethingSmart", "This is smart thing");

        assertEquals("Product{title='SomethingSmart', description='This is smart thing'}", prod.toString());
    }
}