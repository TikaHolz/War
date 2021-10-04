import java.util.ArrayList;
public class PlayWar
	{
	static ArrayList<Card> playerTwoHand = new ArrayList<Card>();
	static ArrayList<Card> playerOneHand = new ArrayList<Card>();
		public static void main(String[] args)
			{
			Deck.fillDeck();
			Deck.shuffle();
			dealCards();
			pullCard();
			
			//each player gets 26 cards DONE
			//two face down decks. players pull a card. flip it over. Largest value wins. winner takes both cards
			//if tie, place another card down each. largest value wins. winner takes all cards
			//at the end of the game person with all of the cards win
			}
		public static void dealCards()
			{
			//player one hand
			for(int i = 0; i < ((Deck.deck.size())/2); i++)
				{
				playerOneHand.add(Deck.deck.get(0));
				Deck.deck.remove(0);
				}
			//player two hand
			for(int i = 0; i < ((Deck.deck.size())/2); i++)
				{
				playerTwoHand.add(Deck.deck.get(0));
				Deck.deck.remove(0);
				}
			}	

		public static void pullCard()
			{
			for(Card c: playerOneHand)
				{
					
				}
			for(Card d: playerTwoHand)
				{
					
				}
			}
	}
