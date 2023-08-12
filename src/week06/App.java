package week06;

public class App {

	public static void main(String[] args) {
		Deck deck= new Deck();
		System.out.println("All the 52 cards are : ");
		deck.describe(); // call describe method to know all the cards
		System.out.println("------------------------------");
		System.out.println("All the shuffled cards are : ");
		deck.shuffle(); // calling the method
		deck.describe();
		System.out.println("-------------------------------");
		Player player1= new Player();
		Player player2= new Player();
		player1.setName("Prakash"); // give the name of the player1
		player2.setName("Archana"); // give a name of player 2
		
		for(int i=0; i<52; i++) {
			if(i%2==0) {
				player1.draw(deck); // player1 will get 26 cards
			}
			else  player2.draw(deck); // player2 will get 26 cards
		
	
		int round=1;
		for(int j=0; j<26; j++) {
			round++;
			Card card1= player1.flip();
			Card card2=player2.flip();
			System.out.println(player1.getName()+" plays :");
			card1.describe();
			System.out.println(player2.getName()+" plays :");
			card2.describe();
			
			if(card1.getValue()>card2.getValue()) {
				player1.incrementscore();
				System.out.println(player1.getName()+" wins the round");
			}
			else if(card2.getValue()>card1.getValue()) {
				player2.incrementscore();
				System.out.println(player2.getName()+" wins the game");
			}
			else System.out.println("Its a tie!");
		
		}
		int player1FinalScore=player1.getScore();
		System.out.println("Final score of "+player1.getName()+" is "+player1FinalScore);
		int player2FinalScore=player2.getScore();
		System.out.println("Final score of "+player2.getName()+" is "+player2FinalScore);
		
		if(player1FinalScore>player2FinalScore) {
			System.out.println(player1.getName()+" Wins the game");
		}
		else if(player1FinalScore<player2FinalScore) {
			System.out.println(player2.getName()+" wins the game");
		}
		else {
			System.out.println("Its a tie!!");
		}
	
	}
	}
}
