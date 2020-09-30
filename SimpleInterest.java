import java.util.*;

class SimpleInterest {
    
    public static void main(String args[]) {
        
        float principle_amount, interest_rate, years;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Principle amount :");
        principle_amount = scan.nextFloat();

        System.out.println("Enter the Interest rate (per year) :");
        interest_rate = scan.nextFloat();
        
        System.out.println("Enter the number of Years :");
        years = scan.nextFloat();
        
        System.out.println("Simple Interest is : " + (principle_amount * interest_rate * years)/100);

    }

}