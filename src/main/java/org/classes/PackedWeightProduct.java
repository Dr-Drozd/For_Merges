package org.classes;

import java.util.Objects;

public class PackedWeightProduct extends WeightProduct {
    private ProductPackaging pack;
    private int someMass;

    public PackedWeightProduct(String title, String description, ProductPackaging pack, int someMass) {
        super(title, description);
        this.pack = pack;
        this.someMass = someMass;
    }

    public ProductPackaging getPack() {
        return pack;
    }

    public void setPack(ProductPackaging pack) {
        this.pack = pack;
    }

    public int getSomeMass() {
        return someMass;
    }

    public void setSomeMass(int someMass) {
        this.someMass = someMass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedWeightProduct that = (PackedWeightProduct) o;
        return getSomeMass() == that.getSomeMass() && getPack().equals(that.getPack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPack(), getSomeMass());
    }

    @Override
    public String toString() {
        return "PackedWeightProduct{" +
                "pack=" + pack +
                ", someMass=" + someMass +
                '}';
    }

    public int getNetto() {
        return someMass;
    }

    public int getBrutto() {
        return someMass + pack.getPackMass();
    }
}
