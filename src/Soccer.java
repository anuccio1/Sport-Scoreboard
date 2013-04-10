/**
 * Class for Soccer
 * @author anuccio
 *
 */
public class Soccer extends Sport{
	/**
	 * status of game
	 */
	private boolean GameStatus;
	private int Homescore=0,Awayscore=0,Half=1;
	/**
	 * period type
	 */
	private static final String p = "Half";

	/**
	 * Constructor that sets the home and away teams
	 * @param hometeam
	 * @param awayteam
	 */
	public Soccer(String hometeam, String awayteam){
		super(hometeam,awayteam,p);
		GameStatus = true;
	}
	/**
	 * get method for the home score
	 */
	@Override
	public int getHomeScore() {
		return Homescore;
	}
	/**
	 * get method for the away score
	 */
	@Override
	public int getAwayScore() {

		return Awayscore;
	}
	/**
	 * set method for current half
	 */
	@Override
	public void setperiod() {
		Half++;

		if(Half > 2){
			GameStatus = false;
		}
	}
	/**
	 * get method for current half
	 */
	@Override
	public int getperiod() {

		return Half;
	}
	/**
	 * gets the game status
	 */
	@Override
	public boolean GameStatus() {
		if(GameStatus){
			return true;
		}
		else{
			return false;
		}

	}
	/**
	 * sets the home score 
	 */
	@Override
	public void setHomeScore(int h) {
		if(h==1){
			Homescore++;
		}

	}
	/**
	 * sets the away score
	 */
	@Override
	public void setAwayScore(int a) {

		if(a==2){
			Awayscore++;
		}
	}
	/**
	 * gets the winner
	 */
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
}//end Soccer Class
