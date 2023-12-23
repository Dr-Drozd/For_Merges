package org.classes;

import java.util.Objects;

public class PackedPieceProduct extends PieceProduct {
    private ProductPackaging pack;
    private int someProducts;

    public PackedPieceProduct(String title, String description, int mass, ProductPackaging pack, int someProducts) {
        super(title, description, mass);
        this.pack = pack;
        this.someProducts = someProducts;
    }

    public ProductPackaging getPack() {
        return pack;
    }

    public void setPack(ProductPackaging pack) {
        this.pack = pack;
    }

    public int getSomeProducts() {
        return someProducts;
    }

    public void setSomeProducts(int someProducts) {
        this.someProducts = someProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedPieceProduct that = (PackedPieceProduct) o;
        return getSomeProducts() == that.getSomeProducts() && getPack().equals(that.getPack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPack(), getSomeProducts());
    }

    @Override
    public String toString() {
        return "PackedPieceProduct{" +
                "pack=" + pack.getDesignation() +
                ", someMass=" + someProducts +
                '}';
    }

    public int getNetto() {
        return someProducts*(super.getMass());
    }

    public int getBrutto() {
        return someProducts*(super.getMass()) + pack.getPackMass();
    }
}
