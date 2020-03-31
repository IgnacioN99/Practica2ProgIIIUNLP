package ej4;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un num");
		int n=s.nextInt(),aux[];
		aux=getMultiplos(n);
		for (int i=0;i<n;i++) {
			System.out.println(aux[i]);
		}
		s.close();
	}
	public static int [] getMultiplos(int n) {
		int mult[]=new int[n];
		for(int i=0;i<n;i++) {
			mult[i]=n*(i+1);
		}
		return mult;
		
	}
}
