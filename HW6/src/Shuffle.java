import java.util.Random;

public class Shuffle {
	Random r = new Random();
	
	public int pick_card() {
		return r.nextInt(100);
	}
}
