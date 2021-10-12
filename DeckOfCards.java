import java.util.Random;

public class DeckOfCards {

	static String hearts[] = { "♥️2", "♥️3", "♥️4", "♥️5", "♥️6", "♥️7", "♥️8", "♥️9", "♥️10", "♥️JACK", "♥️QUEEN",
			"♥️KING", "♥️ACE" };
	static String spades[] = { "♠️2", "♠️3", "♠️4", "♠️5", "♠️6", "♠️7", "♠️8", "♠️9", "♠️10", "♠️JACK", "♠️QUEEN",
			"♠️KING", "♠️ACE" };
	static String diamonds[] = { "♦️2", "♦️3", "♦️4", "♦️5", "♦️6", "♦️7", "♦️8", "♦️9", "♦️10", "♦️JACK", "♦️QUEEN",
			"♦️KING", "♦️ACE" };
	static String clubs[] = { "♣️2", "♣️3", "♣️4", "♣️5", "♣️6", "♣️7", "♣️8", "♣️9", "♣️10", "♣️JACK", "♣️QUEEN",
			"♣️KING", "♣️ACE" };

	static String deck[][] = { hearts, spades, diamonds, clubs };

	public static void cardSelection() {
		Random random = new Random();
		int suit = random.nextInt(4);
		int rank = random.nextInt(13);
		if (deck[suit][rank] == null) {
			cardSelection();
		} else {
			System.out.println(deck[suit][rank]);
		}
	}

	public static void cardDistribution() {
		for (int i = 1; i < 5; i++) {
			System.out.println("player" + i);
			for (int j = 1; j < 10; j++) {
				cardSelection();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome players");
		cardDistribution();
	}
}