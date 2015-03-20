package fr.lhous.tp3.exo3;

public class Capitaine extends Marin {
	private Grade grade;

	public Capitaine(String nom, String prenom, int salaire, String grade) {
		super(nom, prenom, salaire);
		this.grade = Grade.valueOf(grade);
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

