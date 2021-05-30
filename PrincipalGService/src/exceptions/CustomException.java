package exceptions;

public abstract class CustomException extends Exception{
	private final String ERROR_CODE;
	
	 public CustomException(String message, String errorCode) {
		super(message);
		this.ERROR_CODE = errorCode;
	}
	 
	public String getErrorCode() {
		return this.ERROR_CODE;
	}
}
