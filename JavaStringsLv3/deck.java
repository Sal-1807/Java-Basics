package JavaStringsLv3;
import java.util.Scanner;
public class deck {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Get input for number of players and cards per player
        System.out.print("Enter the number of players: ");
        int players = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Distribute the cards
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute.");
        } else {
            String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
            printPlayerCards(distributedCards);
        }

        scanner.close();
    }

    private static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    private static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    private static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        return playerCards;
    }

    private static void printPlayerCards(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playerCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}

