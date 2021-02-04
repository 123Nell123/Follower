package src.com.np.domaine;

public class Client {

	private String nom="";
	private String prenom="";
	private int IdClient;
	private String adresse="";
	private String mail="";
	private String numeroFiscal="";
	private String groupeClient="";
	
	
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
	public int getIdClient() {
		return IdClient;
	}
	public void setID(int IdClient) {
		this.IdClient = IdClient;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNumeroFiscal() {
		return numeroFiscal;
	}
	public void setNumeroFiscal(String numeroFiscal) {
		this.numeroFiscal = numeroFiscal;
	}
	public String getGroupeClient() {
		return groupeClient;
	}
	public void setGroupeClient(String groupeClient) {
		this.groupeClient = groupeClient;
	}
	
// methode metier
	
	public void investir() {
		//TODO
	}
	
	public void afficherInvestissement() {
			//TODO
	}
	
	public void modifierInvestissement() {
		//TODO
}
	
	
}
