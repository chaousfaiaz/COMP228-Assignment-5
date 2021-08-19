/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab5;

/**
 *
 * @author faiaz
 */
public class Game {
	private final String gameID;
	private final String title;
	private final String date;
	private final String score;
	
	public Game(String gameID, String title, String date, String score) {
		this.gameID = gameID;
		this.title = title;
		this.date = date;
		this.score = score;
	}

	public String getGameID() {
		return gameID;
	}

	public String getTitle() {
		return title;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getScore() {
		return score;
	}
}