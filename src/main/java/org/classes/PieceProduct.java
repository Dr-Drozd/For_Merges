package org.classes;

import java.util.Objects;

public class PieceProduct extends Product {
    private int mass;

    public PieceProduct(String title, String description, int mass) {
        super(title, description);
        this.mass = mass;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);;
    }

    @Override
    public String getDescription() {
        return super.getTitle();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PieceProduct that = (PieceProduct) o;
        return getMass() == that.getMass() && getTitle().equals(that.getTitle()) && getDescription().equals(that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getMass());
    }

    @Override
    public String toString() {
        return "PieceProduct [" +
                "title=" + PieceProduct.super.getTitle() + ", description=" + PieceProduct.super.getDescription() + ", mass=" + mass + ']';
    }
}
