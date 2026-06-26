package barbearia;

public class Gerente extends Funcionario {
	
	private String departamento;
	private int nivelAcesso;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(int nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	public Gerente(String nome, String cpf, String telefone,
            String matricula, double salarioBase, String dataAdmissao,
            String departamento, int nivelAcesso) {
 super(nome, cpf, telefone, matricula, salarioBase, dataAdmissao);
 this.departamento = departamento;
 this.nivelAcesso = nivelAcesso;
}
	@Override
	public void exibirDados() {
	    System.out.println("=== Gerente ===");
	    System.out.println("Nome: " + getNome());
	    System.out.println("Departamento: " + departamento);
	    System.out.println("Nível de Acesso: " + nivelAcesso);
	}
}