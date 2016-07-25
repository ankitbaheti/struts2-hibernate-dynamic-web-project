package com.project;

import java.util.ArrayList;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddCricketAction extends ActionSupport 
implements ModelDriven<Cricket> {

	 Cricket cricket  = new Cricket();
	   List<Cricket> crickets = new ArrayList<Cricket>();
	   sportDAO dao = new sportDAO();
	   
	   India india  = new India();
	   List<India> indias = new ArrayList<India>();
		 
	   Athletics athletics=new Athletics();
	   List<Athletics> athleticss=new ArrayList<Athletics>(); 
		
	   footballPlayers FootballPlayer=new footballPlayers();
	   List<footballPlayers> FootballPlayers=new ArrayList<footballPlayers>();
	
	   @Override
	   public Cricket getModel() {
		   
	      return cricket;
	   }
	   
	   public String execute1() 
	    {
			dao.addAthletics(athletics);
			return "success";
	    }


	   public String execute() 
	   {
		  dao.addCricket(cricket);
	      return "success";
	   }

	   public String listCrickets()
	   {
		  FootballPlayers = dao.getFootballPlayers();
		  athleticss = dao.getAthleticss(); 
		  indias=dao.getIndias();
		  crickets = dao.getCrickets();
	      return "success";
	      
	   }

	   public Cricket getCricket() {
		   System.out.println("hello4");
		    
	      return cricket;
	   }

	   public void setCricket(Cricket cricket) {
	      this.cricket = cricket;
	   }

	   public List<Cricket> getCrickets() {
		   System.out.println("hello2");
	      return crickets;
	   }

	   public void setCrickets(List<Cricket> crickets) {
		   System.out.println("hello3");
	      this.crickets = crickets;
	   }
	   
		public List<India> getIndias() {
			return indias;
		}

		public void setIndias(List<India> indias) {
			this.indias = indias;
		}
        
		public List<Athletics> getAthleticss() {
			return athleticss;
		}
		public void setAthleticss(List<Athletics> athleticss) {
			this.athleticss = athleticss;
		}
			

		public List<footballPlayers> getFootballPlayers() {
			   System.out.println("hello2");
			return FootballPlayers;
		}

		public void setFootballPlayers(List<footballPlayers> footballPlayers) {
			   System.out.println("hello3");
			FootballPlayers = footballPlayers;
			
		}
		
		public Athletics getAthletics() {
			return athletics;
		}
		public void setAthletics(Athletics athletics) {
			this.athletics = athletics;
		}


}
