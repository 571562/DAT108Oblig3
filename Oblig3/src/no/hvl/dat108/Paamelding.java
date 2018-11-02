package no.hvl.dat108;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Paameldingsskjema
 */
@WebServlet("/Paamelding")
public class Paamelding extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private DeltagerEAO deltagerEAO;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/paameldingsskjema_MAL.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("skjema"); //fjerner skjema hvis den finnes fra før
		
		String fornavn = request.getParameter("forvavn");
		String etternavn = request.getParameter("etternavn");
		String mobil = request.getParameter("mobil");
		String kjonn = request.getParameter("kjonn");
		String passord = request.getParameter("passord");
		String passordRepetert = request.getParameter("passordRepetert");
		
		Skjema skjema = new Skjema(fornavn, etternavn, mobil, kjonn, passord, passordRepetert);
		
		
		
		
	
	}

}
