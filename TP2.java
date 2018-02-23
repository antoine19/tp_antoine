package test;

import java.util.Scanner;

public class TP2 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char choix;
		 			
			System.out.println("Quel exercice ? \n1.Regles \n2.Puissance \n3.Multiplications \n4.Nombres premiers \n5.Formes \n6.Recherches ");
	
			
			choix = sc.nextLine().charAt(0);
			
			switch(choix)
			{
				
			case('1'):
			{
				 int a;
		    	    int interv;
					System.out.println("Exo 1");
					System.out.println("Veuillez rentrer la longueur de votre règle");
					a = sc.nextInt();
					sc.nextLine();
					System.out.println("Veuillez rentrer l'intervalle de  votre règle");
					interv=sc.nextInt();
					
					exo1(a,interv);
			}
			break;
			
			case('2'):
			{

				System.out.println("Exo 2");
				double chiffre1;
	    	    double chiffre2;
				
				System.out.println("Veuillez rentrer le premier chiffre");
				chiffre1= sc.nextDouble();
				sc.nextLine();
				System.out.println("A quelle puissance ?");
				chiffre2=sc.nextDouble();
				System.out.print(chiffre1 + " puissance " + chiffre2 +  " vaut "+ exo2(chiffre1,chiffre2));
				sc.nextLine();				
			}
			break;
			
			case('3'):
			{
				System.out.println("Exo 3");
				
				exo3();
			}
			break;
			
			case('4'):
			{
				double chiffre_exo4;
				
				System.out.println("Exo 4");
				System.out.println("Veuillez rentrer le chiffre et voyez si il est premier !");
				chiffre_exo4 = sc.nextDouble();
				sc.nextLine();
				exo4(chiffre_exo4);
				
			}
			break;
			
			case('5'):
			{
				System.out.println("Exo 5");
				int cote;				    	 
				System.out.println("Cote ?");
				cote=sc.nextInt();
				sc.nextLine();
				exo5(cote);
			}
			break;
			
			case('6'):
			{
				int nbr_tab;
				System.out.println("Exo 6");
				System.out.println("Chiffre a chercher?");
				nbr_tab = sc.nextInt();
				int [] tab= {1,2,3,4};
				System.out.print(recherche(nbr_tab, tab));
			}
			break;
			
			default:
				System.out.print("erreur");
			break;
			
			}
		
				
	}
	
	
	public static void exo1(int longueur, int interval)
	{
		
			for(int i=0;i<=longueur;i++)
			{  
					
				if(i%interval==0)
					System.out.print("|");
				else
					System.out.print("-");
			}
	}
	
	public static double  exo2(double nombre1, double nombre2)
	{
	
		double resultat= Math.pow(nombre1, nombre2);
		return resultat;
	}
	public static void exo3()
	{
		int i;
		int j;
		
		for(i=0;i<=10;i++)
		{
			for(j=0;j<=10;j++)								
			{
				int resultat=i*j;
				System.out.print( "  "+ resultat + "  ");
			}
			System.out.println("");
		
		}
		
		/*int size1=10;
		int size2=10;
		
	 int [] [] tableauChaine = new int [size1][size2]; 

		 
	 
		for(int i=0;i<10;i++)
		 {
			for(int j=0;j<10;j++)
			{
				tableauChaine[i][j]=i*j;
				System.out.print(tableauChaine[i][j]);
			}
			System.out.println("");
		  }*/
		 
		 
	}
	public static void exo4(double chiffre_premier)
	{
			int nbre_div = 0;
			for(int i=0;i<=chiffre_premier;i++)
			{
			   if(chiffre_premier%i==0)
				   nbre_div++;
			}
			
			if(nbre_div==2)
				System.out.print("1");
			else
				System.out.print("0");
	}	
	
	public static void exo5(int nbre_etoile)
	{
		int i = 0;		
		for(i=0;i<=nbre_etoile;i++)  
		{
			int diff=nbre_etoile-i;	
			for(int j=0;j<=nbre_etoile ;j++)  // (j=0;j<=i;j++)  pour figure 2 
			{									// (j=0;j<=nbre_etoile;j++)  pour figure 1				
				if(j<=diff)
					System.out.print(" ");             
				else
					System.out.print("*");			
			}
			System.out.println("");
		}
		
	}

	public static int recherche(int val, int[] tab)
	{
		int i;
		int res=-1;
		for(i=0;i<tab.length;i++)
		{
			if(tab[i]==val)
			{
				res=i;
				
			}
		}
		return res;
		
		
		
	}
	
	
 }

