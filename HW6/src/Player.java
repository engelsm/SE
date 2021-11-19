public class Player {
	BetMore_Game Bet = new BetMore_Game();

	int cardNumber;
	boolean user_selected = false;
	
	public void Start() {
		cardNumber = Bet.Play();
		for(int i = 0; i < 5 || user_selected == false; i++){
			cardNumber = Bet.Play();
		}
	}
	
	
}
