/**
 * @author Gruppe 51_E13
 */
//Vi kan nok skille os af med lastRoll metoder og tilgeng�ld add en account?
//Score kan vidst ogs� godt forsvinde da det skal varetages af account?
//FIXME: add account
package sorting;

public class Player
{
	// variable
	//private int score;
	//private int[] lastRoll = new int[2];
	private String playerName;
	private Account account;
	private int winStatus = 0;
	

	//constructor
	public Player(String playerName)
	{
		this.playerName = playerName;
		account = new Account();
	}

	//adds an integer to the score
//	public void addToScore(int points)
//	{
//		score = score + points;
//	}
	
	public Account getAccount()
	{
		return account;
	}
	
	//returns last roll for this player
//	public int[] getLastRoll()
//	{
//		return lastRoll;
//	}

//	//returns the players score
//	public int getScore()
//	{
//		return score;
//	}
	
	public void setAccount(Account account) {
		this.account = account;
	}

	//returns the players name
	public String getPlayerName()
	{
		return playerName;
	}
//	//sets the players score
//	public void setScore(int score)
//	{
//		this.score = score;
//	}
	
	//sets the players name
	public void setPlayerName(String player)
	{
		playerName = player;
	}

	@Override
	public String toString()
	{
		return playerName + " : " + account + "\t";
	}

	public int getWinStatus() {
		return winStatus;
	}

	public void setWinStatus(int status) {
		winStatus = status;
	}
}
