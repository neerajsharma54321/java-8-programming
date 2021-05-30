package staticdemo;

public class FinalVariableDemo {
	
	// instance variable - final blank variable
	public final String PAN_CARD_NUMBER;
	
	public FinalVariableDemo(String panCardNumber) {
		this.PAN_CARD_NUMBER = panCardNumber;
	}
	
	public String toString() {
		return "FinalVariableDemo"+ "[PAN CARD NUMBER = "+this.PAN_CARD_NUMBER+"]";
	}
	
	public static void main(String []s) {
		FinalVariableDemo fvd = new FinalVariableDemo("FZAPQP6145");
		System.out.println(fvd);
		
	}
}
