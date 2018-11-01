package no.hvl.dat108;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginn
 */
@WebServlet("/loginn")
public class Logginn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @EJB
   private DeltagerEAO DeltagerEAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession(false) != null) {
			request.getSession(false).invalidate();
		}
		request.getRequestDispatcher("WEB-INF/logginn_MAL.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobil = request.getParameter("mobil");
		String pass = request.getParameter("passord");
		
		Deltager deltager = DeltagerEAO.hentDeltager(mobil);
		
		if(deltager != null && PassordUtil.sjekkPassord(pass, deltager.getPass()));
	}

}
