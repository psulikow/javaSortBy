import java.util.Comparator;

public class StrikeOutsComparator implements Comparator<Player>	{
	@Override
	public int compare(Player player1, Player player2) {
		return -player1.getStrikeOuts().compareTo(player2.getStrikeOuts());
	}
}
