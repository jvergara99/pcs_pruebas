package main.java.uv.herenciapoo;

public class Rectangle extends Figure implements Redimension {
    private double width;
    private double height;

    public Rectangle () {
        // super(numberOfSides = 4)
        super(4);
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
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public void redimension(double factor) {
        this.width *= factor;
        this.height *= factor;
    }
}
