import java.util.ArrayList;
import java.util.Scanner;
public class PlayWar
	{
	static ArrayList<Card> playerTwoHand = new ArrayList<Card>();
	static ArrayList<Card> playerOneHand = new ArrayList<Card>();
	
	static String playerOneName;
	static String playerTwoName;
	static int valueOne;
	static int valueTwo;
	static boolean won = false;
	static int playerOneCounter = 0;
	static int playerTwoCounter = 0;
	static int timesPlayed = 0;
	
		public static void main(String[] args)
			{
			Design.name();
			playersName();
			Deck.fillDeck();
			Deck.shuffle();
			dealCards();
			
			for(int i = 0; i < 26; i++)
				{
				pullCardPlayerOne();
				pullCardPlayerTwo();
				chooseBiggerValue();
				enter();
				}	
			isWon();
			}
		
		
		public static void dealCards()
			{
			//player one hand
			for(int i = 0; i < 26; i++)
				{
				playerOneHand.add(Deck.deck.get(0));
				Deck.deck.remove(0);
				}
			//player two hand
			for(int i = 0; i < 26; i++)
				{
				playerTwoHand.add(Deck.deck.get(0));
				Deck.deck.remove(0);
				}
			}	
		public static void playersName()
			{
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("What is player one's name?");
			playerOneName = userStringInput.nextLine();
			
			//player two name
			System.out.println("What is player two's name?");
			playerTwoName = userStringInput.nextLine();
			System.out.println();
			}
		public static void pullCardPlayerOne()
			{
			System.out.println(playerOneName + "'s Card");
			System.out.println(playerOneHand.get(0).getRank());
			System.out.println(playerOneHand.get(0).getSuit());
			valueOne = playerOneHand.get(0).getValue();
			System.out.println();
			playerOneHand.remove(0);
			timesPlayed++;
			}
		public static void pullCardPlayerTwo()
			{
			System.out.println(playerTwoName + "'s Card");
			System.out.println(playerTwoHand.get(0).getRank());
			System.out.println(playerTwoHand.get(0).getSuit());
			valueTwo = playerTwoHand.get(0).getValue();
			playerTwoHand.remove(0);
			System.out.println();
			}
		public static void chooseBiggerValue()
			{
			if(valueOne>valueTwo)
				{
				System.out.println(playerOneName + " won this round!");
				System.out.println("_____________________________________________________________");
				playerOneCounter++;	
				System.out.println();
				}
			else
				{
				System.out.println();
				System.out.println(playerTwoName + " won this round!");
				System.out.println("_____________________________________________________________");
				playerTwoCounter++;	
				System.out.println();
				}
			}
		public static void enter()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hit enter to go to the next round");
			String enter = userInput.nextLine();
			
			}
		public static void isWon()
			{
			if(playerOneCounter> playerTwoCounter)
				{
				Design.winner();	
				won = true;
				System.out.println("                "+ playerOneName + " WON THE GAME!");
				}
			else
				{
				Design.winner();	
				won = true;
				System.out.println("                "+ playerTwoName + " WON THE GAME!");
				}
				
			}
	}
