/**
 * Class for Basketball
 * @author anuccio
 *
 */
public class Basketball extends Sport {

	private int Homescore=0,Awayscore=0,Quarter=1;
	/**status of game */
	private boolean GameStatus;
	/**current quarter*/
	private static final String p = "Quarter";

	/**
	 * Constructor that sets the hometeam awayteam and quarter to the superclas
	 * @param hometeam home team
	 * @param awayteam away team
	 */
	public Basketball(String hometeam, String awayteam){
		super(hometeam,awayteam,p);
		GameStatus = true;

	}

	/**
	 * Gets the score for the home team
	 */
	@Override
	public int getHomeScore() {

		return Homescore;
	}
	/**
	 * get the score for the away team
	 */
	@Override
	public int getAwayScore() {

		return Awayscore;
	}

	/**
	 * sets the home score
	 */
	@Override
	public void setHomeScore(int h) {
		if(h==1){														//free throw
			Homescore++;	
		}
		if(h==2){
			Homescore +=2;												//2-pointer
		}
		if(h==3){														//3-pointer
			Homescore+=3;
		}
	}

	/**
	 * sets the away score
	 */
	@Override
	public void setAwayScore(int a) {
		if(a==4){
			Awayscore++;
		}
		if(a==5){
			Awayscore +=2;
		}
		if(a==6){
			Awayscore+=3;
		}
	}

	/**
	 * ends the current quarter
	 */
	@Override
	public void setperiod() {
		Quarter++;

		if(Quarter > 4){
			GameStatus = false;
		}

	}

	/**
	 * gets the current quarter
	 */
	@Override
	public int getperiod() {

		return Quarter;

	}

	/**
	 * returns true if game is still going
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
	 * gets the winner of the game
	 */
	public String getWinner(){
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
