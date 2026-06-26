package barbearia;

public abstract class  Pessoa {
	private String nome;
	private String cpf;
	private String dataCadastro;
	private String telefone;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String cpf, String telefone) {
	    this.nome = nome;
	    this.cpf = cpf;
	    this.telefone = telefone;
	}
	public abstract void exibirDados();
}
