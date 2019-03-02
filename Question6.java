package com.DesignPatterns;

interface Pizza {
    String info();
}

class PizzaCheeseMargherita implements Pizza {
    private String size;

    PizzaCheeseMargherita(String size) {
        this.size = size;
    }

    @Override
    public String info() {
        return "A Cheese Margherita Pizza of size " + size;
    }
}

class PizzaPeppyPaneer implements Pizza {
    private String size;

    PizzaPeppyPaneer(String size) {
        this.size = size;
    }

    @Override
    public String info() {
        return "A Peppy Paneer Pizza of size: " + size;
    }
}

class PizzaMexicanGreenWave implements Pizza {
    private String size;

    PizzaMexicanGreenWave(String size) {
        this.size = size;
    }

    @Override
    public String info() {
        return "A Mexican Green Wave Pizza of size: " + size;
    }
}

class AddOnExtra implements Pizza {
    private Pizza pizza;
    private String addExtra;

    AddOnExtra(Pizza pizza, String addExtra) {
        this.pizza = pizza;
        this.addExtra = addExtra;
    }

    @Override
    public String info() {
        return pizza.info() + " with extra: " + addExtra + " is ready.";
    }
}

public class Question6 {

    public static void main(String[] args) {

        PizzaMexicanGreenWave pizzaMexicanGreenWave = new PizzaMexicanGreenWave("Regular");
        System.out.println(pizzaMexicanGreenWave.info());

        AddOnExtra addOnExtra = new AddOnExtra(new PizzaMexicanGreenWave("Medium"), "Cheese");
        System.out.println(addOnExtra.info());
    }
}
