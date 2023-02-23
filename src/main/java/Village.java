package lesschtroumpfs;

import java.util.ArrayList;

public class Village {
	private String nom;
	private ArrayList<Schtroumpf> schtroumpf = new ArrayList<Schtroumpf>();
	private int nbSchtroumpf;
	private int nbSalsepareille;
	
	public Village(String pfNomV, int pfStockSalsepareille,String[] pfNomDesSchtroumpfs)
	{		
		this.nom = pfNomV;
		this.nbSalsepareille = pfStockSalsepareille;
		this.nbSchtroumpf = 0;
		
		for(int i = 0 ; i < pfNomDesSchtroumpfs.length ; i++)
		{
			this.nbSchtroumpf++;
			Schtroumpf s = new Schtroumpf(pfNomDesSchtroumpfs[i],(int) (Math.random() * 150),this);
			this.schtroumpf.add(s);
		}
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getNbSchtroumpf()
	{
		return this.nbSchtroumpf;
	}
	
	public int getStockSalsepareille()
	{
		return this.nbSalsepareille;
	}
	
	public void solstice_d_ete()
	{
		int estContent = 0;
		
		for(int i = 0 ; i < this.nbSchtroumpf ; i++)
		{
			this.schtroumpf.get(i).sePresenter();
			this.schtroumpf.get(i).chanter();
			if(this.schtroumpf.get(i).estContent())
			{
				estContent++;
			}
		}
		
		System.out.println("Le nom du village est : " + this.nom);
		System.out.println("Le nombre d'habitant est : " + this.nbSchtroumpf);
		System.out.println("Il y a " + estContent + " Schtroump content.");
	}
	
	public Schtroumpf chefDuVillage()
	{
		Schtroumpf chef_Du_Village = null;
		for(int i = 0 ; i < this.nbSchtroumpf; i++)
		{
			chef_Du_Village = this.schtroumpf.get(0);
			
			if(this.schtroumpf.get(i).getAge() > chef_Du_Village.getAge())
			{
				chef_Du_Village = this.schtroumpf.get(i);
			}
		}
		
		return chef_Du_Village;
	}
	
	public void envoyerAuTravail()
	{
		Schtroumpf[] schtroumpfTravail = new Schtroumpf[50];
		int nbSchtroumpfContent = 0;
		for(int i = 0 ; i < this.nbSchtroumpf; i++)
		{
			if(this.schtroumpf.get(i).estContent())
			{
				schtroumpfTravail[nbSchtroumpfContent] =schtroumpf.get(i);
				nbSchtroumpfContent++;
			}
		}
		
		int i = 0;
		while(i < nbSchtroumpfContent)
		{
			schtroumpfTravail[i].allerTravailler();
			i = i + 2;
		}
	}
	
	public void schtroumpfsHeureux()
	{
		for(int i = 0 ; i < this.nbSchtroumpf ; i++)
		{
			if(this.schtroumpf.get(i).estContent())
			{
				this.schtroumpf.get(i).sePresenter();
				this.schtroumpf.get(i).chanter();
			}
		}
	}
	
	public void recolterSalsepareille()
	{
		this.nbSalsepareille += 5;
	}
	
	public void dinerAuVillage()
	{
		this.nbSalsepareille -= 3;
	}
	
	public void dinerTousEnsemble()
	{
		for(int i = 0 ; i < this.nbSchtroumpf ; i++)
		{
			this.schtroumpf.get(i).dinerAuVillage();
		}
	}
	
	public void envoyerCueillirSalsepareille()
	{
		Schtroumpf[] schtroumpfTravail = new Schtroumpf[50];
		int nbSchtroumpfContent = 0;
		for(int i = 0 ; i < this.nbSchtroumpf; i++)
		{
			if(this.schtroumpf.get(i).estContent())
			{
				schtroumpfTravail[nbSchtroumpfContent] = this.schtroumpf.get(i);
				nbSchtroumpfContent++;
			}
		}
		
		int i = 0;
		while(i < nbSchtroumpfContent)
		{
			schtroumpfTravail[i].recolterSalsepareille();
			i = i + 2;
		}
	}
}
