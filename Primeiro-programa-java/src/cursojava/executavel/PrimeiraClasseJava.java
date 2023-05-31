package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
//caio
	// main é um metodo auto ecxecutavel em java
	public static void main(String[] args) {
   
	//New Aluno() é uma instancia (Criação de Obejtos)
	//aluno1 é uma referencia para o Obejto Aluno
		Aluno aluno1 = new Aluno(); // aqui será o joão
	 	 aluno1.nome = "João";
	 	 aluno1.idade = 50;
	 	
	 	 System.out.println("Idade do aluno 1 é = " + aluno1.idade);	 	 
	 	 System.out.println("Nome do aluno 1 é = "  + aluno1.nome);
		
		
	 	 
	 	 Aluno aluno2 = new Aluno(); // aqui será o pedro

		Aluno aluno3 = new Aluno(); // aqui será o caio
	    
		Aluno Aluno4 = new Aluno ("Maria");
		
		Aluno Aluno5 = new Aluno("José" ,50);
	}

}
