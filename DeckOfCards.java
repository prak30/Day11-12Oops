
public class DeckOfCards {

	static String Hearts[] = { "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJACK", "HQUEEN", "HKING",
			"HACE" };
	static String Spades[] = { "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJACK", "SQUEEN", "SKING",
			"SACE" };
	static String Diamonds[] = { "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJACK", "DQUEEN", "DKING",
			"DACE" };
	static String Clubs[] = { "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJACK", "CQUEEN", "CKING",
			"CACE" };

	static String deck[][] = { Hearts, Spades, Diamonds, Clubs };

	public static void main(String[] args) {
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.println(" " + deck[i][j]);
			}
			System.out.println();
		}
	}
}