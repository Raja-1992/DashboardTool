package com.wipro.bean;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mainclass 
{
   private static SessionFactory factory; 
   public static void main(String[] args) 
   {
	   
	   
      try
      {
    	  factory =  new Configuration().configure().buildSessionFactory(); 
//         Configuration configuration = new Configuration().configure(HibernateUtil.class.getResource("/hibernate.cfg.xml"));
//         StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
//         serviceRegistryBuilder.applySettings(configuration.getProperties());
//         ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
//         sessionFactory = configuration.buildSessionFactory(serviceRegistry);

         
         
      }catch (Exception ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         //hrow new ExceptionInInitializerError(ex); 
      }
      mainclass ME = new mainclass();

      /* Add few employee records in database 
      Integer a1 = ME.addAttendance("E326801", "M324567","S123456","P");
      Integer a2 = ME.addAttendance("E326802", "M324568","S123457","P");
      Integer a3 = ME.addAttendance("E326803", "M324569","S123458","P");
      System.out.println(a1);
      System.out.println(a2);
      System.out.println(a3);
      */
     

     
   }
   /* Method to CREATE an employee in the database */
   public Integer addAttendance(String eid, String mid, String sid, String attendance_t){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         Attendence a = new Attendence();
         a.setAttendance_t(attendance_t);
         a.setEmployeeid(eid);
         a.setManagerid(mid);
         a.setScheduleid(sid);
        
         employeeID = (Integer) session.save(a); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return employeeID;
   }
  
   }
