public class Game_Chair {
	Player Computer = new Player();
	Player Player_2 = new Player();
	BetMore_Game Bet = new BetMore_Game();
	
	public void main(String[] args) {
		Computer.user_selected = true;
		Computer.Start();
		Player_2.Start();
		System.out.println(Bet.FindWinner(Computer,Player_2));
	}
}
