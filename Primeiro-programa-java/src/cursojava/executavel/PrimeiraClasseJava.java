package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	// main é um metodo auto ecxecutavel em java
	public static void main(String[] args) {
   		
	String nome = JOptionPane.showInputDialog("Qual o Nome do aluno ?");
	String idade = JOptionPane.showInputDialog("Qual a sua idade do aluno ? ");
	String DataNascimento = JOptionPane.showInputDialog("Qual a sua data de nascimento ? ");
	String Rg = JOptionPane.showInputDialog("Digite seu RG ? ");
	String cpf = JOptionPane.showInputDialog("Digite seu Cpf? ");
	String mae = JOptionPane.showInputDialog(" nome da sua mãe ? ");
	String pai = JOptionPane.showInputDialog(" nome do seu pai ? ");
	String DataMatricula = JOptionPane.showInputDialog("Digite a data da Matricula ? ");
	String SerieMatriculado = JOptionPane.showInputDialog("Qual a serie do aluno ? ");
	String NomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? ");
	
	Aluno aluno1 = new Aluno();	
	
    aluno1.setNome(nome);
    aluno1.setIdade(Integer.valueOf(idade));
    aluno1.setDataNascimento(DataNascimento);
    aluno1.setRegistroGeral(Rg);
    aluno1.setNumeroCpf(cpf);
    aluno1.setNomeMae(mae);
    aluno1.setNomePai(pai);
    aluno1.setDataMatricula(DataMatricula);
    aluno1.setSerieMatriculado(SerieMatriculado);
    aluno1.setNomeEscola(NomeEscola);   
    
   
    Disciplina disciplina1 = new Disciplina();
    disciplina1.setDisciplina("Banco de Dados");
    disciplina1.setNota(90);
    
    aluno1.getDisciplinas().add(disciplina1);
    
    
    Disciplina disciplina2 = new Disciplina();
    disciplina2.setDisciplina("Matematica");
    disciplina2.setNota(80);
    
    aluno1.getDisciplinas().add(disciplina2);
    
    Disciplina disciplina3 = new Disciplina();
    disciplina3.setDisciplina("Geografia");
    disciplina3.setNota(97);
    
    aluno1.getDisciplinas().add(disciplina3);
    
    Disciplina disciplina4 = new Disciplina();
    disciplina4.setDisciplina("Java WEB");
    disciplina4.setNota(70);
    
    aluno1.getDisciplinas().add(disciplina4);
    
    
    
    
    
     System.out.println(aluno1); 
      System.out.println("Media do aluno =" + aluno1.getMediaNota());
      System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
     
		
	
     
      
		
	}

}
