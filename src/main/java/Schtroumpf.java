package lesschtroumpfs;

public class Schtroumpf {
	private String nom;
	private int age;
	private boolean content;
	private Village village;
	
	public Schtroumpf(String pfNom,int pfAge)
	{
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.village = null;
	}
	
	public Schtroumpf(String pfNom,int pfAge, Village pfVillage)
	{
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.village = pfVillage;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public boolean estContent()
	{
		return this.content;
	}
	
	public String toString()
	{
		if(this.estContent())
		{
			 if(this.village == null)
			 {
				 return "Je suis " + this.nom + ", j'ai " + this.age + " ans je suis content et je suis ermite";
			 } else
			 {
				 return "Je suis " + this.nom + ", j'ai " + this.age + " ans je suis content et j'habite dans le village " + this.village.getNom();
			 }
		}
		else
		{
			if(this.village == null)
			{
				return "Je suis " + this.nom + ", j'ai " + this.age + " ans je suis PAS content et je suis ermite";
			} else
			{
				return "Je suis " + this.nom + ", j'ai " + this.age + " ans je suis PAS content et j'habite dans le village " + this.village.getNom();
			}
		}
	}
	
	public void sePresenter()
	{
		System.out.println(toString());
	}
	
	public String leChant()
	{
		if(this.content)
		{
			return "la, la, la Schtroumpf la, la";
		} else
		{
			return "gloups";
		}
	}
	
	public void chanter()
	{
		System.out.println(leChant());
	}
	
	public void anniversaire()
	{
		this.age++;
	}
	
	public void manger(int pfQte)
	{
		if(pfQte > 0)
		{
			this.content = true;
		}
	}
	
	public void allerTravailler()
	{
		this.content = false;
	}
	
	public Village getVillage()
	{
		return this.village;
	}
	
	public void setVillage(Village pfVillage)
	{
		this.village = pfVillage;
	}
	
	public void recolterSalsepareille()
	{
		if(this.village == null)
		{
			this.manger(5);
		}
		else
		{
			this.village.recolterSalsepareille();
			this.content = false;
		}
	}
	
	public void dinerAuVillage()
	{
		if(this.village == null)
		{
			this.content = false;
		} else
		{
			if(this.village.getStockSalsepareille() >= 3)
			{
				this.village.dinerAuVillage();
				this.content = true;
			}
		}
	}
}
