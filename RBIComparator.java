import java.util.Comparator;

public class RBIComparator implements Comparator<Player>	{
	@Override
	public int compare(Player player1, Player player2) {
		return -player1.getRBI().compareTo(player2.getRBI());
	}
}
