package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main � um metodo auto ecxecutavel em java */
	public static void main(String[] args) {
  //Estrutura de repeti�ao FOR e continue
	
		for(int numero = 0; numero <=10; numero ++) {
		if (numero == 3 || numero == 6 || numero == 9  ) {
			System.out.println("Obaaa, encontrei o numero " +numero);
			continue;
	}
	System.out.println("processando la�oo de repeti�ao");
	}
	}

}
