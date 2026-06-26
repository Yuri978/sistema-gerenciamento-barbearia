package barbearia;

public class Atendimento {
	private String observacoes;
	private double valorFinal;
	private double valorComissao;
	private String formaPagamento;  
	private String dataHoraFim;
	
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public double getValorComissao() {
		return valorComissao;
	}
	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public String getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(String dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
   public Atendimento (String observacoes, double valorFinal, double valorComissao, String formaPagamento, String dataHoraFim) {
	 this.observacoes = observacoes;
	 this.dataHoraFim = dataHoraFim;
	 this.formaPagamento = formaPagamento;
	 this.valorComissao = valorComissao;
	 this.valorFinal = valorFinal;
	 
 }
   public void exibirDados() {
	    System.out.println("=== Atendimento ===");
	    System.out.println("observacoes: " + observacoes);
	    System.out.println("valorFinal: " + valorFinal);
	    System.out.println("valorComissao: " + valorComissao);
	    System.out.println("Forma Pagamento: " + formaPagamento);  
	    System.out.println("Data/Hora Fim: " + dataHoraFim);       

   }
   
}

