

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato conta corrente===");
		super.imprimirInfosComuns();
		
	}
	
	public void pagarPix(String chave, double valor, ContaCorrente contaTrasacao) { // implementado operação de Pagamento com pix, onde será solicitado a chave, valor e conta 
		this.sacar(valor);
		contaTrasacao.depositar(valor);;
	}
	
	public void receberPix(String chave, double valor, ContaCorrente contaTrasacao) { // implementado operação de recebimento com pix, onde será solicitado a chave valor e conta
		this.depositar(valor);
		contaTrasacao.sacar(valor);
	}

	
 
	
}
