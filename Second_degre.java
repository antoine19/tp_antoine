package test;

import java.util.Scanner;

public class Second_degre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char reponse= ' ';
		
	do {
				do {
							double a;
							double b;
							double c;
							
							Scanner sc=new Scanner(System.in);
							
					
							System.out.println("Veuillez rentrer le coef de x2");		
							a=sc.nextDouble();
							
							System.out.println("Veuillez rentrer le coef de x");
							sc.nextLine();
							b=sc.nextDouble();
									
						   System.out.println("Veuillez rentrer le coef  sans x");
						   sc.nextLine();
						   c=sc.nextDouble();
						   
						   double delta = Math.pow(b,2) - 4*a*c;
						   
						   if(delta<0)
						    {
							     System.out.println("Il n'a pas de resultat");
						    }
						   
						   else if (delta==0)
						      {
							     double x=(-b)/2*a;
							     System.out.print("Voila la réponse " + x);
							     
						      }
						   
						   else 
						     {
							   double x1;
							   double x2;
							   
							    x1= (-b-Math.sqrt(delta))/(2*a);
							    x2= (-b+Math.sqrt(delta))/(2*a);
							    
							    System.out.println("Vos resultats  : \n " +x1  );
							    System.out.println("Vos resultats  : \n " +x2  );
				
						     }
						   
						   
						   System.out.println("Rejouer ? (o/n)");
						   sc.nextLine();
						   reponse=sc.nextLine().charAt(0);
						   
						   if(reponse !='o' && reponse!='n')
				           	System.out.println("RELIS LES CONSIGNES ");
				           else
				           {
				           	System.out.println("Message reçu");
				           }
				   
			}while(reponse!='o'  && reponse !='n');
		           
		           
		    
				   
		   
		   
	}while(reponse=='o');
	
	System.out.print("Merci et à bientôt");
	   




	}

}
