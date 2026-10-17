package org.example;

public class Temperature {
    /**
     * двиг шкалы при переводе из градусов Цельсия в градусы Фаренгейта
     */
    public static final double FAHRENHEIT_OFFSET = 32;
    /**
     * Температура абсолютного нуля в градусах Цельсия соответствует 0 кельвинов
     */
    public static final double KELVIN_ZERO_OFFSET = -273.15;

    private double value;

    public Temperature(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Метод возвращает объект Temperature из значения в градусах Цельсия.
     */
    public static Temperature fromCelsius(double celsius) {
        return new Temperature(celsius);
    }

    /**
     * Метод возвращает объект Temperature, конвертируя значение из Фаренгейта в Цельсий.
     */
    public static Temperature fromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - FAHRENHEIT_OFFSET) * 5.0 / 9.0;
        return new Temperature(celsius);
    }

    /**
     * Метод возвращает объект Temperature, конвертируя значение из Кельвинов в Цельсий.
     */
    public static Temperature fromKelvin(double kelvin) {
        double celsius = kelvin - KELVIN_ZERO_OFFSET;
        return new Temperature(celsius);
    }

    public Temperature toKelvin(double value) {
        double kelvin = value + KELVIN_ZERO_OFFSET;
        return new Temperature(kelvin);
    }

    /**
     * Возвращает температуру в градусах Цельсия.
     */
    public double toCelsius() {
        return value;
    }

    /**
     * Возвращает температуру в градусах Фаренгейта.
     */
    public double toFahrenheit() {
        return 9.0 * value / 5.0 + FAHRENHEIT_OFFSET;
    }

    /**
     * Возвращает температуру в Кельвинах.
     */
    public double toKelvin() {
        return value + KELVIN_ZERO_OFFSET;
    }

    /**
     * Метод печати температуры во всех трёх шкалах
     */
    public void printAll() {
        System.out.println(toCelsius() + " градусы Цельсия");
        System.out.println(toFahrenheit() + " градусы Фаренгейта");
        System.out.println(toKelvin() + " Кельвины");
    }

    @Override
    public String toString() {
        return value + "";
    }
}