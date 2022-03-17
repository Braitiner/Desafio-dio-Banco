
public class Cliente {
	
	private String nome;
	private String documento;
	private Endereco endereco;
	
		
	
	public Cliente(String nome, String documento, Endereco endereco) {
		super();
		this.nome = nome;
		this.documento = documento;
		this.endereco = endereco;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	


	
	
	

}
