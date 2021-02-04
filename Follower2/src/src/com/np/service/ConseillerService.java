package src.com.np.service;

import src.com.np.dao.ConseillerDao;
import src.com.np.domaine.Conseiller;

public class ConseillerService {

	// 1.Déclaration du Dao
	ConseillerDao conseillerdao = new ConseillerDao();
	
	public int authentifierConseiller(Conseiller conseiller) {
		//retourne l'ID du conseiller identifier en BD
		return conseillerdao.authentifyConseiller(conseiller) ;

	}
	
	public Conseiller obtenirConseilleravecLogin(String login) {
	
		return conseillerdao.getUserByLogin(login);
		
	}
	
	
	
	
}
