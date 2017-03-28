import java.util.Comparator;

public class HomeRunsComparator implements Comparator<Player>	{
	@Override
	public int compare(Player player1, Player player2) {
		return -player1.getHomeRuns().compareTo(player2.getHomeRuns());
	}
}
