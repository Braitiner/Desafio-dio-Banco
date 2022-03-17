
public class Endereco {
	
	private String endereco;
	private String bairro;
	private String cidade;
	private String cep;
	
		
	
	public Endereco(String endereco, String cidade) {
		super();
		this.endereco = endereco;
		this.cidade = cidade;

	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	

}
