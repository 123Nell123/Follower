package src.com.np.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
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
import src.com.np.service.ClientService;
import src.com.np.service.ConseillerService;
import src.com.np.service.AuthService;

/**
 * Servlet implementation class identification
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static final Logger logger = Logger.getLogger("logger");
	 
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			traitement(request, response);
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
			traitement(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	////***** la methode executee par post et Get********
	private void traitement(HttpServletRequest request, HttpServletResponse response) throws Exception {


		////	//
logger.log(Level.INFO, "demarrage du traitement ");

		// recuperer   login et password du formulaire
		String login = request.getParameter("login");
		String password = request.getParameter("password");

System.out.println("login" +login + "password"+ password);

		// on cree un conseiller qui a un login et un mot de passe
		Conseiller conseiller = new Conseiller(login, password)  ;

		// verifie l'authentification
		AuthService service = new AuthService();
		boolean authentification = service.estValide(conseiller);

		if (authentification==false) {System.out.println("erreur d'authentification " + " " +conseiller.getLogin());}
		else
		{
			System.out.println("conseille identifie");
			
			// TODO a revoir a partir d'ici
			// on recupere toutes les infos du conseiller depuis l'authentification
			Conseiller conseillerAuthentifie = new Conseiller(" "," ",0,"","")  ;
			conseillerAuthentifie = service.authentification(conseiller);
			// on passe ces parametres en session
			logger.getClass();
			logger.info("affichage du conseiller" +  conseillerAuthentifie.toString());
			System.out.println("nom" + conseillerAuthentifie.toString());
			
			HttpSession maSession = request.getSession();
			maSession.setAttribute("nom", conseillerAuthentifie.getNom());
			maSession.setAttribute("prenom", conseillerAuthentifie.getPrenom());
			
			RequestDispatcher dispatcher;

			dispatcher = request.getRequestDispatcher("acceuil.jsp");
	
			//dispatcher = request.getRequestDispatcher("WEB-INF/afficherNomConseiller.jsp");
			dispatcher.forward(request, response);
		}
		}
	}



