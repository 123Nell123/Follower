package src.com.np.domaine;

public class Conseiller {
	
	private String nom="";
	private String prenom="";
	private int ID;
	private String login;
	private String password;
	
	
	
	/// constructor 
	

public Conseiller(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
public Conseiller() {
	// TODO Auto-generated constructor stub
}


public Conseiller(String nom, String prenom, int iD, String login, String password) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	ID = iD;
	this.login = login;
	this.password = password;
}

//getter setter




public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//	***getter et setter ****
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	
	// methode metier
	
	@Override
	public String toString() {
		return "Conseiller [nom=" + nom + ", prenom=" + prenom + ", ID=" + ID + ", login=" + login + ", password="
				+ password + "]";
	}
	public void creerClient() {
		//TODO
	}
	public void afficherClient() {
		//TODO
	}
	
	public void modifierClient() {
		//TODO
	}
	
	public void creerInvestissement() {
		//TODO
	}
	
	public void editerRapport() {
		//TODO
	}
	
	
}
