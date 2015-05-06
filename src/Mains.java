import java.util.Scanner;


public class Mains {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  Biblioteca bibl = new Biblioteca();
		  int pos;
		  System.out.println("Digite a posição que queira gravar o livro(0 a 4): ");
		  pos = input.nextInt();
	      bibl.cadastrarLivros(pos);
	      bibl.mostrar(pos);
			
	      input.close();
		}

	}
