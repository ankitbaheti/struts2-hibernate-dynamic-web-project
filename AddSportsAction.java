package com.project;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class AddSportsAction extends ActionSupport 
implements ModelDriven<sport_class> {

	   sport_class sport  = new sport_class();
	   List<sport_class> sports = new ArrayList<sport_class>();
	   sportDAO dao = new sportDAO();
	   @Override
	   public sport_class getModel() {
	      return sport;
	   }

	   public String execute() 
	   {
	      dao.addSport(sport);
	      return "success";
	   }

	   public String listSports()
	   {
	      sports = dao.getSports();
	      return "success";
	   }

	   public sport_class getSport() {
	      return sport;
	   }

	   public void setSport(sport_class sport) {
	      this.sport = sport;
	   }

	   public List<sport_class> getSports() {
	      return sports;
	   }

	   public void setSports(List<sport_class> sports) {
	      this.sports = sports;
	   }

}
