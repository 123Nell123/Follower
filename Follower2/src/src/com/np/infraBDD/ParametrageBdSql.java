package src.com.np.infraBDD;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import src.com.np.service.LecteurData;

public class ParametrageBdSql {
	// Attributs

	Connection cn;
	//String url = "jdbc:mysql://localhost/follower2?useSSL=false";
	String url ="";
	//String login = "root";
	String login ="";
	//String passwd = "";
	String passwd ="";
	String driver="";


	public static final String fichierConfigBD ="/accessJDBC.xml";

	// M�thodes m�tier

	public void connexionBd()  {

		try {
			lireFichierConnexion(fichierConfigBD);
			Class.forName("com.mysql.jdbc.Driver");

			//recupere les valeurs url; login et passwd du fichier de config;
	



			System.out.println("testons " +"/n"+ "url: "+ url +"; login: "+login + "; passwd:" + passwd);
			if (passwd==null || passwd.length()<=1)
				passwd="";

			cn = DriverManager.getConnection(url, login, passwd);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	// M�thode permettant de r�cup�rer l'instance de la classe Connection utilis�e
	public Connection getConnexion() {
		return this.cn;
	}

	// M�thode 
	public void deconnexionBd() {
		try {
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void lireFichierConnexion(String monfichierconfig)  {
		// make new properties instance to load the file into
		Properties prop = new Properties();
LecteurData lecteurData = new LecteurData();
prop = lecteurData.lireFichierData(monfichierconfig);

		
			// print out all the properties
			for (String mapropriete : prop.stringPropertyNames()){
				System.out.println(mapropriete  + "=" + prop.getProperty(mapropriete));

				url = prop.getProperty("url");
				login = prop.getProperty("login");
				passwd = prop.getProperty("passwd");
				driver = prop.getProperty("driver");
			}
		} 


	}





