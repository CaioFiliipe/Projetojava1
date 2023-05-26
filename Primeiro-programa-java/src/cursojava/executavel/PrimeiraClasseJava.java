package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* main é um metodo auto ecxecutavel em java */
	public static void main(String[] args) {
   // Resto da divisão
	String carros =	 JOptionPane.showInputDialog("Informe a quantidade de carros");
	String pessoas =	 JOptionPane.showInputDialog("Informe a quantidade de pessoas");
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero);//quando ele fez o calculo ele descobrou que ficava 4,5 ,mas como eu connvertir para inteiro entao ele so mostra o inteiro 
	
	double resto = carroNumero % pessoaNumero; // aqui ele mostra o resto da divisao
	//System.out.println("Divisao para Pessoas " + divisao + " carros e sobrou " + resto + " carros");
	JOptionPane.showMessageDialog(null, "Divisao para Pessoas deu " + divisao + " carros e sobrou " + resto + " carros");
	System.out.println(carros);
	}

}
