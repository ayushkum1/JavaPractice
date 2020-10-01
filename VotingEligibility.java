import java.util.*;
class VotingEligibility {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Age : ");
        int age = scan.nextInt();

        if(age < 18){
            System.out.println("Sorry you are below the age of 18 and hence not eligible for voting.");
        }
        else{
            System.out.println("You are above the age of 18 and hence eligible for voting.");
        }
    }
}