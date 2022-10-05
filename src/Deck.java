import java.util.ArrayList;

public class Deck extends Card{
	
static ArrayList<Card> deck = new ArrayList<>();
	
	//Deck creation
	public static ArrayList<Card> CreateDeck()
	{
		for(int i=1; i<=10; i++)
			{
				Card newCard = CreateCard();
				deck.add(newCard);
			}
		
		return deck;
	}
	

}



