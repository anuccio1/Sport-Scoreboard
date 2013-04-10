/**
 * Class for Football
 * @author anuccio
 *
 */
public class Football extends Sport{

	private int Homescore=0,Awayscore=0,Quarter=1;
	/** status of game */
	private boolean GameStatus;
	/**Period type */
	private static final String p = "Quarter";

	/**
	 * Constructor for football
	 * @param hometeam home team
	 * @param awayteam away team
	 */
	public Football(String hometeam, String awayteam){
		super(hometeam,awayteam,p);
		GameStatus = true;

	}

	/**
	 * gets the home score
	 */
	@Override
	public int getHomeScore() {

		return Homescore;
	}
	/**
	 * gets the away score
	 */
	@Override
	public int getAwayScore() {

		return Awayscore;
	}
	/**
	 * sets the new home score
	 */
	@Override
	public void setHomeScore(int h) {
		if(h==1){
			Homescore += 6;
		}
		if(h==2){
			Homescore += 3;	
		}
		if(h==3){
			Homescore +=1;
		}
		if(h==4 ||h==5){
			Homescore +=2;
		}

	}//end homepoint

	/**
	 * sets the new away score
	 */
	public void setAwayScore(int a) {

		if(a==6){
			Awayscore += 6;
		}
		if(a==7){
			Awayscore += 3;	
		}
		if(a==8){
			Awayscore +=1;
		}
		if(a==9 ||a==10){
			Awayscore +=2;
		}

	} //end awaypoint

	/**
	 * sets the new period
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
	 * Gets the Winner of the game
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





}//end class


