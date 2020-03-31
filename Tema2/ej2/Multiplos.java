package ej2;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9,aux[];
		aux=getMultiplos(n);
		for (int i=0;i<n;i++) {
			System.out.println(aux[i]);
		}
	}
	public static int [] getMultiplos(int n) {
		int mult[]=new int[n];
		for(int i=0;i<n;i++) {
			mult[i]=n*(i+1);
		}
		return mult;
		
	}
}
