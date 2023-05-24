package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main é um metodo auto ecxecutavel em java */
	public static void main(String[] args) {

		int mediaAluno = 70;
        String nome = "fabio";
		
		if (mediaAluno >= 70 && nome.equals("Caio")) {
			System.out.println("Parabens vc está aprovado");

		} else if (mediaAluno < 70) {
			System.out.println("vc esta reprovado");        
		}else {
			System.out.println("Aluno não encontrado");
	}

}
}
