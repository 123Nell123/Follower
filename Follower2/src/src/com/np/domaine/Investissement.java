package src.com.np.domaine;

public abstract class Investissement {

	private String nom="";
	private String descriptif="";
	private int IdInvestissement;
	
//	***getter et setter ****
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public int getID() {
		return IdInvestissement;
	}
	public void setID(int IdInvestissement) {
		this.IdInvestissement = IdInvestissement;
	}
	
}
