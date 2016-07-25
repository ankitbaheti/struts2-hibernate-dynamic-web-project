package com.project;


import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddAthleticsAction extends ActionSupport implements ModelDriven<Athletics>{

	Athletics athletics=new Athletics();
	List<Athletics> athleticss=new ArrayList<Athletics>(); 
	
	sportDAO dao = new sportDAO();
	@Override
    public Athletics getModel() {
			
			return athletics;
    }
		
	public String execute() 
    {
		dao.addAthletics(athletics);
		return "success";
    }

    public String listAthleticss()
	{
	    athleticss = dao.getAthleticss();
		return "success";
		      
	 }

	public Athletics getAthletics() {
		return athletics;
	}
	public void setAthletics(Athletics athletics) {
		this.athletics = athletics;
	}
	public List<Athletics> getAthleticss() {
		return athleticss;
	}
	public void setAthleticss(List<Athletics> athleticss) {
		this.athleticss = athleticss;
	}
	
	
	
}
