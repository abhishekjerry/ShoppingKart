package org.dxc.hibernate.util;

public class HibernateUtil {
	private static org.hibernate.SessionFactory sessionFactory=null;
	public static org.hibernate.SessionFactory buildSessionFactory(){
		
	
		try{
			//create  the session factory from hybernate.cfg.xml
			org.hibernate.service.ServiceRegistry serviceRegistry=new
					org.hibernate.boot.registry.StandardServiceRegistryBuilder()
			.configure("resources/hibernate.cfg.xml").build();
			
			  
				 
				 

			org.hibernate.boot.Metadata metadata=new
					org.hibernate.boot.MetadataSources(serviceRegistry)
			.getMetadataBuilder().build();
			
			

		    //**building sessionFactoty..**
	        sessionFactory=metadata.getSessionFactoryBuilder().build();
	 
		
		}catch(Throwable exception){
			exception.printStackTrace();
			
		}
		return sessionFactory;
		
	
}

	}
	

