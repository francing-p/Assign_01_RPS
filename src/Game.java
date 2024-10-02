import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String moveA="";
        String moveB="";
        String end="";


        do { // outside loop that restarts the entire thing when 'Y' or 'y' is entered
            do { // runs until receiving r,p,s or R,P,S
                System.out.print("Player A. Enter your move using [R/P/S] or [r/p/s]: ");
                moveA = in.nextLine();
            }
            while(!moveA.equalsIgnoreCase("R") && !moveA.equalsIgnoreCase("P") && !moveA.equalsIgnoreCase("S")); // while move is not either r,p,s or R,P,S, continue the loop
            do { // runs until receiving r,p,s or R,P,S
                System.out.print("Player B. Enter your move using [R/P/S] or [r/p/s]: ");
                moveB = in.nextLine();
            }
            while(!moveB.equalsIgnoreCase("R") && !moveB.equalsIgnoreCase("P") && !moveB.equalsIgnoreCase("S")); // while move is not either r,p,s or R,P,S, continue the loop
            if (moveA.equalsIgnoreCase("R")) { // outer loop for moveA
                if (moveB.equalsIgnoreCase("R")) { // inner loop #1 for moveB
                    System.out.println("Rock vs. Rock. Tie");
                } else if (moveB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock. Player B wins");
                } else if (moveB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks scissors. Player A wins");
                }
            } else if (moveA.equalsIgnoreCase("P")) { // outer loop #2 moveA
                if (moveB.equalsIgnoreCase("R")) { // inner loop #2 for moveB
                    System.out.println("Paper covers rock. Player A wins");
                } else if (moveB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs. Paper. Tie");
                } else if (moveB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts paper. Player B wins");
                }

            } else if (moveA.equalsIgnoreCase("S")) { // outer loop #3 moveA
                if (moveB.equalsIgnoreCase("R")) { // inner loop #3 for moveB
                    System.out.println("Rock breaks scissors. Player B wins");
                } else if (moveB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts paper. Player A wins");
                } else if (moveB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs. Scissors. Tie");
                }
            }
            System.out.print("Would you like to continue? [Y/N]: ");
            if (in.hasNextLine()) {
                end = in.nextLine();
            }
        }
        while(end.equalsIgnoreCase("Y")); // continue when 'y' or 'Y' entered
    }
}
