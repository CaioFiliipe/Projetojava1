package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main é um metodo auto ecxecutavel em java */
	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 80;
		int nota4 = 60;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		// SWITCH CASE :OPERAÇOES EXATAS
		int dia = 1;
		
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		case 4:
			System.out.println("quarta-feira");
			break;
		case 5:
			System.out.println("quinta-feira");
			break;
		case 6:
			System.out.println("sexta-feira");
			break;
		case 7:
			System.out.println("sabado");
			break;
		default:System.out.println("Outro dia qualquer");
			break;
		}
	}

}
