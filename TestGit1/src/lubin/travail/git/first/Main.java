package lubin.travail.git.first;

import lubin.travail.git.metier.Employer;

public class Main {

	public static void main(String[] args) {
		Employer emp1 = new Employer("lubin", "Reginald", 3500.50);
		
		System.out.println(emp1.toString());
		System.out.println("Fin du programme.");
	}

}
