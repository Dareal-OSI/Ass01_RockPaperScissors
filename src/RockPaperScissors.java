import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean done = false;

        do {
            // Get Player A's move, loop until it is valid
            do {
                System.out.print("Player A, enter your move [R, P, S]: ");
                playerA = in.nextLine().trim();
                if (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid move: \"" + playerA + "\". Please enter R, P, or S.");
                }
            } while (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")));

            // Get Player B's move, loop until it is valid
            do {
                System.out.print("Player B, enter your move [R, P, S]: ");
                playerB = in.nextLine().trim();
                if (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid move: \"" + playerB + "\". Please enter R, P, or S.");
                }
            } while (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")));

            // Display the results
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock, it's a Tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper, it's a Tie!");
                } else {
                    System.out.println("Scissors cuts Paper, Player B wins!");
                }
            } else {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper, Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors, it's a Tie!");
                }
            }

            // Ask to play again
            System.out.print("Play again? [Y/N]: ");
            playAgain = in.nextLine().trim();
            if (!playAgain.equalsIgnoreCase("Y")) {
                done = true;
            }
            System.out.println();
        } while (!done);

        System.out.println("Thanks for playing!");
    }
}
