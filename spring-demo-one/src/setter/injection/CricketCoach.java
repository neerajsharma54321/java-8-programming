package setter.injection;

public class CricketCoach implements Coach {

	private String team;
	private String favouriteGround;
	private int totalPlayer;
	private String firstPlayer;
	
	private FortuneService fortuneService;
	 
	public CricketCoach() {
		System.out.println("cricket coach no arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFavouriteGround(String favouriteGround) {
		this.favouriteGround = favouriteGround;
	}

	public void setTotalPlayer(int totalPlayer) {
		this.totalPlayer = totalPlayer;
	}

	public void setFirstPlayer(String firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	public CricketCoach(FortuneService fortuneService) {
		 this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String workout() {
		return "Play like DhyanChand";
	}


	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortuneData();
	}

	@Override
	public String toString() {
		return "CricketCoach [team=" + team + ", favouriteGround=" + favouriteGround + ", totalPlayer=" + totalPlayer
				+ ", firstPlayer=" + firstPlayer + ", fortuneService=" + fortuneService + "]";
	}


	
	
	
}
