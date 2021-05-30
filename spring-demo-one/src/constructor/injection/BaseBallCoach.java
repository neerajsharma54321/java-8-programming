package constructor.injection;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	 public BaseBallCoach(FortuneService fortuneService) {
		 this.fortuneService = fortuneService;
	 }
	
	@Override
	public String workout() {
		return "Run Like Milkha";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortuneData();
	}

}
