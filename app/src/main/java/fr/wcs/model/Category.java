package fr.wcs.model;

import java.util.List;

public class Category {

    private List<Item> items;

    public Category(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
