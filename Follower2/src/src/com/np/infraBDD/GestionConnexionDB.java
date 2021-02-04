package src.com.np.infraBDD;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InvalidPropertiesFormatException;

import src.com.np.infraBDD.ParametrageBdSql;

public class GestionConnexionDB {
	
	Connection cn;
	Boolean isconnected = false;

	ParametrageBdSql Db = new ParametrageBdSql();
	
	
	
	
	
	
	public Boolean getIsconnected() {
		return isconnected;
	}

	
	public Connection getConnexion()  {
		
		// on peut changer ici la BDD a laquelle on se connecte
	
	Db.connexionBd();
	cn = Db.getConnexion();
	isconnected= true;
	return cn;
	}
	
	public void disConnexion() {
		
		// on peut changer ici la BDD a laquelle on se connecte
	
	Db.deconnexionBd();
	isconnected= false;
	}
}
