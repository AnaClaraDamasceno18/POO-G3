package br.com.poo.io;

import br.com.poo.pessoa.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.com.poo.contas.*;

public class LeituraEscrita {

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if(linha != null) {
				System.out.println(linha);
			}else
				break;
				linha = buffRead.readLine();
		}
		buffRead.close();
	}
	
	public static void escritor(String path) throws IOException{
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner in = new Scanner(System.in);
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		in.close();
	}

	

}

