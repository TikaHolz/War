import java.util.ArrayList;
public class PlayWar
	{
	static ArrayList<Card> playerTwoDeck = new ArrayList<Card>();
	static ArrayList<Card> playerOneDeck = new ArrayList<Card>();
		public static void main(String[] args)
			{
			
			public static void dealCards()
				{
				for(int i = 0; i < ((Deck.size)/2); i++)
					{
					playerOneDeck.add(Deck.deck.get(0));
					Deck.deck.remove(0);
					}
				}	
			
			//each player gets 26 cards
			//two face down decks. players pull a card. flip it over. Largest value wins. winner takes both cards
			//if tie, place another card down each. largest value wins. winner takes all cards
			//at the end of the game person with all of the cards win
			}

	}
