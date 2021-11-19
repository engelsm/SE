public class BetMore_Game {
	Shuffle s = new Shuffle();
	
	public int Play() {
		return s.pick_card();
	}

	//true = computer win, false = player win
	public boolean FindWinner(Player c, Player p) {
		return p.cardNumber > c.cardNumber;
	}
	
}
