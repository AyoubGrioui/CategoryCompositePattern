package com.tp.composite;

public class Product implements IComponent {

    private String label;
    private int level;
    public Product(String aLabel) {
        this.label = aLabel;
    }

    @Override
    public String view() {
        return label;
    }

    @Override
    public void setLevel(int Level) {
        this.level = Level;
    }

    @Override
    public int getlevel() {
        return level;
    }
}
