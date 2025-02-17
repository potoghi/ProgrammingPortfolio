import java.util.*;

public class FahrenheitConverter {

    public static double fahrenheitToKelvinConverter(double fTemp) {
        double conversion = ((fTemp - 32) * ((double) 5 / 9) + 273.15);
        return conversion;
    }


    public static double fahrenheitToCelsiusConverter(double fTemp) {
        double conversion = ((fTemp - 32) * ((double) 5 /9));
        return conversion;
    }


    public static void main(String[] args) {

        System.out.print("Enter the temperature in Fahrenheit: ");
        Scanner scan = new Scanner(System.in);
        double fahrenheitTemperature = scan.nextDouble();

        System.out.print("Enter Fahrenheit Temperature: " + fahrenheitTemperature + "\n");
        System.out.print("Conversion to Kelvin: " + fahrenheitToKelvinConverter(fahrenheitTemperature) + ("K") + "\n");
        System.out.print("Conversion to Celsius: " + fahrenheitToCelsiusConverter(fahrenheitTemperature) + ("C") + "\n");


        System.out.println("Hello, World!");
    }


}