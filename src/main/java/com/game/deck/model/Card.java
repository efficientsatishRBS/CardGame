package com.game.deck.model;

import com.game.deck.enums.RANK;
import com.game.deck.enums.SUIT;

public record Card(SUIT suit, RANK rank) implements Comparable<Card>{

	@Override
	public int compareTo(Card other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.rank().ordinal(), other.rank().ordinal());
	}
	
	

}
