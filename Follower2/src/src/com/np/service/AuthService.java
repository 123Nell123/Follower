package src.com.np.service;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import src.com.np.dao.ConseillerDao;
import src.com.np.domaine.Client;
import src.com.np.domaine.Conseiller;

public class AuthService {

	 private static final Logger logger1 = Logger.getLogger("logger");

	// authentification depuis la servlet depuis le conseiller creer

		
		//identification on the fly
		public boolean estValide(Conseiller conseiller)
		{
			boolean a;
			a = false;

			if(("Alex".equalsIgnoreCase(conseiller.getLogin()))&&("Alex".equalsIgnoreCase(conseiller.getPassword())))
			{
			a=true;
			}
			return a;

		}
		
		
		public Conseiller authentification(Conseiller conseiller) throws Exception {	
			int Idconseiller = 0;
			// identifier via la base de donn�es
			
		ConseillerService conseillerService = new ConseillerService();
	
		Conseiller conseillerFullArgu = new Conseiller();
		
		conseillerFullArgu = conseillerService.obtenirConseilleravecLogin(conseiller.getLogin());
		 Idconseiller = conseillerService.authentifierConseiller(conseillerFullArgu);
		System.out.println("afficher le conseiller recupere : "+ conseillerFullArgu.toString());
		// si identification est reussie afficher le conseiller
	if (Idconseiller ==0) { throw new Exception("pb de connexion conseiller non trouve") ;}
	
	else 
		System.out.println("authentifie avec succes");
	logger1.getClass();
	logger1.info("affichage du conseiller" +  conseiller.toString());
	logger1.log(Level.INFO, "sortie d'authentification");
		return conseillerFullArgu;
		
		//TODO : implementer l'authentification en ce basant sur la methode ecrite sur le clientDao
		
		// verifier que les logins et mdp correspondent a des donn�es en base
		//1) preparer une hash table ou list dans laquelle on met tout les login et MDP des conseillers
		//2) valeurs seront crypt�es
		//3) si les valeurs correspondent au couple entr� par l'utilisateur alors se connecter
		
		
		
		/*
	int ab = conseillerService.authentifierConseiller(conseiller);

	
	// si le login existe on va implementer la methode obtenir un conseiller
	if (ab == 1) {
		// Client client = new Client();

		ArrayList<Client> listeClient = new ArrayList<Client>();

		ClientService clientService = new ClientService(); 
		
		
		
		// on recupere la liste des clients grace a l'ID du conseiller
		//listeClient = clientService.recupererListeClient(conseiller.getIdConseiller());
	
		
		
		listeClient = clientService.recupererListeClient(ab);
	}
	*/
}
}
