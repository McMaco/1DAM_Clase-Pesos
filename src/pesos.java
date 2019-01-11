/***PROGRAMA DE PESOS
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 29/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class pesos {
	
	/*ATRIBUTOS*/
	private double kilogramos;
	private String medida;
	private String med;
	private String unidad;
	double peso;
	
	//constructor 
	
	public pesos(double peso, String med) {
		medida = med;
		switch (med) {
		case "Lb":
			//1 libra= 0.46 kilogramos
			kilogramos= peso * 0.46;
			break;
		case "Li":
			//1 lingote = 14.59 kilogramos
			kilogramos = peso * 14.59;
			break;
			
		case "Oz":
			//1 onza = 0.0283495 kilogramos
			kilogramos = peso * 0.0283495;
			break;
			
		case "P":
			// 1 penique = 0.002 kilogramos
			kilogramos = peso * 0.002;
			break;
			
		case "K":
			// 1 kilo = 1 kilogramos
			kilogramos = peso * 1;
			break;
			
		case "G":
			// 1 gramo = 0.001 kilogramos
			kilogramos = peso * 0.001;
			break;
			
		case "Q":
			// 1 quintal = 43.3 kilogramos
			kilogramos = peso * 43.3;
			break;
		}
	}
	
	//Métodos de get
	
		public double getKilogramos() {
			return kilogramos;
		}

		public double getLibras() {
			return (getKilogramos() / 2.20462);
		}
		
		public double getLingotes() {
			return (getLibras() / 32.17);
		}
		
		public double getPeso(String unid) {
			switch (unid) {
			case "Lb":
				//1 libra= 0.46 kilogramos
				return getLibras();
				
			case "Li":
				//1 lingote = 14.59 kilogramos
				return getLingotes();
				
			case "Oz":
				//1 onza = 0.0283495 kilogramos
				return (getKilogramos() * 35.274);
				
			case "P":
				// 1 penique = 0.002 kilogramos
				return (getKilogramos() * 645.16129);
				
			case "K":
				// 1 kilo = 1 kilogramos
				return getKilogramos();
				
			case "G":
				// 1 gramo = 0.001 kilogramos
				return (getKilogramos() * 1000);
				
			case "Q":
				// 1 quintal = 43.3 kilogramos
				return (getKilogramos() * 0.02309469);
			}
			return kilogramos;
		}

	
	//main para testear la clase
	public static void main(String [] args) {
		
		/*VARIABLES*/
		double peso_intr = 0;
		String medida_intr;
		String unid;
		System.out.println("-------------------------");
		System.out.println("Testeo de la clase pesos");
		System.out.println("-------------------------");
		System.out.println();
		
		do {	
			Scanner teclado= new Scanner(System.in);
			System.out.println("Introduce la cantidad: ");
			peso_intr = teclado.nextInt();
		}while (peso_intr < 0);
		Scanner pedirmedida= new Scanner(System.in);
		System.out.println("Introduce una medida: \n Lb(libras)\n Li(lingotes)\n Oz(onzas)\n P(peniques)\n K(kilogramos)\n G(gramos)\n Q(quintales)");
		medida_intr = pedirmedida.next();
		pesos p = new pesos(peso_intr, medida_intr);
		
		System.out.println("Muestra el peso en kilogramos: "+ p.getKilogramos());
		System.out.println("Muestra el peso en libras: "+ p.getLibras());
		System.out.println("Muestra el peso en lingotes: "+ p.getLingotes());
		
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce una medida: \n Lb(libras)\n Li(lingotes)\n Oz(onzas)\n P(peniques)\n K(kilogramos)\n G(gramos)\n Q(quintales)");
		unid = read.next();
		System.out.println("Muestra el peso en "+ unid +": "+ p.getPeso(unid));
	}
}
	
