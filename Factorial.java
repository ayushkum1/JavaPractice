import java.util.*;

class Factorial {
    public static void main(String args[]) {

        //accepts value only till 12 as i am taking int. should check this
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number whose factorial is to be found : ");

        long number = scan.nextLong();

        if(number == 0){
            System.out.println("Factorial is : 1");
        }
        else{
            for(long i = number - 1l ; i > 0 ; i--){
                number *= i;
            }
            System.out.println("Factorial is : " + number);
        }
    }
}