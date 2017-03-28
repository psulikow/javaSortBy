
public class Player {

	
	private String firstName;
	private String lastName;
	private Double battingAverage;
	private Integer RBI;
	private Integer strikeOuts;
	private Integer homeRuns;

	public Player(String firstName, String lastName, Double battingAverage, int RBI, int strikeOuts, int homeRuns) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.battingAverage = battingAverage;
		this.RBI = RBI;
		this.strikeOuts = strikeOuts;
		this.homeRuns = homeRuns;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(Double battingAverage) {
		this.battingAverage = battingAverage;
	}

	public Integer getRBI() {
		return RBI;
	}

	public void setRbi(Integer rbi) {
		this.RBI = RBI;
	}

	public Integer getStrikeOuts() {
		return strikeOuts;
	}

	public void setStrikeOuts(Integer strikeOuts) {
		this.strikeOuts = strikeOuts;
	}
	
	public Integer getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(Integer homeRuns) {
		this.homeRuns = homeRuns;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " -" + " Batting Average= " + battingAverage
				+ ", Runs Batted In= " + RBI + ", Strike Outs= " + strikeOuts + ", Home Runs= " + homeRuns;
	}

	
	}
	
