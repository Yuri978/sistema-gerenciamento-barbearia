package barbearia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class GerenciadorArquivos {
	public void salvarCliente(String dados) {
		try {
	        FileWriter fw = new FileWriter("clientes.txt", true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(dados);
	        bw.newLine();
	        bw.close();
	    } catch (Exception e) {
	        System.out.println("Erro ao salvar: " + e.getMessage());
	    
	}
	}
	public void carregarCliente() {
	    try {
	        FileReader fr = new FileReader("clientes.txt");
	        BufferedReader br = new BufferedReader(fr);
	        String linha;
	        while ((linha = br.readLine()) != null) {
	            System.out.println(linha);
	        }
	        br.close();
	    } catch (Exception e) {
	        System.out.println("Erro ao carregar: " + e.getMessage());
	    }
	}
}