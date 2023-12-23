package org.classes;

public class Main {
    public static void main(String[] args) {
        System.out.println(3);
        ProductPackaging pck = new ProductPackaging("tes", 100);
        PackedWeightProduct p = new PackedWeightProduct("Prod", "Testing", pck, 2000);
        PackedWeightProduct p0 = new PackedWeightProduct("Prod", "Testing", pck, 2);
        p0.setSomeMass(2000);
        System.out.println(p.equals(p0));
    }
}
