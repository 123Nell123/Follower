package src.com.np.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.np.domaine.Client;

/**
 * Servlet implementation class MaServletTraitement
 */
@WebServlet("/MaServletTraitement")
public class MaServletTraitementOLD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletTraitementOLD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			traitementChoix(request, response);
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
			traitementChoix(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void traitementChoix(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession maSession = request.getSession();
		RequestDispatcher dispatcher;
		String choix = request.getParameter("choix");
		System.out.println("vous avez fait le choix " + choix);
		dispatcher = request.getRequestDispatcher("WEB-INF/acceuil.jsp");
		switch (choix)
			//TODO a remplacer par un switch condition
		{
		case "a":
			dispatcher = request.getRequestDispatcher("WEB-INF/choixClient.jsp");
			break;
			
			
		case "b":
			dispatcher = request.getRequestDispatcher("WEB-INF/programme.jsp");
			break;
			
		case "c":
			dispatcher = request.getRequestDispatcher("WEB-INF/rapport.jsp");
			
			
		}
		//maSession = request.getSession();
		
		
		
		dispatcher.forward(request, response);
		
	}

}
