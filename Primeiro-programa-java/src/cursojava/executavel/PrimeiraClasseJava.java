package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* main � um metodo auto ecxecutavel em java */
	public static void main(String[] args) {
   // Resto da divis�o
	String carros =	 JOptionPane.showInputDialog("Informe a quantidade de carros");
	String pessoas =	 JOptionPane.showInputDialog("Informe a quantidade de pessoas");
	
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero);//quando ele fez o calculo ele descobrou que ficava 4,5 ,mas como eu connvertir para inteiro entao ele so mostra o inteiro 
	
	double resto = carroNumero % pessoaNumero; // aqui ele mostra o resto da divisao
	
	int resposta =JOptionPane.showConfirmDialog(null, "Deseja ver o Resultado da divis�o?");
	
	if(resposta == 0) {
		JOptionPane.showMessageDialog(null, "Divisao para Pessoas deu " + divisao);
	}else {
		System.out.println("N�o quiz ver o resultado");
	}
	//System.out.println("Divisao para Pessoas " + divisao + " carros e sobrou " + resto + " carros");		
	 resposta =JOptionPane.showConfirmDialog(null, "Deseja ver o Resto da divis�o?");
	if (resposta == 0) {
		JOptionPane.showConfirmDialog(null, "O Resto da divos�o � " + resto);		
	}else {
		System.out.println("N�o quiz ver o resultado");
	}
	}

}
