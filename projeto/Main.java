package projeto;

import java.util.Locale;
import java.util.Scanner;

import calculation_Logic.Calculator;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean programRun = true;
		
		
		System.out.println("CALCULADORA");
		
		while(programRun) {
			
			System.out.print("expressão:");
			String input = sc.nextLine();
			
			// realiza a operação
			Double output = Calculator.makeCalculation(input);
			
			if(output != null) {
				System.out.println("Resultado: " + output);
				
			}
			
			programRun = isUserContinuing(sc);
			
		}
		
		System.out.println("Saindo do programa...");
		
		sc.close();

	}
	
	
	public static boolean isUserContinuing(Scanner sc) {
		
		/*
		 * Verifica se o programa deve continuar sendo executado
		 * 
		 */
		
		while(true) {
			
			System.out.print("Deseja continuar? [S/N]: ");
			String option = sc.nextLine().toUpperCase();
			
			if(option.charAt(0) == 'S') {
				return true;
			}
			else if(option.charAt(0) == 'N') {
				return false;
			}
			else {
				System.out.println("Opção invalida!");
			}
			
		}
		
	}
	
		
}
