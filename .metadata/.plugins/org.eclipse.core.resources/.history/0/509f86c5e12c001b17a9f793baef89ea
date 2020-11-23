package src.com.np.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.np.domaine.Client;
import src.com.np.domaine.Conseiller;
import src.com.np.service.ClientService;
import src.com.np.service.ConseillerService;

/**
 * Servlet implementation class identification
 */
@WebServlet("/identification")
public class Identification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Identification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		traitement(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		traitement(request, response);
	}
	
	////***** la methode executee par post et Get********
	private void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// recuperer   login et password du formulaire
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
// on cree un conseiller qui a un login et un mot de passe
		Conseiller conseiller = new Conseiller ("login", "password")  ;
		
		

		// authentification depuis la servlet depuis le conseiller creer
		ConseillerService conseillerService = new ConseillerService();
		int ab = conseillerService.authentifierConseiller(conseiller);

		
		// si le login existe on va implementer la methode obtenir un conseiller
		if (ab == 1) {
			// Client client = new Client();

			ArrayList<Client> listeClient = new ArrayList<Client>();

			ClientService clientService = new ClientService(); 
			
			
			
			// on recupere la liste des clients grace a l'ID du conseiller
			//listeClient = clientService.recupererListeClient(conseiller.getIdConseiller());
		
			
			
			listeClient = clientService.recupererListeClient(ab);
			
			// on passe ces parametres en session
			HttpSession maSession = request.getSession();
			maSession.setAttribute("listeClient", listeClient);

			RequestDispatcher dispatcher;

			// dispatcher = request.getRequestDispatcher("Accueil.html");
			// dispatcher = request.getRequestDispatcher("index.html");

			dispatcher = request.getRequestDispatcher("AffichageClient.jsp");

			dispatcher.forward(request, response);
		}
	}

	
	

}
