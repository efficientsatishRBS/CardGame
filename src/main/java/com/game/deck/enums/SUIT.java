package com.game.deck.enums;

public enum SUIT {
	
	CLUB(1),
	DIAMOND(2),
	HEART(3),
	SPADE(4);
	
	private int suitValue;

	SUIT(int suitValue) {
		this.suitValue = suitValue;
	}
	
	public int getSuitValue() {
		return suitValue;
	}
}
