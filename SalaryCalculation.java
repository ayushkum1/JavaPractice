import java.util.*;

class SalaryCalculation{
    public static void main(String args[]) {
        
        //initialised values (they are actually constants)
        double medicalAllowance = 1200, travellingAllowance = 800, proTax = 300.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Basic Salary :");
        
        // taking String so as to check if the input was given or not by the user
        String basic = scan.nextLine();
        //once the input is given we convert it to double
        double basicPay = Double.parseDouble(basic);

        double result = basicPay + (basicPay * 0.4) + medicalAllowance + travellingAllowance - proTax;

        if(basic.length()<0){
            System.out.println("NO basic was given by user!");
        }

        else{
            System.out.println("Salary is : "+ result);
        }

    }
}