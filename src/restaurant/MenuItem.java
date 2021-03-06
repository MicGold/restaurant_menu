package restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    public static final String[] CATEGORIES = {"Entree", "Dessert", "Appetizer"};

    public MenuItem(double price, String category, String description, boolean isNew) {
        //TODO: validation
        this.price = price;
        this.description = description;
        this.isNew = isNew;
        //Check valid category
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        //TODO: validation
        this.price = price;
    }

    public void setDescription(String description) {
        //TODO: validation
        this.description = description;
    }

    public void setCategory(String category) {
        //TODO: validation
        this.category = category;
    }

    public Boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        //TODO: validation
        isNew = aNew;
    }
}
