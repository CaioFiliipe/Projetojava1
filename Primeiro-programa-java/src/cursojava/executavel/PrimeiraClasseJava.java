package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	// main � um metodo auto ecxecutavel em java
	public static void main(String[] args) {
   		
	
	Aluno aluno1 = new Aluno();//aqui sera o joao	
	
    aluno1.setNome("Jo�o da silva");
    aluno1.setIdade(50);
    aluno1.setDataNascimento("14/09/1995");
    aluno1.setRegistroGeral("787.8787.87");
    aluno1.setNumeroCpf("000.000.000.00");
    aluno1.setNomeMae("Simone");
    aluno1.setNomePai("robson");
    aluno1.setDataMatricula("10/01/2019");
    aluno1.setSerieMatriculado("5a");
    aluno1.setNomeEscola("Escola Java");   
        
    System.out.println("Nome � = " + aluno1.getNome());
    System.out.println("Idade � = " + aluno1.getIdade());
    System.out.println("Data de Nascimento � = " + aluno1.getDataNascimento());
    System.out.println("Numero do Registo geral � = " + aluno1.getRegistroGeral());
    System.out.println("Numero do CPF � = " + aluno1.getNumeroCpf());
    System.out.println("Nome da M�e � = " + aluno1.getNomeMae());
    System.out.println("Nome do Pai � = " + aluno1.getNomePai());
    System.out.println("A Data de matricula foi em = " + aluno1.getDataMatricula());
    System.out.println("Serie Matriculada  = " + aluno1.getSerieMatriculado());
    System.out.println("Nome da Escola Matriculada  � = " + aluno1.getNomeEscola());

    System.out.println("-----------------------------------------------------------");
    //.........................................
    
	Aluno aluno2 = new Aluno();//aqui sera o pedro
	aluno2.setNome("Pedro");
	aluno2.setIdade(40);
	aluno2.setDataNascimento("15/19/1995");
	
	System.out.println("Nome � = " + aluno2.getNome());
    System.out.println("Idade � = " + aluno2.getIdade());
    System.out.println("Data de Nascimento � = " + aluno2.getDataNascimento());
	
    //---------------------------
	Aluno aluno3 = new Aluno();//aqui sera o Caio
    Aluno aluno4 = new Aluno("Maria"); 
	Aluno aluno5 = new Aluno("Jos�", 50);
	
	}

}
