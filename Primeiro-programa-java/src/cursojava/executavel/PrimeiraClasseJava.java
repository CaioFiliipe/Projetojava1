package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main � um metodo auto ecxecutavel em java */
	public static void main(String[] args) {

		int nota1 = 40;
		int nota2 = 50;
		int nota3 = 30;
		int nota4 = 60;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		// Opera�oes logicas aninhadas: S�o opera�oes dentro de opera�oes
		if (media >= 50) {
			if (media >= 70) {
			if(media >90) {
				System.out.println("Aluno provado direto - Parabens : "+media);
			}	
			}else {
				System.out.println("Aluno em precupera��o:" + media);
			}
		}else {
			System.out.println("Aluno reprovado direto:" + media);
		}

	}

}
