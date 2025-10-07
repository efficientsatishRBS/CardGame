package com.game.deck.exception;

public class EmptyDeckException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public EmptyDeckException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
