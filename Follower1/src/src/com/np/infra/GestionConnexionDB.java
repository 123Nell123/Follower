package src.com.np.infra;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import src.com.np.infra.ParametrageBdSql;

public class GestionConnexionDB {
	
	Connection cn;

	ParametrageBdSql Db = new ParametrageBdSql();
	
	public Connection getConnexion() {
		
		// on peut changer ici la BDD a laquelle on se connecte
	
	Db.connexionBd();
	cn = Db.getConnexion();
	return cn;
	}
	
	public void disConnexion() {
		
		// on peut changer ici la BDD a laquelle on se connecte
	
	Db.deconnexionBd();

	}
}
