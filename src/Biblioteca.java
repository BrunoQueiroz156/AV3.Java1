import java.util.Scanner;


public class Biblioteca {
	String nome,endereco;
	   Livro livros[] = new Livro[5];
	     
	   
	   public void cadastrarLivros(int pos){
		   Scanner input = new Scanner(System.in);
		   Livro liv = new Livro();
		  // Autor aut = new Autor();
		   System.out.println("Digite o nome do livro:");
		   liv.nome = input.nextLine();
		   System.out.println("Digite a data de publica��o:");
		   liv.datapublicacao = input.nextLine();
		  // input.nextLine();
		   System.out.println("Digite o tema do livro:");
		   liv.tema = input.nextLine();
		 //  input.nextLine();
		   System.out.println("Digite a quantidade de p�ginas do livro:");
		   liv.numerodepaginas = input.nextInt();
		  input.nextLine();
		   System.out.println("Digite o nome do 1� autor:");
		   Autor aut1 = new Autor();
		   aut1.setNome(input.nextLine());
	       liv.autores[0] = aut1;
		   System.out.println("Digite o nome do 2� autor:");
		   Autor aut2 = new Autor();
		   aut2.setNome(input.nextLine());
		   liv.autores[1] = aut2;
           livros[pos] = liv;
           input.close();
	   }
	   
	   public void mostrar(int pos){
		   System.out.println("Nome do 1� autor: "+livros[pos].autores[0].nome);
	   }
}
