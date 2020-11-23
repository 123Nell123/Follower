package src.com.np.infraBDD;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class ParametrageBdSql {
		// Attributs

		Connection cn;
		String url = "jdbc:mysql://localhost/follower2?useSSL=false";
		String login = "root";
		String passwd = "";

		// Méthodes métier

		public void connexionBd() {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				cn = DriverManager.getConnection(url, login, passwd);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// Méthode permettant de récupérer l'instance de la classe Connection utilisée
		public Connection getConnexion() {
			return this.cn;
		}

		// Méthode 
		public void deconnexionBd() {
			try {
				cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


