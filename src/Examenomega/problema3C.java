package Examenomega;

import java.util.Scanner;

public class problema3C {

	public static void main(String[] args) {
		Scanner cecyto=new Scanner (System.in);
		int N=cecyto.nextInt();
		int nIngresado;
		int resultado=0;
		for (int i=0; i<N; i++) {
			nIngresado= cecyto.nextInt();
			if (nIngresado==8) {
				resultado =1;
			}
			
		}
		System.out.println(resultado);
	}

}
