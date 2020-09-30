import java.util.*;

class InputName{
    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();

        //checking if user has given any input or not. if no input then show the following
        if(name.length()<0){
            System.out.println("Hello " + name);
        }

        else{
            System.out.println("No name entered by the user");
        }
    }
}