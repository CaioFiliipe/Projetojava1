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
	String Nota1 = JOptionPane.showInputDialog("Digite a sua primeira nota ? ");
	String Nota2 = JOptionPane.showInputDialog("Digite sua segunda nota ? ");
	String Nota3 = JOptionPane.showInputDialog("Digite sua terceira nota ? ");
	String Nota4 = JOptionPane.showInputDialog("Digite sua quarta nota ? ");
	
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
    aluno1.setNota1(Double.parseDouble(Nota1));
    aluno1.setNota2(Double.parseDouble(Nota2));
    aluno1.setNota3(Double.parseDouble(Nota3));
    aluno1.setNota4(Double.parseDouble(Nota4));
    
    
      
      System.out.println(aluno1.toString());//descreve do obejeto na memoria
      System.out.println("Media do aluno =" + aluno1.getMediaNota());
      System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
     
      
	}

}
