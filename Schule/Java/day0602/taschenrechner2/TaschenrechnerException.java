package day0602.taschenrechner2;

public class TaschenrechnerException extends Exception {

	private String exceptionReason;

	public TaschenrechnerException(String exceptionReason) {
		this.exceptionReason = exceptionReason;
	}

}
