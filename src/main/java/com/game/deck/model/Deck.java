package com.game.deck.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.game.deck.enums.RANK;
import com.game.deck.enums.SUIT;
import com.game.deck.exception.EmptyDeckException;

public class Deck {
	
	private List<Card> cards;
	
	
	public Deck() {
		initilizeDeckOfCards();
	}
	
	public void initilizeDeckOfCards() {
		cards = new ArrayList<Card>();
		
		for (SUIT suit : SUIT.values()) {
			for (RANK rank : RANK.values()) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	
	public void shuffleCards() {
		Collections.shuffle(cards);
	}
	
	public Card drawCard() {
		if (cards.isEmpty()) {
			throw new EmptyDeckException("No More cards available");
		}
		return cards.remove(cards.size()-1);
	}

}
