package metier;

import domaine.*;

public class Traite 
{
	public Epargne calcul(Epargne epargne)
	{
		/* Valeurs reçues */
		int ms = epargne.getMs();
		double tia = epargne.getTia();
		int na = epargne.getNa();
		
		/* Valeurs Calculées */			
		double mdep = ms / Math.pow(1+(tia/100), na);
		
		/* Valeurs Retournées ou Chargées */
		epargne.setMdep(mdep);
		
		return epargne;
	}
}