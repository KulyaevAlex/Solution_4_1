package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangleInfo {
    /**
     * Параметр увеличения сторон прямоугольника
     */
    static double factor = 3.0;

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(12.0, 16.0);
        Rectangle rectangle2 = new Rectangle(10.0, 10.0);
        Rectangle rectangle3 = new Rectangle(6.0, 11.0);

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);

        for (Rectangle rectangle : rectangles) {
            System.out.println("Площадь прямоугольника равна: " + rectangle.area());
        }
        System.out.println();

        for (Rectangle rectangle : rectangles) {
            System.out.println("Периметр прямоугольника равен: " + rectangle.perimeter());
        }
        System.out.println();

        for (Rectangle rectangle : rectangles) {
            System.out.println("Для прямоугольника с id: " + rectangle.getId() +
                    (rectangle.isSquare() ? " ширина пряугольника равна высоте" : " разные значения ширины и высоты"));
        }
        System.out.println();

        for (Rectangle rectangle : rectangles) {
            rectangle.printInfo();
        }
        System.out.println();

        for (Rectangle rectangle : rectangles) {
            System.out.println("Ширина измененного прямоугольника: " + rectangle.scale(factor).width());
            System.out.println("Высота измененного прямоугольника: " + rectangle.scale(factor).height());
        }
    }
}