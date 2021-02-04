package src.com.np.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.np.domaine.Client;
import src.com.np.domaine.Conseiller;
import src.com.np.rapport.ClientRapport;
import src.com.np.service.ClientService;

/**
 * Servlet implementation class MaServletRapport
 */
@WebServlet("/MaServletRapport")
public class MaServletRapport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger("maServletRapport");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletRapport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TraitementRapport(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	private void TraitementRapport(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession maSession = request.getSession();
		
		//String nom = request.getParameter("nom");
		//String prenom = request.getParameter("prenom");
	List<Client> clients = new ArrayList<Client>();
	
	ClientRapport clientRapport = new ClientRapport();
	
	
		try
		{
		
		//TODO methode pour recuperer le conseiller connecter dans la session
	//	logger.info("nom:" + nom + "prenom:" + prenom);
		
			clients =	clientRapport.rapportListeClient();

		
		}
		catch (Exception e) {
			System.out.println("rapport non editer");
			e.printStackTrace();
		}
		
			maSession.setAttribute("RapportClient",clients );
		
		
		
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("WEB-INF/rapportClient.jsp");
		
		dispatcher.forward(request, response);

		

}
}
