/**
 * Class for Hockey
 * @author anuccio
 *
 */
public class Hockey extends Sport{
	/** status of game */
	private boolean GameStatus;
	private int Homescore=0,Awayscore=0,Period=1;
	/**name of period */
	private static final String p = "Period";

	/** constructor for Hockey. sets the names of teams */
	public Hockey(String hometeam, String awayteam){
		super(hometeam,awayteam,p);
		GameStatus = true;
	}
	/** gets the home score */
	@Override
	public int getHomeScore() {
		return Homescore;
	}
	/*gets the away score */
	@Override
	public int getAwayScore() {

		return Awayscore;
	}
	/** sets the current period */
	@Override
	public void setperiod() {
		Period++;

		if(Period> 3){
			GameStatus = false;
		}
	}
	/** gets the period */
	@Override
	public int getperiod() {

		return Period;
	}
	/** gets the status of the game */
	@Override
	public boolean GameStatus() {
		if(GameStatus){
			return true;
		}
		else{
			return false;
		}

	}
	/**sets the home score */
	@Override
	public void setHomeScore(int h) {
		if(h==1){
			Homescore++;
		}

	}
	/**sets the away score */
	@Override
	public void setAwayScore(int a) {

		if(a==2){
			Awayscore++;
		}
	}
	/** gets the winner */
	@Override
	public String getWinner() {
		if(getHomeScore() > getAwayScore()) {
			return getHomeTeam();
		}
		else if(getHomeScore() < getAwayScore()){
			return getAwayTeam();
		}
		else	{
			return "TIE!";
		}
	}
}

