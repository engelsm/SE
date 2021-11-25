package Task2;

public class Client {

	public static void main(String[] args) {
		Team Teakwondo = new Team("Teakwondo",10,1);
		Team Waterpolo = new Team("Waterpolo", 14, 3);
		Team ArtisticsGymnastics = new Team("Artistics Gymnastics",7,0);
		Team Shooting = new Team("Shooting", 24, 7);
		Team Cycling = new Team("Cycling",11, 1);
		Team Tennis = new Team("Tennis", 26, 2);
		Team TableTennis = new Team("TableTennis", 20, 5);
		Team Football = new Team("Football", 44, 4);
		Team AlpineSky = new Team("Alpine Sky", 4,0);
		Team Football2 = new Team("Football", 42, 1);
		Team SwimmingTeam = new Team("Swimming Team", 13, 4);
		
		Composite Olympia = new Composite();
		
		Composite AsiaTeam = new Composite();
		Composite AfricaTeam = new Composite();
		Composite EuropeTeam = new Composite();
		Composite SouthAmericaTeam = new Composite();
		
		Composite ChinaTeam = new Composite();
		Composite AfghanistanTeam = new Composite();
		Composite GermanyTeam = new Composite();
		Composite ItalyTeam = new Composite();
		
		Composite WomensTeamChina = new Composite();
		Composite MensTeamChina = new Composite();
		Composite WomensTeamGermany = new Composite();
		Composite MensTeamGermany = new Composite();
		Composite WomensTeamItaly = new Composite();
		Composite MensTeamItaly = new Composite();
		
		Olympia.addTeam(AsiaTeam);
		Olympia.addTeam(AfricaTeam);
		Olympia.addTeam(EuropeTeam);
		Olympia.addTeam(SouthAmericaTeam);
		
		AsiaTeam.addTeam(ChinaTeam);
		AsiaTeam.addTeam(AfghanistanTeam);
		
		EuropeTeam.addTeam(GermanyTeam);
		EuropeTeam.addTeam(ItalyTeam);
		
		
		ChinaTeam.addTeam(WomensTeamChina);
		ChinaTeam.addTeam(MensTeamChina);
		
		GermanyTeam.addTeam(WomensTeamGermany);
		GermanyTeam.addTeam(MensTeamGermany);
		
		ItalyTeam.addTeam(WomensTeamItaly);
		ItalyTeam.addTeam(MensTeamItaly);
		
		WomensTeamChina.addTeam(Teakwondo);
		WomensTeamChina.addTeam(Waterpolo);
		WomensTeamChina.addTeam(ArtisticsGymnastics);
		
		MensTeamChina.addTeam(Shooting);
		
		WomensTeamGermany.addTeam(Cycling);
		WomensTeamGermany.addTeam(Tennis);
		
		MensTeamGermany.addTeam(TableTennis);
		MensTeamGermany.addTeam(Football);
		
		WomensTeamItaly.addTeam(AlpineSky);
		
		MensTeamItaly.addTeam(Football2);
		MensTeamItaly.addTeam(SwimmingTeam);
		
		//-----------------------
		System.out.println("Germany Men’s Team");
		MensTeamGermany.printNumOfAthletes();
		System.out.println("Germany");
		GermanyTeam.printNumOfGoldMedals();
		System.out.println("Asia’s Team");
		AsiaTeam.printNumOfGoldMedals();
		System.out.println("Olympic 2024");
		Olympia.printNumOfAthletes();
		
	}
	
}
