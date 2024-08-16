package codigo5;

import java.util.Scanner;

public class Codigo5 {
	
	//El código lee un número introducido por el usuario, cuenta cuántos de sus
	//dígitos son considerados "afortunados" (3, 7, 8, 9) y cuántos no lo son, y 
	//luego determina si el número es afortunado en función de esta cuenta. Finalmente, 
	//imprime un mensaje indicando si el número es afortunado o no, 
	
	   public static void main(String[] args) {
		   Scanner s = new Scanner(System.in); // se agrega el system.in para leer los datos de entrada 
	        System.out.print("Introduzca un número: "); //se modifico las comillas simples por las dobles "
	        String niString = s.nextLine(); 

	        int ni = Integer.parseInt(niString); // Se convirtio el String a int usando Integer.parseInt
	        
	        int c = ni; 

	        int afo = 0; 
	        int noAfo = 0; 

	        int temp = ni; // se creo una variable temporal para procesar el número 

	        while (temp > 0) { // Hicimos uso de esa variable temporal
	            int digito = temp % 10; 
	            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) { 
	                afo++; 
	            } else {
	                noAfo++; 
	            }
	            temp /= 10; 
	        }

	        if (afo > noAfo) { 
	            System.out.println("El " + c + " es un número afortunado."); // se modifico el println
	        } else {
	            System.out.println("El " + c + " no es un número afortunado."); 
	        }

	        s.close(); // Agregamos el cierre del scanner

		   
	   
	   }

}
