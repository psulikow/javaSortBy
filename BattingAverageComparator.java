import java.util.Comparator;

public class BattingAverageComparator implements Comparator<Player> {
	@Override
	public int compare(Player player1, Player player2) {
		return -player1.getBattingAverage().compareTo(player2.getBattingAverage());
	}

}
