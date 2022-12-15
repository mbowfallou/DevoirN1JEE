package controleur;

import java.io.IOException;
//import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domaine.*;
import metier.Traite;


@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Epargne Epargne = null;
	private Traite traite = new Traite();
	private RequestDispatcher disp = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String lien = request.getParameter("lien");
//		
		switch (lien) 
		{
			case "start":			
			case "in":
				response.sendRedirect("entree.jsp");
				break;
			
			case "out":
				response.sendRedirect("sortie.jsp");
				break; 
//				
			default:
				response.sendRedirect("index.jsp");
				break;
		}
	}
//
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String forme = request.getParameter("forme");
		if(forme.equals("forme1"))
		{
			try 
			{
				int ms = Integer.parseInt(request.getParameter("ms"));
				int na = Integer.parseInt(request.getParameter("na"));
				double taux = Float.parseFloat(request.getParameter("taux"));
				
				Epargne epargne = new Epargne();
				
				epargne.setMs(ms);
				epargne.setNa(na);
				epargne.setTia(taux);
				
				epargne = traite.calcul(epargne);
				
				request.setAttribute("epargne", epargne);
				
				disp = request.getRequestDispatcher("sortie.jsp");
				disp.forward(request, response);
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
