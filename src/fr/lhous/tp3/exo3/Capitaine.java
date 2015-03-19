package fr.lhous.tp3.exo3;

import fr.lhous.tp2.Equipage;


public class Capitaine extends MarinTp3 {
	private Grade grade;
	
	public enum Grade{
		COMMANDANT, CAPITAINE, AMIRAL;
	}

	public Capitaine(String nom, int salaire, Grade m) {
		super(nom, salaire);
		this.grade = m;
	}

	@Override
	public String toString() {
		return "Capitaine [grade=" + grade + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitaine other = (Capitaine) obj;
		if (grade != other.grade)
			return false;
		return true;
	}
}

