package com.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SPORTS")

public class sport_class {

	@Id
	   @GeneratedValue
	   private int id;
	   @Column(name="team_name")
	   private String Name;
	   @Column(name="match_win")
	   private int win;
	   @Column(name="match_loss")
	   private int loss;
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	   
	  
}
