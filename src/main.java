
public class main {

	public static void main(String[] args) {
		
		Cliente braitiner = new Cliente("Braitiner", "123456", new Endereco("rua flor", "Uberlandia"));
		Cliente joao = new Cliente("João", "654321", new Endereco("rua Arvore", "Uberlandia"));
		Cliente ana = new Cliente("Ana", "654321", new Endereco("rua Paper","Uberlandia"));
		
		ContaCorrente ccBraitiner = new ContaCorrente(braitiner);
		ContaCorrente ccJoao = new ContaCorrente(joao);
		ContaCorrente ccAna = new ContaCorrente(ana);
		
		Conta poupancaBraitiner = new ContaPoupanca(braitiner);
		Conta poupancaJoao = new ContaPoupanca(joao);
		Conta poupancaAna = new ContaPoupanca(ana);
		
		//validar deposito e saque com regra de não ter saque superios ao saldo da conta.
		ccBraitiner.depositar(100);
		ccBraitiner.sacar(200);
		ccBraitiner.imprimirExtrato();

		
		//validar transferncia entre contas
		ccAna.depositar(1000);
		ccAna.transferir(500, poupancaAna);
		poupancaAna.transferir(100, poupancaJoao);
		
		ccAna.imprimirExtrato();
		poupancaAna.imprimirExtrato();
		poupancaJoao.imprimirExtrato();
		
		//Validar pix
		ccAna.pagarPix("545465", 200, ccBraitiner);
		ccBraitiner.imprimirExtrato();
		ccBraitiner.receberPix("54654", 10, ccAna);
		ccBraitiner.imprimirExtrato();
		ccAna.imprimirExtrato();
	
	}

}
