package main.java.uv.herenciapoo;

public class Main {
    public static void main(String[] args) {
        // Rectangle class
        Rectangle rectangle = new Rectangle();
        double width = 3;
        double height = 5;

        rectangle.setWidth(width);
        rectangle.setHeight(height);
        
        System.out.println("Rectangle");
        System.out.println("Number of sides = " + rectangle.getNumberOfSides());
        System.out.println("width = " + rectangle.getWidth() + "\theight = " + rectangle.getHeight());
        System.out.println("Area = " + rectangle.getArea() + "\tPerimeter = " + rectangle.getPerimeter());
        System.out.println("---------------------");

        int factor = 2;
        rectangle.redimension(factor);
        System.out.println("After redimension by " + factor);
        System.out.println("---------------------");

        System.out.println("width = " + rectangle.getWidth() + "\theight = " + rectangle.getHeight());
        System.out.println("Area = " + rectangle.getArea() + "\tPerimeter = " + rectangle.getPerimeter());

        
        // Triangle class
        Triangle triangle = new Triangle();
        triangle.setWidth(3);
        triangle.setHeight(4);

        System.out.println("\nTriangle\nNumber of sides = " + triangle.getNumberOfSides());
        System.out.println("Area = " + triangle.getArea() + "\tPerimeter = " + triangle.getPerimeter());
    }
}
