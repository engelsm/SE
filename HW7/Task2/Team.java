package Task2;

public class Team implements OlympicsTeam{
	String name;
	int numOfAthletes;
	int numOfGoldMedals;
	
	public Team(String name, int numOfAthletes, int numOfGoldMedals) {
		this.name = name;
		this.numOfAthletes = numOfAthletes;
		this.numOfGoldMedals = numOfGoldMedals;
	}

	@Override
	public void print() {
		System.out.println("Name: " + name + " ,Number of Athletes: " + numOfAthletes + " ,Number of Gold Medals: " + numOfGoldMedals);
	}


	@Override
	public void printNumOfAthletes() {
		System.out.println("Name: " + name + ", Number of Athletes: " + numOfAthletes);
		
	}

	@Override
	public void printNumOfGoldMedals() {
		System.out.println("Name: " + name + ", Number of Gold Medals: " + numOfGoldMedals);
		
	}
}
