package barbearia;

public class Servico {
	private int codigo; 
	private String nome; 
	private String tipoServico; 
	private double valor;
	private int duracaoMin;  
	private boolean ativo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getDuracaoMin() {
		return duracaoMin;
	}
	public void setDuracaoMin(int duracaoMin) {
		this.duracaoMin = duracaoMin;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	} 

	public Servico(int codigo, String nome, String tipoServico, 
            double valor, int duracaoMin, boolean ativo) {
 this.codigo = codigo;
 this.nome = nome;
 this.tipoServico = tipoServico;
 this.valor = valor;
 this.duracaoMin = duracaoMin;
 this.ativo = ativo;
}
	public void exibirDados() {
	    System.out.println("=== Serviço ===");
	    System.out.println("Nome: " + nome);
	    System.out.println("Tipo: " + tipoServico);
	    System.out.println("Valor: " + valor);
	    System.out.println("Ativo: " + ativo);
	}
}
