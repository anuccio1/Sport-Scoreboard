/**
 * Superclass for all the sports
 * @author anuccio
 *
 */
public abstract class Sport implements SportInterface {

	private String HomeTeam,AwayTeam;
	/** name of the period */
	private String PeriodName;

	/**
	 * Constructor that sets the home team,away team, and period type
	 * @param hometeam
	 * @param awayteam
	 * @param periodtype
	 */
	public Sport(String hometeam, String awayteam, String periodtype){
		PeriodName = periodtype;
		HomeTeam = hometeam;
		AwayTeam = awayteam;

	}

	/**
	 * gets the home team
	 */
	public final String getHomeTeam(){
		return HomeTeam;
	}
	/**
	 * gets the away team
	 */
	public final String getAwayTeam(){
		return AwayTeam;
	}
	/**
	 * gets the name of the period
	 */
	public final String getPeriodName(){
		return PeriodName;
	}




}//end class


