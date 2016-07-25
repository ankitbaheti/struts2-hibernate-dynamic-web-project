package com.project;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="athletics")
public class Athletics {

	
	
	@Id
	 @Column(name="event")
	 private String event;
	 @Column(name="player_name")
	 private String player_name;
	 @Column(name="record")
	 private double record;
	 @Column(name="gender")
	 private String gender;
	 @Column(name="nation")
	 private String nation;
	
	 
	 public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public double getRecord() {
		return record;
	}
	public void setRecord(double record) {
		this.record = record;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
