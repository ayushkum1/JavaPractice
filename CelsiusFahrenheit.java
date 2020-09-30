import java.util.*;

class Conversion{
    public static void main(String args[]) {
        
        Float temperature;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius :");

        temperature = scan.nextFloat();

        // calling temperateConversion() with temperature as parameter
        // the temperateConversion() will return the converted value
        System.out.println("Converted temperature is : " + temperateConversion(temperature));

        //this can also be done as below, though i have commented it for now
        //one can uncomment the below 2 lines and see the result

        //float converted_temperature = temperateConversion(temperature);
        //System.out.println("Converted temperature is : " + converted_temperature);

    }

    public static float temperateConversion(float t){
        return (t*9/5) + 32;
    }
}