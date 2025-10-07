package com.game.deck.sort;

import java.util.Comparator;

import com.game.deck.model.Card;

public class CardComparator implements Comparator<Card>{

	@Override
	public int compare(Card o1, Card o2) {
		
		int value = Integer.compare(o1.suit().ordinal(), o2.suit().ordinal());
		if (value !=0) {
			return value;
		}
		return Integer.compare(o1.rank().ordinal(), o2.rank().ordinal());
	}

}
