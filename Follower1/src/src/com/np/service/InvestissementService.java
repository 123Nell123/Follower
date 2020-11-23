package src.com.np.service;

import java.util.ArrayList;

import src.com.np.dao.InvestissementDao;
import src.com.np.domaine.Investissement;

public class InvestissementService {

	// 1.Déclaration du Dao
	InvestissementDao dao = new InvestissementDao();
	
	public ArrayList<Investissement> afficherInvestissement(int IdClient) {
		return dao.getAllInvestissement(IdClient) ;

	}
}
