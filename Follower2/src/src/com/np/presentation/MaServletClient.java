package src.com.np.presentation;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.np.domaine.Client;
import src.com.np.service.ClientService;

/**
 * Servlet implementation class MaServletClient
 */
@WebServlet("/MaServletClient")
public class MaServletClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger("MaServletClient");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			traitementClient(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			traitementClient(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void traitementClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Client client=new Client();
	
		HttpSession maSession = request.getSession();
	
		ClientService clientservice = new ClientService();
		
		
			//TODO a remplacer par un switch condition
	
			//on recupere le nom du client depuis la jsp
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		logger.info("nom:" + nom + "prenom:" + prenom);
		
	
			
			//on demande de retrouver le client en base
			try
			{
			client= clientservice.TrouverClientParNom(nom, prenom);

			System.out.println("on verifie ici la contenance du client client.getNom(): " +client.getNom()+";clienttostring"+ client.toString());
			
			}
			catch (Exception e) {
				System.out.println("client non trouvé");
				e.printStackTrace();
			}
			
				maSession.setAttribute("client", client);
			
		
				
				
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("WEB-INF/ficheClient.jsp");
		
		dispatcher.forward(request, response);
		
		
	}

}
