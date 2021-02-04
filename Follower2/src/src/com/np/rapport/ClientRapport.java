package src.com.np.rapport;

import java.util.ArrayList;

import src.com.np.dao.ConseillerDao;
import src.com.np.domaine.Client;
import src.com.np.domaine.Conseiller;
import src.com.np.service.ClientService;
import src.com.np.service.ManipFichierService;

public class ClientRapport {

	
	// on crre un doc qui fait une photo de la dbb et qui envoi les datas dans un fichier
	

	ClientService clientService;
	ManipFichierService manipService ;
	//String fichierAModifier =  "D:\\10-ODysseal\\workspaceFinal\\Follower2\\output\\rapport_client.xls" ;
	
	//todo recuperer le conseiller connecter grace a un cookie ?

	public ArrayList rapportListeClient() {
		
		//TODO faire la manip pour n'importe quel conseiller
		//System.out.println("le conseiller est"+ conseiller0.getNom());
		ArrayList clients =new ArrayList();
		
		clients = clientService.recupererListeClient();
		
		for (int numcell =0 ; numcell < 5; numcell ++)
		{
			int colonne =1 ;
				// FichierEcriture(String fichierAModifier, int valeurCellule, int numligne, int numCell)
				int valeurCellule = 42;
				//TODO faire une boucle sur la liste de clients
				manipService.FichierEcriture( valeurCellule, numcell , colonne);
			
				
			}
		return clients;
		}
	
				
		
	}
	

