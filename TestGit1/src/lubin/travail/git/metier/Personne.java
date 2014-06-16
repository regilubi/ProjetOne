/**
 * 
 */
package lubin.travail.git.metier;

/**
 * @author 8510502w
 *
 */
public class Personne {
	private String _nom = "lubin";
	private String _prenom = "reginald";
	/**
	 * @param _nom
	 * @param _prenom
	 */
	public Personne(String _nom, String _prenom) {
		super();
		this._nom = _nom;
		this._prenom = _prenom;
	}
	
	public Personne(){
		
	}
	
	/**
	 * @return the _nom
	 */
	public String get_nom() {
		return _nom;
	}
	/**
	 * @param _nom the _nom to set
	 */
	public void set_nom(String _nom) {
		this._nom = _nom;
	}
	/**
	 * @return the _prenom
	 */
	public String get_prenom() {
		return _prenom;
	}
	/**
	 * @param _prenom the _prenom to set
	 */
	public void set_prenom(String _prenom) {
		this._prenom = _prenom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [_nom=" + _nom + ", _prenom=" + _prenom + "]";
	}
	
	
}
