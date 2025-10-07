package com.game.deck;

import java.util.Collections;

import com.game.deck.model.Deck;
import com.game.deck.sort.CardComparator;

public class CardDeckApplication {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		for (int i=0;i<52;i++) {
			deck.shuffleCards();
		}
		
		deck.getCards().forEach(t -> {
			System.out.print(t);
			System.out.println();
		});
		
		Collections.sort(deck.getCards(), new CardComparator());
		
		System.out.println("------------------------------");
		
		deck.getCards().forEach(t -> {
			System.out.print(t);
			System.out.println();
		});
	}
	
	

}
