package view;

public class View {
	
	public void menuCadastro() {
		System.out.println("************************************************************");
		System.out.println("Seja bem vindo, antes de começar vamos fazer seu cadastro =D");
		System.out.println("Por favor insira seus seguintes dados: \n");
			
	}
	
	public void menuInicial() {
		System.out.println("Bem vindo ao menu principal");
		System.out.println("1 - Adicionar cliente \n"
			+ "2 - Consultar conta \n"
			+ "3 - Atualizar, Saque ou Deposito na conta \n"
			+ "4 - Excluir conta \n"
			+ "9 - Sair  \n"
			+ "\n Digite uma opção: ");
	}
	
	public void menuAtualizar() {
		System.out.println("\n1 - Atualizar Dados do cliente \n"
				+ "2 - Fazer um Saque \n"
				+ "3 - Fazer um Deposito na Conta \n" 
				+ "? (Qualquer outra opção) - Voltar para opção anterior \n"
				+ "Digite sua opção: ");
	}
	
	public void atualizarDadosCliente() {
		System.out.println("Testando");
		
	}
	
	public void saque() {
		System.out.println("Testando saque");
		
	}
	
	public void deposito() {
		System.out.println("Testando deposito");
	}
	
	public void menuFim() {
		System.out.println("FIM DO APP, OBRIGADO PELA PREFERÊNCIA!!!");
		System.out.println("************************************************************");
	}
	
	public void menuErrado() {
		System.out.println("Opção errada, digite novamente!!!");
		menuInicial();
	}

}
