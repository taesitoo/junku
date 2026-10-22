package Examenomega;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) { 
		Scanner cecyto= new Scanner(System.in);
		
        
            int n = cecyto.nextInt();                       
            int numeroActual = 1;                      
            for (int i = 1; i <= n; i++) {          
                for (int j = 1; j <= i; j++) {
                    System.out.print(numeroActual);                                        
                    if (j < i) {
                        System.out.print(" ");
                    }                   
                    numeroActual++;
                }                
                System.out.println();
            }
        }
    }

