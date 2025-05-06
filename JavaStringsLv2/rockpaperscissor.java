package JavaStringsLv2;
import java.util.Scanner;
public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of games you want to play:");
        int numberOfGames = scanner.nextInt();
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < numberOfGames; i++) {
            System.out.println("Enter your choice (rock, paper, scissors):");
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("User")) {
                userWins++;
                System.out.println("You win this round!");
            } else if (winner.equals("Computer")) {
                computerWins++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
        }

        String[][] stats = calculateStats(userWins, computerWins, numberOfGames);
        displayResults(stats);
        scanner.close();
    }

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = (int) (Math.random() * 3);
        return choices[randomIndex];
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Tie";
        }
        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userWinPercentage = (userWins / (double) totalGames) * 100;
        double computerWinPercentage = (computerWins / (double) totalGames) * 100;

        String[][] stats = {
            {"Player Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"Player Win %", String.format("%.2f", userWinPercentage)},
            {"Computer Win %", String.format("%.2f", computerWinPercentage)}
        };
        return stats;
    }

    public static void displayResults(String[][] stats) {
        System.out.println("\nGame Results:");
        for (String[] row : stats) {
            System.out.printf("%-15s: %s%n", row[0], row[1]);
        }
    }
}
