package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
//caio
	// main � um metodo auto ecxecutavel em java
	public static void main(String[] args) {
   
	//New Aluno() � uma instancia (Cria��o de Obejtos)
	//aluno1 � uma referencia para o Obejto Aluno
		Aluno aluno1 = new Aluno(); // aqui ser� o jo�o
	 	 aluno1.nome = "Jo�o";
	 	 aluno1.idade = 50;
	 	
	 	 System.out.println("Idade do aluno 1 � = " + aluno1.idade);	 	 
	 	 System.out.println("Nome do aluno 1 � = "  + aluno1.nome);
		
		
	 	 
	 	 Aluno aluno2 = new Aluno(); // aqui ser� o pedro

		Aluno aluno3 = new Aluno(); // aqui ser� o caio
	    
		Aluno Aluno4 = new Aluno ("Maria");
		
		Aluno Aluno5 = new Aluno("Jos�" ,50);
	}

}
