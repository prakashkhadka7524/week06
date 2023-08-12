package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name, List<Card> hand, int score) {
		this.hand=hand;
		this.name=name;
		this.score=0;
			}
	public Player() {
			}
	
	public void draw(Deck deck) { 
		hand.add(deck.draw());
	}
	public Card flip() {
		return hand.remove(0);
	}
	public void incrementscore() {
		 score++;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
