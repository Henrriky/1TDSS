package br.com.fiap.store;

public class Teste {
	public static void main(String[] args) {
		
		Editora editoraDaEscola = new Editora();
		editoraDaEscola.nome = "Editora Abril";
		editoraDaEscola.endereco = "Marginal Tiete";
		editoraDaEscola.cnpj = "132.131.323/0001-12";
		
		Editora novaEditora = new Editora();
		
		novaEditora.nome = "Editora Atlas";
		novaEditora.endereco = "Vila Mariana";
		novaEditora.cnpj = "123.111.345./0012-12";
		
		//Criar objeto Ebook
		Ebook harryPoter = new Ebook();
		harryPoter.editora = novaEditora;
		harryPoter.genero = "Romance";
		harryPoter.idioma = "Português";
		harryPoter.isbn = "";
		harryPoter.nome = "Harry Poter";
		harryPoter.quantidadePagina = 180;
		harryPoter.Rating = 4.5;
		harryPoter.resumo = "Lorem ipsum";
		harryPoter.valor = 170.5;
				
		System.out.println(editoraDaEscola.nome);
		
		System.out.println("Nome: " + harryPoter.nome + "\n Valor: " + harryPoter.valor + "\n Nome da Editora: " + harryPoter.editora.nome );
		
		
	}
}
