
public class Livro {
	String nome;
	   int numerodepaginas;
	   String tema,datapublicacao;
	   Autor autores[] = new Autor[2];
	   
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Autor[] getAutores() {
		return autores;
	}
	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}
	public String getDatapublicacao() {
		return datapublicacao;
	}
	public void setDatapuplicacao(String datapublicacao) {
		this.datapublicacao = datapublicacao;
	}
	public int getNumerodepaginas() {
		return numerodepaginas;
	}
	public void setNumerodepaginas(int numerodepaginas) {
		this.numerodepaginas = numerodepaginas;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
}
