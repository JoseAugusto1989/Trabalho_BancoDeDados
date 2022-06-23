package main;

import dao.ControllerConta;
import dao.ControllerDetalhes;
import dao.ControllerMovimentos;

public class StartApp {

	public static void main(String[] args) {
		
		ControllerConta conta = new ControllerConta();
		ControllerDetalhes detalhe = new ControllerDetalhes();
		ControllerMovimentos movi = new ControllerMovimentos();
		
		conta.createConta();
		detalhe.createDetalhes();
		movi.createMovimentos();
		
		conta.deleteConta();
		detalhe.deleteDetalhes();
		movi.deleteMovimentos();
		
		conta.updateConta();
		detalhe.updateDetalhes();
		movi.updateMovimentos();
		
		conta.findByIdConta();
		detalhe.findByIdDetalhes();
		movi.findByIdMovimentos();

	}

}
