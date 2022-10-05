import java.util.Random;

public class Card {
	
	private String types;
    private int index;
	public String[] typesString = { "Coeur", "Pique", "trèfle", "Carreau" };
 	public int[] indexString = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
 	
    public Card() {
     	this.index = setCardIndex(indexString);
    	this.types = setCardType(typesString);
    }
    
    public static Card CreateCard() {
         Card card = new Card();
         return card;
    }  
    
    public @Override String toString() {    	
    	return "Carte: {"
    			+ "type=" + this.types.toString() + ", "
    			+ "index=" + this.index 
    			+ "}";
    }
   
    public boolean compareTo(Card opponentCard) {
    	return (this.index > opponentCard.index);
    }
    
    public boolean equalTo(Card opponentCard) {
    	return (this.index == opponentCard.index);
    }
    
    
	private static int setCardIndex(int[] index) {
    	int rnd = new Random().nextInt(index.length);
    	return index[rnd];
    }
    
    private static String setCardType(String[] types) {
    	int rnd = new Random().nextInt(types.length);
    	return types[rnd];
    }
    

}
