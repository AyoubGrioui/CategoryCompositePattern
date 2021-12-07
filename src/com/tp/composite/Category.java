package com.tp.composite;

import java.util.ArrayList;
import java.util.List;

public class Category implements IComponent {
    List<IComponent> children;
    private String label;
    private int level;

    public Category(String aLabel) {
        this.label = aLabel;
        this.children = new ArrayList<>();
    }

    @Override
    public String view() {

        StringBuilder sb = new StringBuilder(getLabel());
        for (IComponent c : children) {
            sb.append("\n")
                    .append("\t".repeat(c.getlevel()))
                    .append(c.view());
        }
        return sb.toString(); }


    public void add(IComponent c) {
        c.setLevel(level + 1);
        children.add(c);
    }

    public void deleteCategory(Category aCategory) {
        for (IComponent c : aCategory.children) {
            if (c instanceof Category) {
                deleteCategory((Category) c);
            }
        }
        children.remove(aCategory);
    }

    public String getLabel() {
        return label;
    }

    public List<IComponent> getChildren() {
        return children;
    }


    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getlevel() {
        return level;
    }
}
