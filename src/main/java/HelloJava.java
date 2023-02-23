/**
 * Ceci est une classe de test qui ne fait pas grand chose
 * @author JMB
 * @author LC
 */

 import lesschtroumpfs.Schtroumpf;
 import lesschtroumpfs.Village;

class HelloJava {
	public static void main(String[] args) {
		String[] nomsSchtroumpfs = {
			"Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur à lunettes",
			"Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf étonné", "Schtroumpf acrobate", "Schtroumpf paresseux"
		};
	
	Village village = new Village("Village 1 ",10, nomsSchtroumpfs);
	
	Schtroumpf chefDuVillage = village.chefDuVillage();
	
	int nbSalsepareille = village.getStockSalsepareille();
	
	System.out.println(nbSalsepareille);
	village.envoyerCueillirSalsepareille();
	nbSalsepareille = village.getStockSalsepareille();
	System.out.println(nbSalsepareille);
	
	village.dinerTousEnsemble();
	nbSalsepareille = village.getStockSalsepareille();
	System.out.println(nbSalsepareille);
	
	village.solstice_d_ete();
	}

	public void afficherCancan()
	{

	}
}
