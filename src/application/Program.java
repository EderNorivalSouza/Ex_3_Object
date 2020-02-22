package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota do primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota do segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota do terceiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal()>=60) {
			System.out.println("PASS");
		}
		else {
			double missing = 60-aluno.notaFinal();
			System.out.println("FAILED");
			System.out.println("MISSING "+missing+" POINTS");
		}
		
	sc.close();	
	}

}
