package com.project;


import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class AddIndiaAction extends ActionSupport 
implements ModelDriven<India> {
	
	India india  = new India();
	   List<India> indias = new ArrayList<India>();
	   sportDAO dao = new sportDAO();
	   @Override
	   public India getModel() {
	      return india;
	   }

	   public String execute() 
	   {
	      dao.addIndia(india);
	      return "success";
	   }

	   public String listIndias()
	   {
	      indias = dao.getIndias();
	      //return indias;
	       return "success";
	   }
	
	   public India getIndia() {
		return india;
	}

	public void setIndia(India india) {
		this.india = india;
	}

	public List<India> getIndias() {
		return indias;
	}

	public void setIndias(List<India> indias) {
		this.indias = indias;
	}

	


}
