package fr.wcs.model;

import java.util.Random;

public class Item {

    private String name;
    private String content;

    public Item(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Item(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
