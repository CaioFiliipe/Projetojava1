package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* main � um metodo auto ecxecutavel em java */
	public static void main(String[] args) {
  
		//Obejto ainda n�o existe na memoria
	
		Aluno aluno1 = new Aluno(); // aqui ser� o jo�o
	 		
		Aluno aluno2 = new Aluno(); // aqui ser� o pedro

		Aluno aluno3 = new Aluno(); // aqui ser� o caio
	    
		Aluno Aluno4 = new Aluno ("Maria");
		
		Aluno Aluno5 = new Aluno("Jos�" ,50);
	}

}
