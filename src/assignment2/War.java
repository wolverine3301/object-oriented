package assignment2;

import java.util.ArrayList;

public abstract class War {
	public Deck deck = new Deck();
	private boolean WAR;
	public ArrayList<Player> PLAYERS_IN = new ArrayList<Player>();
	
	public abstract void turn();
	public abstract void placeCards();	
	public abstract void clearTable(Player p);
	public abstract void war();
	public abstract void play();
	public void give_players_cards() {
		for(int i = 0; i < deck.getDECK_SIZE();) {
			for(Player j : PLAYERS_IN) {
				j.addCardToHand(deck.getCard(i));
				i++;
				if(i >= deck.getDECK_SIZE()) {break;}
			}
		}
	}
}
