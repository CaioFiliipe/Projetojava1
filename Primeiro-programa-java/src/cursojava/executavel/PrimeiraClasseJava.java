package cursojava.executavel;
/*aksak*/
public class PrimeiraClasseJava {
	
	/*variavel global é acessivel a todos*/
	static int maiorIdadeGlobal = 30;
	
	/*main é um metodo auto ecxecutavel em java*/
    public static void main(String[] args) {
     
   /* Variavel local porque pertence somente a esse metodo*/
    int maiorIdade = 18;
    System.out.println("valor da variavel local=" + maiorIdade);
    System.out.println("valor da variavel local=" + maiorIdadeGlobal);
    
    metodo2();
    
    
   }
    
    public static void metodo2 () {
      System.out.println("valor da variavel global =" + maiorIdadeGlobal);
    }
}

