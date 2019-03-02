package com.DesignPatterns;

interface PolygonShape {
    void getPolygon();
}

class Pentagon implements PolygonShape {

    @Override
    public void getPolygon() {
        System.out.println("This is Pentagon");
    }
}

class Hexagon implements PolygonShape {

    @Override
    public void getPolygon() {
        System.out.println("This is Hexagon");
    }
}

class Heptagon implements PolygonShape {

    @Override
    public void getPolygon() {
        System.out.println("This is Heptagon");
    }
}

class Polygon {
    private PolygonShape shape;

    PolygonShape getShape() {
        return shape;
    }

    void setShape(PolygonShape shape) {
        this.shape = shape;
    }
}

class PolygonFactory {
    static Polygon getPolygonObject(String name) {
        Polygon polygon = new Polygon();
        switch (name) {
            case "polygonWithFiveSides":
                polygon.setShape(new Pentagon());
                break;
            case "polygonWithSixSides":
                polygon.setShape(new Hexagon());
                break;
            case "polygonWithSevenSides":
                polygon.setShape(new Heptagon());
                break;
        }

        return polygon;
    }
}

public class Question2 {

    public static void main(String[] args) {
        Polygon polygonWithFiveSides = PolygonFactory.getPolygonObject("polygonWithFiveSides");
        polygonWithFiveSides.getShape().getPolygon();
        Polygon polygonWithSixSides = PolygonFactory.getPolygonObject("polygonWithSixSides");
        polygonWithSixSides.getShape().getPolygon();
        Polygon polygonWithSevenSides = PolygonFactory.getPolygonObject("polygonWithSevenSides");
        polygonWithSevenSides.getShape().getPolygon();
    }
}
