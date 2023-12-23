package org.classes;

import java.util.Objects;

public class ProductPackaging {
    private String designation;
    private int packMass;

    public ProductPackaging(String designation, int packMass) {
        this.designation = designation;
        this.packMass = packMass;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPackMass() {
        return packMass;
    }

    public void setPackMass(int packMass) {
        this.packMass = packMass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPackaging that = (ProductPackaging) o;
        return getPackMass() == that.getPackMass() && getDesignation().equals(that.getDesignation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDesignation(), getPackMass());
    }

    @Override
    public String toString() {
        return "ProductPackaging{" +
                "designation='" + designation + '\'' +
                ", packMass=" + packMass +
                '}';
    }

}
