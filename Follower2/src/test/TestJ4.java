package test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.Properties;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import src.com.np.infraBDD.GestionConnexionDB;
import src.com.np.infraBDD.ParametrageBdSql;
import src.com.np.service.LecteurData;
import src.com.np.service.ManipFichierService;

import org.junit.Test;

public class TestJ4 {

	GestionConnexionDB gestionConnexion; 
	
	
		@Before
		public void makeConnection() {
			
			//Arrange
			gestionConnexion= new GestionConnexionDB();
			gestionConnexion.getConnexion();
			//act
			
		}
		
	
	
		@Test
		@Ignore
		public void testdataForbd() {
		
			//Param
	LecteurData lecteur = new LecteurData();

	Properties prop = new Properties();
	prop = lecteur.lireFichierData(ParametrageBdSql.fichierConfigBD);
			//Act
	
	
	prop.getProperty("url");
	prop.getProperty("login");
	prop.getProperty("passwd");
	prop.getProperty("driver");

			//Assert

	assertTrue((prop.getProperty("url")).equals("jdbc:mysql://localhost/follower2?useSSL=false"));
	
	}
		
		


		@Test(timeout = 2000)
		@Ignore
		public void testconnection() {
		
			//Arrange
		
			
			//act
			Boolean etat= gestionConnexion.getIsconnected();
		
			//assert
			assertTrue(etat);
			
	}
		
		
		@Test(timeout = 1000)
		 public void createFichier() {
			//Arrange
			System.out.println("ici commence le test");
			ManipFichierService manipFichier = new ManipFichierService();
//	String fichiertest ="D:\\10-ODysseal\\ouput\\rapport\\model4.xls";
			
			//Act
			manipFichier.fichierCreation();
			
			Boolean result = manipFichier.getIscreated();
			
			//Assert
			assertTrue(result);
		}
		
		
		
		
		
		
		
		
		@Test(timeout = 1000)
		 public void lireFichier() {
			fail("Not yet implemented");
		}
		

		@Test(timeout = 1000)
		 public void recupListClient() {
			fail("Not yet implemented");
		}
		
		@Test(timeout = 1000)
		 public void modifierFichier() {
			fail("Not yet implemented");
		}
		
}
