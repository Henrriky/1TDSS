package br.com.fiap.motors.model;

public class View {
	public static void main(String[] args) {
		//Instanciar o carro
		Carro fiap = new Carro();
		//Colocar informações nos atributos
		fiap.modelo = "Carro FIAP";
		fiap.valor = 145999.99;
		fiap.ano = 2000;
		//Calcular a idade do carro
		System.out.println(fiap.calcularIdade(2023));
	}
}
