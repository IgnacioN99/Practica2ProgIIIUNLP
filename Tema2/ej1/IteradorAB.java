package ej1;

public class IteradorAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IteradorAB it=new IteradorAB();
		System.out.println("De instancia");
		it.recursivoAB(9, 7);
		System.out.println("\n\n\n");
		System.out.println("De Clase");
		iteracionConForDeClase(2, 7);
		
	}
	
	public static void iteracionConForDeClase(int a, int b){
		for(;a<=b;a++) {
			System.out.println(a);
		}
	}
	public static void iteracionConWhileDeClase(int a,int b) {
		while(a<=b) {
			System.out.println(a++);
		}
	}
	public static void recursivoDeClase(int a,int b) {
		if(a<=b) {
			System.out.println(a++);
			IteradorAB.recursivoDeClase(a, b);
		}
	}
	
	public void iteracionConForDeInstancia(int a, int b){
		for(;a<=b;a++) {
			System.out.println(a);
		}
	}
	public void iteracionConWhileDeInstancia(int a,int b) {
		while(a<=b) {
			System.out.println(a++);
		}
	}
	public void recursivoDeInstancia(int a,int b) {
		if(a<=b) {
			System.out.println(a++);
			recursivoDeInstancia(a, b);
		}
	}
	public void recursivoAB(int a, int b){
		if(a>=b) {
			System.out.println(a--);
			recursivoAB(a,b);
		}
		
	}

}
