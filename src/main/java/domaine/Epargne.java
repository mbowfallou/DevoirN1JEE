package domaine;

import java.io.Serializable;

public class Epargne implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int ms; // Montant souhaité
	private double mdep; // Montant à déposer
	private double tia; // Taux d'Intêret Annuel
	private int na; // Nombre d'Année
	
	public Epargne() {	}

	public int getMs() {
		return ms;
	}

	public void setMs(int ms) {
		this.ms = ms;
	}

	public double getMdep() {
		return mdep;
	}

	public void setMdep(double mdep) {
		this.mdep = mdep;
	}

	public double getTia() {
		return tia;
	}

	public void setTia(double tia) {
		this.tia = tia;
	}

	public int getNa() {
		return na;
	}

	public void setNa(int na) {
		this.na = na;
	}
	
	
	//###############################################################""
	
		public String getMS() {
			return formatage(ms);
		}
		
		public String getMDEP() {
			return formatage((int)mdep);
		}
		
		public String formatage(int nombre)
		{
		    int taille = (int)Math.floor(Math.log10(nombre) + 1);		
		    int combien = taille / 3;
		    int reste = taille % 3;
		    int curseur = 0;
		    
		    String chaine = "";
		    String nbr_c = Integer.toString(nombre);
		    for(int i=1; i<=combien; i++)
		    {
		        if(reste == 0) { 
		            if(i == 1) {
		                chaine = nbr_c;
		            }
		            else if(i == 2) {
		                chaine = chaine.substring(0, 3) + " " + chaine.substring(3);
		            } else {
		                chaine = chaine.substring(0, curseur-1+(i-1)*3) + " " + chaine.substring(curseur-1+(i-1)*3);
		            }
		        } else {
		            if(i == 1) { 
		                chaine += nbr_c.substring(0, reste) + " " + nbr_c.substring(reste);
		            }
		            else if(i == 2) {
		                chaine = chaine.substring(0, reste+4) + " " + chaine.substring(reste+4);
		            } else {
		                chaine = chaine.substring(0, curseur-2+(i)*3) + " " + chaine.substring(curseur-2+(i)*3);
		            }
		        }
		        curseur++;
		    }
		    return chaine;
		}
}
