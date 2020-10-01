import java.util.*;

class Factorial {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number whose factorial is to be found : ");

        int number = scan.nextInt();

        if(number == 0){
            System.out.println("Factorial is : 0");
        }
        else{
            for(int i = number-1 ; i > 0 ; i--){
                number *= i;
            }
            System.out.println("Factorial is : " + number);
        }
    }
}