package ru.job4j.strategy;

/**
 * @author Ekaterina Kalashnikova(kalashnikovakaterina477@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Paint implements Shape {

    @Override
    public String draw() {
        return null;
    }

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Square square = new Square();
        Triangle triangle = new Triangle();
        Paint paint = new Paint();
        new Paint().draw(square);
        new Paint().draw(triangle);
    }
}
