package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main é um metodo auto ecxecutavel em java */
	public static void main(String[] args) {
  //Estrutura de repetiçao FOR e continue
	
		for(int numero = 0; numero <=10; numero ++) {
		if (numero == 3 || numero == 6 || numero == 9  ) {
			System.out.println("Obaaa, encontrei o numero " +numero);
			continue;
	}
	System.out.println("processando laçoo de repetiçao");
	}
	}

}
