package com.project;

import java.util.List;

import org.apache.catalina.tribes.util.Arrays;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class sportDAO {
	  @SessionTarget
	   Session session;
	  
	   
	   @TransactionTarget
	   Transaction transaction;

	   @SuppressWarnings("unchecked")
	   
	   public void addSport(sport_class sport)
	   {
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(sport);
			session.getTransaction().commit();
			
	   }
	   
	   public void addCricket(Cricket cricket)
	   {
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(cricket);
			session.getTransaction().commit();
			
	   }
	   
	   public void addIndia(India india)
	   {
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(india);
			session.getTransaction().commit();
			
	   }
	   
	   public void addFootballPlayer(footballPlayers footballPlayers)
	   {
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(footballPlayers);
			session.getTransaction().commit();
			
	   }
	   
	   public void addAthletics(Athletics athletics)
	   {
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			System.out.println("here");
			session.save(athletics);
			System.out.println("hello here");
			session.getTransaction().commit();
			
	   }
	   
	   public List<sport_class> getSports()
	   {
		   
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<sport_class> sports = null;
			try {
				
				sports = (List<sport_class>)session.createQuery("from sport_class").list();
				
			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			session.getTransaction().commit();
			return sports;
	   }
	   
	   public List<Cricket> getCrickets()
	   {
		   
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<Cricket> crickets = null;
			   System.out.println("hello6");
			try {
				
				crickets = (List<Cricket>)session.createQuery("from Cricket").list();
			
				
			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			session.getTransaction().commit();
			return crickets;
	   }
	   
	   public List<India> getIndias()
	   {
		   
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<India> indias = null;
			try {
				
				indias = (List<India>)session.createQuery("from India").list();
				
			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			session.getTransaction().commit();
			return indias;
	   }
	   
	   public List<footballPlayers> getFootballPlayers()
	   {
		   
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<footballPlayers> FootballPlayers = null;
			try {
				
				FootballPlayers = (List<footballPlayers>)session.createQuery("from footballPlayers").list();
			    System.out.println("hello1");
			    System.out.println((FootballPlayers.get(0).getPlayer_name()));
			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			session.getTransaction().commit();
			return FootballPlayers;
	   }
      
	   public List<Athletics> getAthleticss()
	   {
		   
		    session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<Athletics> athleticss = null;
			try {
				
				athleticss = (List<Athletics>)session.createQuery("from Athletics").list();
				
			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			session.getTransaction().commit();
			return athleticss;
	   }
	   



}
