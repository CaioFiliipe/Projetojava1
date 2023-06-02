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
	//
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
    
    System.out.println("Nome é = " + aluno1.getNome());
    System.out.println("Idade é = " + aluno1.getIdade());
    System.out.println("Data de Nascimento é = " + aluno1.getDataNascimento());
    System.out.println("Numero do Registo geral é = " + aluno1.getRegistroGeral());
    System.out.println("Numero do CPF é = " + aluno1.getNumeroCpf());
    System.out.println("Nome da Mãe é = " + aluno1.getNomeMae());
    System.out.println("Nome do Pai é = " + aluno1.getNomePai());
    System.out.println("A Data de matricula foi em = " + aluno1.getDataMatricula());
    System.out.println("Serie Matriculada  = " + aluno1.getSerieMatriculado());
    System.out.println("Nome da Escola Matriculada  é = " + aluno1.getNomeEscola());
    System.out.println("Media da nota é = " +aluno1.getMediaNota());
    System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
    
    System.out.println("-----------------------------------------------------------");
    
               
	
	}

}
