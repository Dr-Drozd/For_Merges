package org.classes;

import java.util.Objects;

public class WeightProduct extends Product {

    public WeightProduct(String title, String description) {
        super(title, description);
    }

    public String getTitle() {
        return super.getTitle();
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    public String getDescription() {
        return super.getDescription();
    }

    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeightProduct that = (WeightProduct) o;
        return getTitle().equals(that.getTitle()) && getDescription().equals(that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription());
    }

    @Override
    public String toString() {
        return "WeightProduct{" +
                "title=" + WeightProduct.super.getTitle() +
                ", description=" + WeightProduct.super.getDescription() +
                '}';
    }

}
