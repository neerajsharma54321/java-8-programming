package bean.lifecycle;

public class CricketCoach implements Coach {

	private String team;
	private String favouriteGround;
	private int totalPlayer;
	private String firstPlayer;
	
	public void initData() {
		System.out.println("tu mera dil are lekar gayi");
	}
	
	public void destroyData() {
		System.out.println("dekho woh ja rahi h ........");
	}
	 
	public CricketCoach() {
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
		return "CricketCoach [team=" + team + ", favouriteGround=" + favouriteGround + ", totalPlayer=" + totalPlayer
				+ ", firstPlayer=" + firstPlayer+"]";
	}


	
	
	
}
