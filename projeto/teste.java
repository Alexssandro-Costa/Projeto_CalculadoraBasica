package projeto;

import java.util.Locale;
import java.util.Scanner;

import calculation_Logic.Calculator;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean programRun = true;
		System.out.println("CALCULADORA");
		
		while(programRun) {
			
			System.out.print("expressão:");
			String input = sc.nextLine();
			
			// realiza a operação
			System.out.println(Calculator.makeCalculation(input));
			
			// verifica se o usuario deseja continuar ou não
			while(true) {
					
				System.out.print("Deseja continuar? [S/N]: ");
				String option = sc.nextLine().toUpperCase();
				
				if(option.charAt(0) == 'S') {
					break;
				}
				else if(option.charAt(0) == 'N') {
					programRun = false;
				}
				else {
					System.out.println("Opção invalida!");
				}
				
			}
			
		}
		
		System.out.println("Saindo do programa...");
		
		sc.close();

	}
	
	
}
