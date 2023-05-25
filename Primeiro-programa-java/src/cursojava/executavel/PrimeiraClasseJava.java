package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main é um metodo auto ecxecutavel em java */
	public static void main(String[] args) {
  //Estrutura de repetiçao while
	
		int numero = 0;
		
		while (numero <= 10) { //verifica e depois  executa o codigo
			System.out.println("O numero atual é : " + numero);
			numero++;
		}
		/*----------------------------------------*/
		int numero2 = 0;
	
		do { //primeiro ele executa depois verifica
			System.out.println("O numero atual é : " + numero2);
			numero2++;
		}while(numero2 <= 60);
		
	}

}
