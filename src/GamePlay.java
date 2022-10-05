import java.util.ArrayList;
import java.util.Collections;

public class GamePlay extends Deck{
	
	public static void main(String[] args) throws Exception {
	    
		Player player1 = new Player("Thrall");
		Player player2 = new Player("Yoda");
		
		//Deck
		ArrayList<Card> deck = CreateDeck();
		
        //Mix deck 
        Collections.shuffle(deck);
        
        //Divide the deck / 2
        for(int i = 0; i < deck.size(); i = i + 2) {
            player1.giveCard(deck.get(i));
            player2.giveCard(deck.get(i + 1));
        }
        
        System.out.println(player1.getName()+" :"+ player1.getHand());
        System.out.println(player2.getName()+" :" +player2.getHand());
        
        
        //Comparaison
        //hyper moche fonctionne une fois/20
        for(int i = 0; i < 100; i++) {
//player? gagne seulement si ↓ est ici
	        for(int i2 = player1.getHand().size(); i2 > 0; i2--) {
	            if (player1.getHand().get(i2 - 1).compareTo(player2.getHand().get(i2 - 1))) {
	                player1.pickUp((player2.getHand().get(i2 - 1)));
	                player2.getHand().remove(player2.getHand().get(i2 - 1));                        
	            } 
	            else if (player2.getHand().get(i2 - 1).compareTo(player1.getHand().get(i2 - 1))) {
	                player2.pickUp((player1.getHand().get(i2 - 1))); 
	                player1.getHand().remove(player1.getHand().get(i2 - 1));      
	            }
	            //WAR!!!
	            else if(player2.getHand().get(i - 1).equalTo(player1.getHand().get(i - 1))){
	            	
		        	if(player1.getHand().get(i2 - 3).compareTo(player2.getHand().get(i2 - 3))) {
		                player1.pickUp((player2.getHand().get(i2 - 1)));
		                player2.getHand().remove(player2.getHand().get(i2 - 1)); 
		        	}
		        	if(player2.getHand().get(i2 - 3).compareTo(player1.getHand().get(i2 - 3))) {
		                player2.pickUp((player1.getHand().get(i2 - 1)));
		                player1.getHand().remove(player1.getHand().get(i2 - 1));
		        	}
	            }
	            else {
	            	throw new Exception("bug dans la matrice");
	            }
	        }
        }
        

        
        System.out.println(" after:"+player1.getName()+" :"+ player1.getHand());
        System.out.println("   after:"+player2.getName()+" :" +player2.getHand());
        
        
          //The Winner is...
		  if (player1.getHand().isEmpty()) {
		      System.out.println(player2.getName() + " WIN");
		  } 
		  else if (player2.getHand().isEmpty()) {
		      System.out.println(player1.getName() + " WIN");
		  } 
		  else {
		      System.out.println("Equality bug ?");
		  }
        
	}
	
}
