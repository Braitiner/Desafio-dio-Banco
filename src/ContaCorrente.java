

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato conta corrente===");
		super.imprimirInfosComuns();
		
	}
	
	public void pagarPix(String chave, double valor, ContaCorrente contaTrasacao) { // implementado opera��o de Pagamento com pix, onde ser� solicitado a chave, valor e conta 
		this.sacar(valor);
		contaTrasacao.depositar(valor);;
	}
	
	public void receberPix(String chave, double valor, ContaCorrente contaTrasacao) { // implementado opera��o de recebimento com pix, onde ser� solicitado a chave valor e conta
		this.depositar(valor);
		contaTrasacao.sacar(valor);
	}

	
 
	
}
