package com.project;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddFootballPlayerAction extends ActionSupport 
implements ModelDriven<footballPlayers> {

	   sportDAO dao = new sportDAO();
	   footballPlayers FootballPlayer=new footballPlayers();
	   List<footballPlayers> FootballPlayers=new ArrayList<footballPlayers>();
	
	   @Override
	   public footballPlayers getModel() {
		   
	      return FootballPlayer;
	   }
	   
	   
	   public String execute() 
	   {
		  dao.addFootballPlayer(FootballPlayer);
	      return "success";
	   }

	   public String listFootballPlayers()
	   {
		  FootballPlayers = dao.getFootballPlayers();
	      return "success";
	      
	   }
   

	public footballPlayers getFootballPlayer() {
		return FootballPlayer;
	}

	public void setFootballPlayer(footballPlayers footballPlayer) {
		FootballPlayer = footballPlayer;
	}

	public List<footballPlayers> getFootballPlayers() {
		   System.out.println("hello2");
		return FootballPlayers;
	}

	public void setFootballPlayers(List<footballPlayers> footballPlayers) {
		   System.out.println("hello3");
		FootballPlayers = footballPlayers;
		
	}
	   
	   
  
}
