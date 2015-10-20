package uebung_2_2;

public class Binomischeformel {
	 
	public static void main (String[] args) {
		  double a = 8;
		  double b = 3;
		  
		  double bionom = (a+b);
		  double mitte = (2*a*b);
		  
		  double loesung1 = Math.pow(bionom, 2);
		  double loesung2 = Math.pow(a, 2) + mitte + Math.pow(b, 2);
		  
		  System.out.println("x1 = " + loesung1);
		  System.out.println("x2 = " + loesung2);
	  }

}
