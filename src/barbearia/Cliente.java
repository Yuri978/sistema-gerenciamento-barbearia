package barbearia;

public class Cliente extends Pessoa {
	private String email;
	private String historico;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public Cliente(String nome, String cpf, String telefone, String email) {
	    super(nome, cpf, telefone); 
	    this.email = email;
	}
	@Override
	public void exibirDados() {
		// TODO Auto-generated method stub
		
		    System.out.println("=== Cliente ===");
		    System.out.println("Nome: " + getNome());
		    System.out.println("CPF: " + getCpf());
		    System.out.println("Email: " + email);
		}
	}


