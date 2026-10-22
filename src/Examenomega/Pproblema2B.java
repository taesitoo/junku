package Examenomega;

import java.util.Scanner;

public class Pproblema2B {

	public static void main(String[] args) {
		Scanner hola=new Scanner(System.in);
		int d = hola.nextInt(); 
        int m = hola.nextInt();
        
        String signo = "";
        String estacion = "";

        
        switch(m) {
            case 1:
                if(d <= 19) signo = "Capricornio";
                else signo = "Acuario";
                break;
            case 2:
                if(d <= 18) signo = "Acuario";
                else signo = "Piscis";
                break;
            case 3:
                if(d <= 20) signo = "Piscis";
                else signo = "Aries";
                break;
            case 4:
                if(d <= 19) signo = "Aries";
                else signo = "Tauro";
                break;
            case 5:
                if(d <= 20) signo = "Tauro";
                else signo = "Geminis";
                break;
            case 6:
                if(d <= 20) signo = "Geminis";
                else signo = "Cancer";
                break;
            case 7:
                if(d <= 22) signo = "Cancer";
                else signo = "Leo";
                break;
            case 8:
                if(d <= 22) signo = "Leo";
                else signo = "Virgo";
                break;
            case 9:
                if(d <= 22) signo = "Virgo";
                else signo = "Libra";
                break;
            case 10:
                if(d <= 22) signo = "Libra";
                else signo = "Escorpion";
                break;
            case 11:
                if(d <= 21) signo = "Escorpion";
                else signo = "Sagitario";
                break;
            case 12:
                if(d <= 21) signo = "Sagitario";
                else signo = "Capricornio";
                break;
        }       
        switch(m) {
            case 3:
                estacion = (d >= 21) ? "Primavera" : "Invierno";
                break;
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
                estacion = (d <= 20) ? "Primavera" : "Verano";
                break;
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
                estacion = (d <= 20) ? "Verano" : "Otono";
                break;
            case 10:
            case 11:
                estacion = "Otono";
                break;
            case 12:
                estacion = (d <= 20) ? "Otono" : "Invierno";
                break;
            case 1:
            case 2:
                estacion = "Invierno";
                break;
        }

        System.out.println(signo);
        System.out.println(estacion);
        

	}

}

        
        
        