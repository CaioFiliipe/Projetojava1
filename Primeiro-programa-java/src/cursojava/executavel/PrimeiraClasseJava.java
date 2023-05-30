package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* main é um metodo auto ecxecutavel em java */
	public static void main(String[] args) {
  
		//Obejto ainda não existe na memoria
	
		Aluno aluno1 = new Aluno(); // aqui será o joão
	 		
		Aluno aluno2 = new Aluno(); // aqui será o pedro

		Aluno aluno3 = new Aluno(); // aqui será o caio
	    
		Aluno Aluno4 = new Aluno ("Maria");
		
		Aluno Aluno5 = new Aluno("José" ,50);
	}

}
