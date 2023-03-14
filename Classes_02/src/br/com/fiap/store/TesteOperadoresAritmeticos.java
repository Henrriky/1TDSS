package br.com.fiap.store;

import java.util.Scanner;

public class TesteOperadoresAritmeticos {
	public static void main(String[] args) {
	
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos: ");
		int qtdAlunos = leitor.nextInt();
				
		double qtdGrupoDe5 = qtdAlunos/5;
	

		
		//Calcular quantos alunos formaram o ultimo grupo
		System.out.println("Quantidade de grupos de 5: " + qtdGrupoDe5);
		System.out.println(qtdAlunos%5);
		
		//Quantidade de alunos no último grupo
		int qtdAlunosUltimoGrupo = qtdAlunos%5;
		System.out.println("Alunos do ultimo grupo: " + qtdAlunosUltimoGrupo);
		
		
	}
}
