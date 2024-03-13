package main.java.uv.herenciapoo;

public class Triangle extends Figure {
    private double width;
    private double height;

    public Triangle() {
        // super(numberOfSides = 3)
        super(3);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        return width * getNumberOfSides();
    }
}
