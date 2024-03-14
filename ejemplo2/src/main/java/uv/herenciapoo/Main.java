package main.java.uv.herenciapoo;

public class Main {
    
    public static void printRectangle(Rectangle rectangle) {
        System.out.println("Rectangle");
        System.out.printf("width = %.2f\theight = %.2f\n", rectangle.getWidth(), rectangle.getHeight());
        System.out.printf("area = %.2f\tperimeter = %.2f\n", rectangle.getArea(), rectangle.getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(3);

        printRectangle(rectangle);

        rectangle.redimension(3);
        System.out.println("---- After redimension ----");

        printRectangle(rectangle);
    }
}
