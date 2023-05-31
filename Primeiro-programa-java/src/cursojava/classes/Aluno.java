package cursojava.classes;
//esta é nossa classe/obejto que representa o aluno
public class Aluno {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String RegistroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String serieMatriculado;
	private String nomeEscola;

   public Aluno() { //cria os dados na memoria 
	

   }
   
  public Aluno (String nomePadrao) {
	  nome = nomePadrao;
  }
	 
  public Aluno (String nomePadrao,int idadePadrao) {
	  nome =nomePadrao;
	  idade = idadePadrao;
  }
  
  //metodos SETTERS E GETTERS DO Obejto
  //SET é para adicionar ou receber dados para os atributos
  // GET é para resgar ou obeter o valor do atributo
  
  //Recebe dados
  public void setNome(String nome) {
	  this.nome = nome;
  }
  
  public String getNome() {
	  return nome;
  }

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public String getRegistroGeral() {
	return RegistroGeral;
}

public void setRegistroGeral(String registroGeral) {
	RegistroGeral = registroGeral;
}

public String getNumeroCpf() {
	return numeroCpf;
}

public void setNumeroCpf(String numeroCpf) {
	this.numeroCpf = numeroCpf;
}

public String getNomeMae() {
	return nomeMae;
}

public void setNomeMae(String nomeMae) {
	this.nomeMae = nomeMae;
}

public String getNomePai() {
	return nomePai;
}

public void setNomePai(String nomePai) {
	this.nomePai = nomePai;
}

public String getSerieMatriculado() {
	return serieMatriculado;
}

public void setSerieMatriculado(String serieMatriculado) {
	this.serieMatriculado = serieMatriculado;
}

public String getDataMatricula() {
	return dataMatricula;
}

public void setDataMatricula(String dataMatricula) {
	this.dataMatricula = dataMatricula;
}

public String getNomeEscola() {
	return nomeEscola;
}

public void setNomeEscola(String nomeEscola) {
	this.nomeEscola = nomeEscola;
}
  
  
  
}
   
    


