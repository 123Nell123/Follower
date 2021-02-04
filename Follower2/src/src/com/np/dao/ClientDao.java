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
import src.com.np.infraBDD.GestionConnexionDB;
import src.com.np.infraBDD.ParametrageBdSql;



public class ClientDao {
	Statement st;
	ResultSet rs;
	Connection cn;

	// Méthode pour récupérer Tous les Clients
	public ArrayList<Client> getAllClient(int idConseiller) {
		// Information d'accès à la base de données

		GestionConnexionDB connexion = new GestionConnexionDB();
		
		ArrayList<Client> listeClient = new ArrayList<Client>();
		
		try {
			cn = connexion.getConnexion();
		

			// Création d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM `clients` where id_conseiller= '" + idConseiller +"'";
			// exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)
			while (rs.next()) {
				Client client = new Client();

				client.setID(rs.getInt("id_client"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setMail(rs.getString("mail"));
				client.setAdresse(rs.getString("adresse"));

				listeClient.add(client);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		connexion.disConnexion();

		return listeClient;
	}

	public ArrayList<Client> getAllClientBase()  {
		// Information d'accès à la base de données

		GestionConnexionDB connexion = new GestionConnexionDB();
		
	
		ArrayList<Client> listeClient = new ArrayList<Client>();

		try {
			cn = connexion.getConnexion();
			
			// Création d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM `clients`   ";
			// exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)
			while (rs.next()) {
				Client client = new Client();

				client.setID(rs.getInt("id_client"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setMail(rs.getString("mail"));
				client.setAdresse(rs.getString("adresse"));

				listeClient.add(client);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		connexion.disConnexion();

		return listeClient;
	}

	
	public Client getClientByName(String nom, String prenom)  {
		//TODO remplacer dynamique par codage en dur
		
		GestionConnexionDB connexion = new GestionConnexionDB();
		cn = connexion.getConnexion();
		Client client = new Client();


		try {
			// Création d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM `clients` where (nom= '"+ nom +"'  AND   prenom=  '" + prenom +"'   ) ";
			//String sql = "SELECT * FROM `clients` where (nom ='MBIANDOU')  ";
			// exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)
			
			if (rs.next())
			{
			
				if (nom.equals(rs.getString("nom")) & prenom.equals(rs.getString("prenom"))   )
					
				{
					
				client.setNom(rs.getString("nom"));
				client.setID(rs.getInt("idclient"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setMail(rs.getString("email"));
				client.setAdresse(rs.getString("adresse"));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		connexion.disConnexion();

		return client;
		
	}

	
	public Client getClientById(int IdClient) {
GestionConnexionDB connexion = new GestionConnexionDB();


		
		cn = connexion.getConnexion();
		Client client = new Client();
		
		try {
			// Création d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM `clients` where IdClient= '"+ IdClient +"'      ";
			// exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)
			
			if (rs.next())
			{
			
				if (IdClient == rs.getInt("id_client")) 
					
				{
				client.setNom(rs.getString("nom"));
				client.setID(rs.getInt("id_client"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setMail(rs.getString("mail"));
				client.setAdresse(rs.getString("adresse"));
				}
			}
		}
				catch (SQLException e) {
					e.printStackTrace();
				}
			
		
		connexion.disConnexion();
		
		
		//TODO remplacer dynamique par codage en dur
		return client;
		}



	
	
	
	
	
	
}