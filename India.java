package com.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="india")

public class India 
{
	@Id
	@Column(name="year")
	private String year;
	@Column(name="total_matches")
	private int total_matches;
	@Column(name="match_win")
	private int match_win;
	@Column(name="match_loss")
	private int match_loss;
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTotal_matches() {
		return total_matches;
	}
	public void setTotal_matches(int total_matches) {
		this.total_matches = total_matches;
	}
	public int getMatch_win() {
		return match_win;
	}
	public void setMatch_win(int match_win) {
		this.match_win = match_win;
	}
	public int getMatch_loss() {
		return match_loss;
	}
	public void setMatch_loss(int match_loss) {
		this.match_loss = match_loss;
	}
	
	
}
