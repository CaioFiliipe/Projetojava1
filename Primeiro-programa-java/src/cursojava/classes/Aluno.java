package cursojava.classes;

//Estra é nosa classe/obejto que representa o aluno
public class Aluno {
	
	String nome;
	int idade;
	String dataNascimento;
	String registoGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() {//cria dados na memoria - sendo padrão do java
		
		
	}
	
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno (String nomePadrao , int idadePadrao) {
	 nome = nomePadrao;
	 idade = idadePadrao;
			 
}
