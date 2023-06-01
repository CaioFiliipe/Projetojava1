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
    
	private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;



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

public double getNota1() {
	return nota1;
}

public void setNota1(double nota1) {
	this.nota1 = nota1;
}

public double getNota2() {
	return nota2;
}

public void setNota2(double nota2) {
	this.nota2 = nota2;
}

public double getNota3() {
	return nota3;
}

public void setNota3(double nota3) {
	this.nota3 = nota3;
}

public double getNota4() {
	return nota4;
}

public void setNota4(double nota4) {
	this.nota4 = nota4;
}
  
//metodo que retorna a media do aluno
  public double getMediaNota() {
	  return (nota1 + nota2 + nota3 + nota4) / 4;
  }
  //Metodo que retorna true para aprovado e false para reprovado
  public boolean getAlunoAprovado() {
	  double media = this.getMediaNota();
	  if (media >=70) {
		  return true;
	  }else {
		 return false; 
	  }
  }
  public String getAlunoAprovado2() {
	  double media = this.getMediaNota();
	  if (media >=70) {
		  return "Aluno Está Aprovado";
	  }else {
		 return "Aluno Está Reprovado"; 
	  }
  }
  
}
   
    


