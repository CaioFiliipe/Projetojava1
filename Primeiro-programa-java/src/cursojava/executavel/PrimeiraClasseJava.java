package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main � um metodo auto ecxecutavel em java */
	public static void main(String[] args) {

		int nota1 = 50;
		int nota2 = 90;
		int nota3 = 40;
		int nota4 = 20;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
//Condi�oes logicas com IF e ELSE
		if (media >= 70) {
			System.out.println("aluno Aprovado: " + media);
		}
		if (media >= 40 && media <= 69) {
			System.out.println("Aluno em Recupera�ao: " + media);
		} else {
			System.out.println("Aluno Reprovado: " + media);
		}
       
		//operadores ternarios sao para micro valida�oes
		
		String saidaResultado = media >= 70 ? "aluno aprovado" : "aluno reprovado";
		System.out.println(saidaResultado);
	}
}
