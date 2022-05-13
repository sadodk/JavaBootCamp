import java.util.Scanner;

public class Survey {

    public static void main(String[] args) {
        // Scanner is the type, scan is the variable name of the new scanner instance
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome. Thank you for taking the survey");
        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("How much do you want to spend on coffee?");

        double coffeePrice = scan.nextDouble();
        

       // int age = scan.nextInt();
    }
}