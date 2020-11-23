package src.com.np.dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import src.com.np.domaine.Client;
import src.com.np.infraBDD.GestionConnexionDB;
import src.com.np.infraBDD.ParametrageBdSql;



public class ClientDao {
	Statement st;
	ResultSet rs;
	Connection cn;

	// M�thode pour r�cup�rer Tous les Clients
	public ArrayList<Client> getAllClient(int idConseiller) {
		// Information d'acc�s � la base de donn�es

		GestionConnexionDB connexion = new GestionConnexionDB();
		
	
		cn = connexion.getConnexion();
		ArrayList<Client> listeClient = new ArrayList<Client>();

		try {
			// Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM `clients` where id_conseiller= '" + idConseiller +"'";
			// ex�cution requ�te
			rs = st.executeQuery(sql);

			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
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

}