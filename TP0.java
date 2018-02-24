package test;

import java.util.Scanner;

public class TP0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//calcul du volume d'un pavé droit
		
		
		double largueur;
		double longueur;
		double hauteur;
		double resultat;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Veuillez rentrer une largueur");
	    largueur=Math.abs(sc.nextDouble());
	    
		System.out.println("Veuillez rentrer une longueur");
		sc.nextLine();
		longueur=Math.abs(sc.nextDouble());
		
		System.out.println("Veuillez rentrer une hauteur");
		sc.nextLine();
		hauteur=Math.abs(sc.nextDouble());
		
		resultat=hauteur*largueur*longueur;
		
		System.out.print("Voici le volume de votre cube " +  resultat + "m2");
		
		

	    
	    

	}

}
