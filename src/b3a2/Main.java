package b3a2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {		
        //Sugiro que teste sem o uso de um arquivo, pois a leitura do seu arquivo n�o funcionaria devido ao nomes dos m�todos
        //Para achar os nomes dos m�todos � s� entrar nas classes, Vlw Herbert!
		
		Estacionamento pessoa1 = new Estacionamento();
		pessoa1.SetEntrada(3);
		pessoa1.SetSaida(10);
		System.out.println(pessoa1.Preco());
	}
}
