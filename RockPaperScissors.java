///import javax.swing.text.html.HTMLDocument.RunElement;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Are you ready? Write 'yes' if you are.");

        //Task 1: See if the user wants to play.
        String ready = scan.nextLine();

        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!");
            // Save users choice
            String choice = scan.nextLine();
            String computerChoice = computerChoice();

            System.out.println("\nYou chose:\t" + choice);
            System.out.println("The computer chose:\t" + computerChoice);

            System.out.println(result(choice,computerChoice));
        } else {
            System.out.println("Darn, some other time...!");
        }
        
        scan.close();
    }

    public static String computerChoice() {
        double randomNumber = Math.random()*3; // range 0-2.999
        int integer = (int)randomNumber; // range 0 - 2
        integer++; // range 1-3

        switch (integer) {
            case 1: return "rock";
            case 2: return "paper";
            case 3: return "scissors";
            default: return ""; // impossible to return other than 1-3
        }

    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        /**
         * You "rock"       Computer "scissors"
         * You "paper"      Computer "rock"
         * You "scissors"   Computer "paper"
         * 
         *  
         */

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            result = "You lose!";
        }

        return result;
    }

    
}
