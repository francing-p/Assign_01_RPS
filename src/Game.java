import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String moveA="";
        String moveB="";
        String end="";


        do {
            do {
                System.out.print("Player A. Enter your move using R,P, or S: ");
                moveA = in.nextLine();
            }
            while(!moveA.equals("R") && !moveA.equals("P") && !moveA.equals("S"));
            do {
                System.out.print("Player B. Enter your move using R, P, or S: ");
                moveB = in.nextLine();
            }
            while(!moveB.equals("R") && !moveB.equals("P") && !moveB.equals("S"));
            if (moveA.equals("R")) {
                if (moveB.equals("R")) {
                    System.out.println("Rock vs. Rock. Tie");
                } else if (moveB.equals("P")) {
                    System.out.println("Rock vs. Paper. Player B wins");
                } else if (moveB.equals("S")) {
                    System.out.println("Rock vs. Scissors. Player A wins");
                }
            } else if (moveA.equals("P")) {
                if (moveB.equals("R")) {
                    System.out.println("Paper vs. Rock. Player A wins");
                } else if (moveB.equals("P")) {
                    System.out.println("Paper vs. Paper. Tie");
                } else if (moveB.equals("S")) {
                    System.out.println("Paper vs. Scissors. Player B wins");
                }

            } else if (moveA.equals("S")) {
                if (moveB.equals("R")) {
                    System.out.println("Scissors vs. Rock. Player B wins");
                } else if (moveB.equals("P")) {
                    System.out.println("Scissors vs. Paper. Player A wins");
                } else if (moveB.equals("S")) {
                    System.out.println("Scissors vs. Scissors. Tie");
                }
            }
            System.out.print("Would you like to continue? Y or N: ");
            if (in.hasNextLine()) {
                end = in.nextLine();
            }
        }
        while(end.equals("Y"));
    }
}
