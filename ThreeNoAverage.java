import java.util.*;
class Average{
    public static void main(String args[]) {
        Float a, b, c;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");

        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();

        //this function isnt working, pressing enter takes to next line,
        //so the value can never be null like in string
        //should ask sir about this 
        if(a == null || b == null || c == null){
            System.out.println("Some number is missing!");
        }

        System.out.println("Average is : " + (a+b+c)/3);

    }
}