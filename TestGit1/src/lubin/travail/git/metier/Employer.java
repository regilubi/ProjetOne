/**
 * 
 */
package lubin.travail.git.metier;

/**
 * @author 8510502w
 *
 */
public class Employer extends Personne {
	private double _salaire;

	public Employer(String _nom, String _prenom, double _salaire) {
		super(_nom, _prenom);
		this._salaire = _salaire;
	}

	public double get_salaire() {
		return _salaire;
	}

	public void set_salaire(double _salaire) {
		this._salaire = _salaire;
	}

	@Override
	public String toString() {
		return "Employé :" + "\n\tNom: " + super.get_nom() +"\n\tPrénom: "+ super.get_prenom()+
				"\n\tSalaire: "+ this.get_salaire() + "\n";
	}
	
	
}
