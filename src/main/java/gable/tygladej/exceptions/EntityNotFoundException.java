package gable.tygladej.exceptions;

public class EntityNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntityNotFoundException() {
		super();		
	}

	public EntityNotFoundException(String message) {
		super(message);		
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
