package barbearia;

public class Agendamento {
	private int id;
	private String dataHora;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
 public Agendamento (int id, String dataHora, String status) {
	 this.id = id;
	 this.dataHora = dataHora;
	 this.status = status;
	 
 }
 public void exibirDados() {
	    System.out.println("=== Agendamento ===");
	    System.out.println("ID: " + id);
	    System.out.println("Data/Hora: " + dataHora);
	    System.out.println("Status: " + status);
	}
}
