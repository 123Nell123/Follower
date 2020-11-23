package src.com.np.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import src.com.np.domaine.Conseiller;
import src.com.np.infra.GestionConnexionDB;

public class ConseillerDao {
	
	Statement st;
	ResultSet rs;
	Connection cn;
	
	public int authentifyConseiller(Conseiller conseiller){
		
		GestionConnexionDB connexion = new GestionConnexionDB();
	   cn =	connexion.getConnexion();
	   Conseiller conseiller0 = new Conseiller();
	   boolean a = false;
		
		try {
			
			st = cn.createStatement();

			//le conseiller entrer est rentrer comme une requete select
			String sql = "SELECT * FROM `conseiller` where  login = '" + conseiller.getLogin() + "' and password = '"
					+ conseiller.getPassword() + "'";

			rs = st.executeQuery(sql);
			// si il n'y a rien ds la requete on attrape l'exception
			if (rs.wasNull())
				a = false;
			else
				a = true;
			System.out.println(a);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 try {
			 //on essaye de modifier ID d'un conseiller 
			conseiller0.setID(rs.getInt("id_conseiller"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 int Id = conseiller0.getID();
		 System.out.println("essai de Id"+ Id);
		connexion.disConnexion();
		
		return Id;
		
	}
}
