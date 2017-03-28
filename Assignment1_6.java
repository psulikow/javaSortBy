import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment1_6 {

	public static void main(String[] args) throws ParseException {
		ArrayList<Player> players = new ArrayList<Player>();
		
		players.add(new Player("Dexter", "Fowler", 0.242, 5, 16, 2));
		players.add(new Player("Kris", "Bryant", 0.268, 7, 20, 2));
		players.add(new Player("Anthony", "Rizzo", 0.246, 7, 12, 2));
		players.add(new Player("Ben", "Zobrist", 0.236, 4, 10, 0));
		players.add(new Player("Addison", "Russell", 0.196, 6, 12, 2));
		players.add(new Player("Jason", "Heyward", 0.128, 1, 12, 0));
		players.add(new Player("Javier", "Baez", 0.271, 7, 17, 1));
		players.add(new Player("Jon", "Lester", 0.000, 0, 4, 0));
		players.add(new Player("David", "Ross", 0.200, 3, 3, 1));
		
		
		Scanner console = new Scanner(System.in);
		
		
		while (true) {
			
		System.out.println("\nPlease make a selection to see the Cubs starting linuep player stats through Game 5 of the 2016 World Series:\n");
		System.out.println("Sort by Player First Name :[1]");
		System.out.println("Sort by Player Last Name :[2]");
		System.out.println("Sort by Batting Average :[3]");
		System.out.println("Sort by Strike Outs :[4]");
		System.out.println("Sort by Runs Batted In :[5]");
		System.out.println("Sort by Home Runs :[6]\n");
		System.out.println("Please make a selection or enter 0 to exit: ");
		int inputValue = console.nextInt();

		switch(inputValue) {
		case 0:
			System.out.println("Exiting...See you next time!");
			System.exit(0);
			break;
			
		case 1:
			sortByFirstName(players);
			break;
			
		case 2:
			sortByLastName(players);
			break;
			
		case 3:
			sortByBattingAverage(players);
			break;
			
		case 4:
			sortByStrikeOuts(players);
			break;
			
		case 5:
			sortByRBI(players);
			break;
			
		case 6:
			sortByHomeRuns(players);
			break;
			
		default:
			System.out.println("\n");
			System.out.println("***INVALID ENTRY, Please try again***");
			System.out.println("\n");

			break;
		}
		
		System.out.println("-----------------------------------------\n");
		
		for(Player p : players) {
			System.out.println(p);	
			System.out.println("\n");
		}
		
		System.out.println("-----------------------------------------");
		
		}
	}
			
	private static void sortByFirstName(ArrayList<Player> players) {
		Collections.sort(players, new FirstNameComparator());
		
	}

	private static void sortByLastName(ArrayList<Player> players) {
		Collections.sort(players, new LastNameComparator());
		
	}

	private static void sortByBattingAverage(ArrayList<Player> players) {
		Collections.sort(players, new BattingAverageComparator());
		
	}

	private static void sortByRBI(ArrayList<Player> players) {
		Collections.sort(players, new RBIComparator());
		
	}

	private static void sortByStrikeOuts(ArrayList<Player> players) {
		Collections.sort(players, new StrikeOutsComparator());
		
	}

	private static void sortByHomeRuns(ArrayList<Player> players) {
		Collections.sort(players, new HomeRunsComparator());
		
	}
			
		

}
