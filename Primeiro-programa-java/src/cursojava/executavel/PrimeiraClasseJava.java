package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	// main é um metodo auto ecxecutavel em java
	public static void main(String[] args) {
   	
		List<Aluno> alunos= new ArrayList<Aluno>();
		for(int qtd = 1 ; qtd <=2; qtd ++) {
		
		
	String nome = JOptionPane.showInputDialog("Qual o Nome do aluno"+qtd+" ?");
 /*	String idade = JOptionPane.showInputDialog("Qual a sua idade do aluno ? ");
	String DataNascimento = JOptionPane.showInputDialog("Qual a sua data de nascimento ? ");
	String Rg = JOptionPane.showInputDialog("Digite seu RG ? ");
	String cpf = JOptionPane.showInputDialog("Digite seu Cpf? ");
	String mae = JOptionPane.showInputDialog(" nome da sua mãe ? ");
	String pai = JOptionPane.showInputDialog(" nome do seu pai ? ");
	String DataMatricula = JOptionPane.showInputDialog("Digite a data da Matricula ? ");
	String SerieMatriculado = JOptionPane.showInputDialog("Qual a serie do aluno ? ");
	String NomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? ");*/
	
	Aluno aluno1 = new Aluno();	
	
    aluno1.setNome(nome);
    /*aluno1.setIdade(Integer.valueOf(idade));
    aluno1.setDataNascimento(DataNascimento);
    aluno1.setRegistroGeral(Rg);
    aluno1.setNumeroCpf(cpf);
    aluno1.setNomeMae(mae);
    aluno1.setNomePai(pai);
    aluno1.setDataMatricula(DataMatricula);
    aluno1.setSerieMatriculado(SerieMatriculado);
    aluno1.setNomeEscola(NomeEscola);   */
    
   for (int pos = 1; pos <= 4; pos++) {
	   String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" +pos+" ?");
	   String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" +pos+" ?");
	  
	   Disciplina disciplina = new Disciplina();
	   disciplina.setDisciplina(nomeDisciplina);
	   disciplina.setNota(Double.valueOf(notaDisciplina));
  
	   aluno1.getDisciplinas().add(disciplina);
   
   
   }
    
     int escolha =JOptionPane.showConfirmDialog(null, "Deseja Remover Alguma disciplina");
  
     if(escolha == 0) { //opçao sim e Zero
    	 
    	 int continuarRemover = 0;
    	 int posicao = 1;
    	 while(continuarRemover == 0){
    		 String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou  4,");
    	       aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao );
    	       posicao ++;//soma +1
    		 continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
    		 
    	 }
    	 
	  
    		   
   }
   
     alunos.add(aluno1);
		}
     
	    for (Aluno aluno : alunos) 
	    	
            if(aluno.getNome().equalsIgnoreCase("Caio")) {	    	 
	    	 System.out.println(aluno); 
	         System.out.println("Media do aluno =" + aluno.getMediaNota());
	         System.out.println("Resultado = " + aluno.getAlunoAprovado2());
		   System.out.println("--------------------------------------------");
	    break;
            }
		
	}

}
