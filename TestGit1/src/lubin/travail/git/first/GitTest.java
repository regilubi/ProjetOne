/**
 * 
 */
package lubin.travail.git.first;

import lubin.travail.git.metier.Personne;

/**
 * @author 8510502w
 *
 */
public class GitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Git is fun");

		Personne per = new Personne();
		System.out.println(per.toString());
		
		Personne per1 = new Personne("meli","melo");
		System.out.println("nom : " + per1.get_nom() + " prenom : " + per1.get_prenom());
		
	}

}
