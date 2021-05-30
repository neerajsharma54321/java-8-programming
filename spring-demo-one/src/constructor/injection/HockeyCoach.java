package constructor.injection;

public class HockeyCoach implements Coach {

	private FortuneService fortuneService;
	 
	public HockeyCoach(FortuneService fortuneService) {
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
	
}
