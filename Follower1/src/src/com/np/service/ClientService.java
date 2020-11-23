package src.com.np.service;

import java.util.ArrayList;

import src.com.np.dao.ClientDao;
import src.com.np.domaine.Client;

public class ClientService {

	// 1.Déclaration du Dao
	ClientDao dao = new ClientDao();
	
	public ArrayList<Client> recupererListeClient(int idConseiller) {
		return dao.getAllClient(idConseiller);

	}
}
