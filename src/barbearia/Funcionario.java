package barbearia;

public abstract class Funcionario extends Pessoa {

	private String matricula;
	private double salarioBase;
	private String dataAdmissao;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Funcionario(String nome, String cpf, String telefone, 
            String matricula, double salarioBase, String dataAdmissao) {
super(nome, cpf, telefone);
this.matricula = matricula;
this.salarioBase = salarioBase;
this.dataAdmissao = dataAdmissao;

	}
}