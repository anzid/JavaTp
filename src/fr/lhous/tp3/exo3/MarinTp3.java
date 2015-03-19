package fr.lhous.tp3.exo3;

public class MarinTp3 {
	//instance de la class Marin
	private String nom;
	private String prenom;
	private int salaire;

	/*constructeur*/
	public  MarinTp3(String nom, String prenom, int salaire ){
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	/*deuxieme constructeur*/
	public MarinTp3 (String nom, int salaire){
		this(nom, "", salaire);

	}

	/*deuxieme constructeur*/
	public MarinTp3 (String nom, String prenom){
		this(nom, prenom, 0);

	}

	/*renvoie le nom du Marin*/
	public String getNom(){
		return this.nom;
	}

	/*renvoie le prenom du Marin*/
	public String getPrenom(){
		return this.prenom;
	}

	/*changer le champ salaire*/
	public void setSalaire(int salaire){
		this.salaire = salaire;
	}

	/*renvoie le salaire du Marin*/
	public int getSalaire(){
		return this.salaire;
	}

	/*augumenter salaire*/
	public void augumenteSalaire(int augumenteSalaire){
		this.salaire = this.salaire + augumenteSalaire;

	}

	/*afficher les champs de Marin*/
	public String toString(){
		return this.getNom()+" "+this.getPrenom()+" "+this.salaire;

	}

	/*comparer deux instances de Marin*/
	/*hashCode et equals generees par eclipse*/
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + salaire;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarinTp3 other = (MarinTp3) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (salaire != other.salaire)
			return false;
		return true;
	}
}  
