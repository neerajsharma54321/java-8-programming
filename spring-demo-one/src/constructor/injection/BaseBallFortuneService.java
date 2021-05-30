package constructor.injection;

public class BaseBallFortuneService implements FortuneService {

	@Override
	public String getFortuneData() {
		return "Great ! It is your lucky day. Good Luck Baseball team";
	}

}
