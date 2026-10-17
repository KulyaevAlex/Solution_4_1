package org.example;

public class Rectangle {
    private static int counter = 0;

    /**
     * Результат изменения сторон прямоугольника
     *
     * @param width  - Ширина
     * @param height - Высота
     */
    public record modifiedRectangle(double width, double height) {
    }

    private double widht;
    private double height;
    private int id;

    public Rectangle(double width, double height) {
        counter++;
        this.id = counter;
        this.widht = width;
        this.height = height;
    }

    public double getWight() {
        return widht;
    }

    public void setWight(double wight) {
        this.widht = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    /**
     * Метод, возвращающий площадь прямоугольника
     *
     * @return - Площадь прямоугольника
     */
    public double area() {
        return widht * height;
    }

    /**
     * Метод, возвращающий периметр прямоугольника
     *
     * @return - Периметр прямоугольника
     */
    public double perimeter() {
        return 2 * widht * height;
    }

    /**
     * Метод сравнения длины и ширины прямоугольника
     *
     * @return - true если ширина равна высоте
     */
    public boolean isSquare() {
        return widht == height;
    }

    /**
     * Метод изменения сторон прямоугольника на factor
     *
     * @param factor - Параметр, на который увеличиваются стороны
     * @return - Результат изменения
     */
    public modifiedRectangle scale(double factor) {
        return new modifiedRectangle(widht * factor, height * factor);
    }

    /**
     * Метод отображения всех характеристик прямоугольника
     */
    public void printInfo() {
        System.out.println("Id прямоугольника: " + id + " ширина = " + widht + " высота = " + height);
    }
}
