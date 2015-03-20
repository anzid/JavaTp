package fr.lhous.tp3.exo5;
import fr.lhous.tp3.exo4.EquipageCommande;

public abstract class Bateau {//on rend la class abstrait pour pouvoir appeler la methode getTypeBateau de la sous class
	private String nom;
	private int tonnage;
	private EquipageCommande equipageComande;
	public abstract String getTypeBateau();
	

	
	public Bateau(String nom, int tonnage, EquipageCommande equipageCommande){
		this.nom = nom;
		this.tonnage = tonnage;
		this.equipageComande = equipageCommande;
	}

	public EquipageCommande getEquipageComande() {
		return equipageComande;
	}

	public void setEquipageComande(EquipageCommande equipageComande) {
		this.equipageComande = equipageComande;
	}

	public String getNom() {
		return nom;
	}

	public int getTonnage() {
		return tonnage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bateau other = (Bateau) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Bateau [nom=" + nom + ", tonnage=" + tonnage
				+ ", equipageComande=" + equipageComande + ", getTypeBateau()="
				+ getTypeBateau() + "]";
	}

	
}
