package src.com.np.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InvalidPropertiesFormatException;

import src.com.np.domaine.Conseiller;
import src.com.np.infraBDD.GestionConnexionDB;

public class ConseillerDao {

	Statement st;
	ResultSet rs;
	Connection cn;

	public int authentifyConseiller(Conseiller conseiller) {

		GestionConnexionDB connexion = new GestionConnexionDB();
		cn =	connexion.getConnexion();
		//Conseiller conseiller0 = new Conseiller();
		boolean a = false;
		int Idconseiller ;
		try {

			st = cn.createStatement();

			//le conseiller entrer est rentrer comme une requete select
			String sql = "SELECT * FROM `conseillers` where  login = '" + conseiller.getLogin() + "' and password = '"
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
		Idconseiller = conseiller.getID();

		System.out.println("essai de Id: "+ Idconseiller);
		connexion.disConnexion();

		return Idconseiller;

	}


	public Conseiller getUserByLogin(String login) 
	{

		GestionConnexionDB connexion = new GestionConnexionDB();
		cn =	connexion.getConnexion();
		Conseiller conseiller = new Conseiller();


		try
		{

			// Etape 3 : Creation d'un statement
			st = cn.createStatement();
			String sql = "SELECT * FROM conseillers";

			// Etape 4 : exécution requête
			rs = st.executeQuery(sql);

			// si récup données alors Etape 5 : ResultSet
			// il faut mettre à jour l'objet utilisateur qui est en retour :
			// grâce à la méthode set qui prend en charge le résultat de la
			// requête sql
			while (rs.next())
			{ conseiller.setLogin(rs.getString("Login"));
			conseiller.setPassword(rs.getString("Password"));
			conseiller.setNom(rs.getString("Nom"));
			conseiller.setPrenom(rs.getString("Prenom"));
			conseiller.setID(rs.getInt("idconseiller"));
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{

				// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}

		System.out.println("Information conseiller " + conseiller.toString());

		return conseiller;

	}
}