package barbearia;

public class Main {

	public static void main(String[] args) {
	    // Criando e exibindo cliente
	    Cliente c = new Cliente("João Silva", "123.456.789-00", "16999999999", "joao@email.com");
	    c.exibirDados();

	    // Criando e exibindo serviço
	    Servico s = new Servico(1, "Corte Simples", TipoServico.CORTE, 25.0, 30, true);
	    s.exibirDados();

	    // Criando e exibindo agendamento
	    Agendamento a = new Agendamento(1, "01/06/2026 10:00", "CONFIRMADO");
	    a.exibirDados();

	    // Salvando e carregando arquivo
	    GerenciadorArquivos ga = new GerenciadorArquivos();
	    ga.salvarCliente(c.getNome() + "," + c.getCpf());
	    ga.carregarCliente();
	}
}
