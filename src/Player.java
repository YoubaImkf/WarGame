import java.util.ArrayList;

public class Player {
	private String name;
	private int score;
	
	private ArrayList<Card> hand = new ArrayList<>();
	
	public Player( String name) {
		this.name = name;
	}
	
    public String getName() {
        return this.name;
    }
    
    //Hand
    public ArrayList<Card> getHand() {
        return hand;
    }
   
    public void giveCard(Card card) {
        hand.add(card);
    }
    //same ↕ mais je prefere les differencier 
    public void pickUp(Card card) {
        hand.add(card);
    }
    
    //score
    public int getScore() {
        return score;
    }
    
    public void setPoints(int points) {
        this.score += points;
    }
    
    

}
