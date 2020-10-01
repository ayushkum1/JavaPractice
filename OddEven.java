import java.util.*;
class OddEven {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number to be checked :");

        int number = scan.nextInt();

        if(number % 2 == 0){
            System.out.println("Number is even!");
        }
        else{
            System.out.println("Number is odd!");
        }
    }
}