package bean.scope.example;

public class CricketCoach implements Coach {

	private String team;
	private String favouriteGround;
	private int totalPlayer;
	private String firstPlayer;
	
	private static int counter = 0;
	
	 
	public CricketCoach() {
		counter+=1;
		System.out.println("cricket coach no arg constructor");
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
	
	@Override
	public String workout() {
		return "Play like DhyanChand";
	}

	@Override
	public String toString() {
		return "counter is = "+counter+",\tCricketCoach [team=" + team + ", favouriteGround=" + favouriteGround + ", totalPlayer=" + totalPlayer
				+ ", firstPlayer=" + firstPlayer+"]";
	}


	
	
	
}
