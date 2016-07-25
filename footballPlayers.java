package com.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="football_players")

public class footballPlayers {

	@Id
	@Column(name="player_name")
	private String player_name;
	@Column(name="total_matches")
	private int total_matches;
	@Column(name="goals")
	private int goals;
	@Column(name="assist")
	private int assist;
	
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getTotal_matches() {
		return total_matches;
	}
	public void setTotal_matches(int total_matches) {
		this.total_matches = total_matches;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getAssist() {
		return assist;
	}
	public void setAssist(int assist) {
		this.assist = assist;
	}
	
}
