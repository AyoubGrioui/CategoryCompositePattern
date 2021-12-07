package com.tp.composite;

public class Main {

    public static void main(String[] args) {
        Category category0 = new Category("category0");
        Category category01 = new Category("category01");
        Category category02 = new Category("category02");
        Category category021 = new Category("category021");

        Product product01 = new Product("Product01");
        Product product0211 = new Product("Product0211");

        category0.add(category01);
        category0.add(product01);
        category0.add(category02);
        category02.add(category021);
        category021.add(product0211);

        System.out.println(category0.view());

        category0.deleteCategory(category02);
        System.out.println("aprés suppression    : ");
        System.out.println(category0.view());
    }
}
