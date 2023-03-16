package com.br.fiap.aula03_pratica;

import java.util.Scanner;

public class Pratica {
	
	public static void main(String[] args) {
		
		//Declaração de variáveis
		String nome = new String("");
		int [] checkpoints = new int[3];
		int challenge = 0;
		int globalSolution = 0;
		//Media
		double mediaCheckpointsChallenge = 0;
		double mediaGeral = 0;
		
		//Declaração do Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Pegando nome do aluno
		System.out.print("Digite o nome do aluno: ");
		nome = entrada.next();
		
		
		//Pegando nota do Checkpoint
		for (int i = 0; i < checkpoints.length; i++) {
			System.out.print("Digite o valor do Checkpoint " + i + ": ");
			checkpoints[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < checkpoints.length; i++) {
			if (i == 0) {
				if(checkpoints[i] < checkpoints[i+1] && checkpoints[i] < checkpoints[i+2]) {
					continue;
				} else {
					mediaCheckpointsChallenge += checkpoints[i];
				}
			} 
			
			if (i == 1) {
				if(checkpoints[i] < checkpoints[i-1] && checkpoints[i] < checkpoints[i+1]) {
					continue;
				} else {
					mediaCheckpointsChallenge += checkpoints[i];
				}
			}
			
			if (i == 2) {
				if(checkpoints[i] < checkpoints[i-1] && checkpoints[i] < checkpoints[i-2]) {
					continue;
				} else {
					mediaCheckpointsChallenge += checkpoints[i];
				}
			}

		}
		
		mediaCheckpointsChallenge = (checkpoints[0] + checkpoints[1] + checkpoints[2])/3;
		
		//Pegando nota do Challenge
		System.out.print("Digite a nota Challenge: ");
		challenge = entrada.nextInt();
		
		//Pegando nota da global solution
		System.out.print("Digite a nota da Global Solution: ");
		globalSolution = entrada.nextInt();
		
		//Media
		mediaGeral = mediaCheckpointsChallenge*0.2 + challenge*0.2 + globalSolution*0.6; 
		
		//Exibição do nome + média
		System.out.println("O aluno " + nome + " teve media igual a: " + mediaGeral);

	}
}
