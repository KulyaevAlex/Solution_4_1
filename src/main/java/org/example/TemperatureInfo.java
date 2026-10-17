package org.example;

public class TemperatureInfo {
    public static void main(String[] args) {
        Temperature temperatureCelsius = Temperature.fromCelsius(19.0);
        Temperature temperatureFahrenheit = Temperature.fromFahrenheit(9.0);
        Temperature temperatureKelvin = Temperature.fromKelvin(5.0);

        System.out.println("Celsius: " + temperatureCelsius.toString());
        System.out.println("Fahrenheit: " + temperatureFahrenheit.toString());
        System.out.println("Kelvin: " + temperatureKelvin.toString());
        System.out.println();

        System.out.println("Вернем температуру в градусах Цельсия " + temperatureCelsius.toCelsius());
        System.out.println("Вернем температуру в градусах Фаренгейта " + temperatureFahrenheit.toFahrenheit());
        System.out.println("Вернем температуру в Кельвинах " + temperatureKelvin.toKelvin());
        System.out.println();

        temperatureCelsius.printAll();
    }
}
