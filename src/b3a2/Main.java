package b3a2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {		
        //Sugiro que teste sem o uso de um arquivo, pois a leitura do seu arquivo não funcionaria devido ao nomes dos métodos
        //Para achar os nomes dos métodos é só entrar nas classes, Vlw Herbert!
		
		Estacionamento pessoa1 = new Estacionamento();
		pessoa1.SetEntrada(3);
		pessoa1.SetSaida(10);
		System.out.println(pessoa1.Preco());
	}
}
