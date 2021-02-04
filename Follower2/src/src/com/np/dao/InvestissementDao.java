package src.com.np.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;

import src.com.np.domaine.Client;
import src.com.np.domaine.Investissement;
import src.com.np.infraBDD.GestionConnexionDB;

public class InvestissementDao {

	
	Statement st;
	ResultSet rs;
	Connection cn;

	// Méthode pour récupérer Tous les investissements depuis un client donné
	public ArrayList<Investissement> getAllInvestissement(int IdClient)  {
		// Information d'accès à la base de données

		GestionConnexionDB connexion = new GestionConnexionDB();
		
	
		cn = connexion.getConnexion();
		ArrayList<Investissement> listeInvestissement = new ArrayList<Investissement>();

		try {
			// Création d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM `Investissements` where id_client= '" + IdClient +"'";
			// exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)
		//	while (rs.next()) {
				/*Client client = new Client();

				client.setID(rs.getInt("id_client"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setMail(rs.getString("mail"));
				client.setAdresse(rs.getString("adresse"));

				listeClient.add(client);
				*/

		//	}
			System.out.println(" mon resultat" + rs.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		connexion.disConnexion();

		return listeInvestissement;
	}

public Investissement getInvestissementByClient(int IdClient) {
	Investissement investissement = null;;
	return investissement;
	}



public  void addInvestissementByClient(int IdClient) {
	//TODO
	
	
	;}
}
