package barbearia;

public class Barbeiro extends Funcionario {
	private String especialidade;
	private double percentualComissao;
	private String agendamentos;
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getPercentualComissao() {
		return percentualComissao;
	}
	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	public String getAgendamentos() {
		return agendamentos;
	}
	public void setAgendamentos(String agendamentos) {
		this.agendamentos = agendamentos;
	}
	
	public Barbeiro(String nome, String cpf, String telefone,
            String matricula, double salarioBase, String dataAdmissao,
            String especialidade, double percentualComissao) {
super(nome, cpf, telefone, matricula, salarioBase, dataAdmissao);
this.especialidade = especialidade;
this.percentualComissao = percentualComissao;
}
	@Override
	public void exibirDados() {
	    System.out.println("=== Barbeiro ===");
	    System.out.println("Nome: " + getNome());
	    System.out.println("Especialidade: " + especialidade);
	    System.out.println("Comissão: " + percentualComissao);
	}
}