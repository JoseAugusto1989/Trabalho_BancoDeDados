package dao;

import javax.persistence.EntityManager;

import entities.Banco;
import entities.ContaBancaria;
import entities.Movimentos;
import utils.HibernateUtil;

public class Controller {
	
	EntityManager em = HibernateUtil.getEntityManager();
	ContaBancaria conta = new ContaBancaria();
	Movimentos movi = new Movimentos();
	Banco banco = new Banco();
	
	public void createBanco() {
		
		banco.setId(1);
		banco.setNome("Univas");
		banco.setCnpj("12234.84735.87362");
    	
    	em.getTransaction().begin();
    	em.persist(banco);
    	em.getTransaction().commit();
    	
    	System.out.println("Teste OK");
	}
	
	public void removeBanco() {
		
		int idRemove = 1; // id para ser deletado
		banco = em.find(Banco.class, idRemove);
		
		if (banco != null) {
			em.getTransaction().begin();
			em.remove(banco);
			em.getTransaction().commit();
			System.out.println("Banco deletado com sucesso");
			
		} else {
			System.out.println("Banco " + idRemove + " não encontrado");
		}
	}
	
	public void findByIdBanco() {
		
		int findId = 1;
		banco = em.find(Banco.class, findId);
		if (banco == null) {
			System.out.println("Banco: " + findId + " Id, não encontrado!!!");
			
		} else {
			System.out.println(banco);
		}
	}
	
	public void updateBanco() {
		int idBanco = 1; // id para identificar qual objeto sera alterado
		banco = em.find(Banco.class, idBanco);
		
		if (banco != null) {
			banco.setId(1);
			banco.setNome("Santander");
			banco.setCnpj("12340987");
			em.getTransaction().begin();
			em.merge(banco);
			em.getTransaction().commit();
			
		} else {
			System.out.println("Banco " + banco.getNome() + ", não encontrado");
		}
	}
	
	public void createContaBancaria() {
		
		conta.setIdConta(1);
		conta.setCpfCliente(12398);
		conta.setNomeCliente("Jose Augusto");
		conta.setSaldoConta(1234.56);
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		System.out.println("Teste OK");
		
	}
	
	public void removeContaBancaria() {
		
		int idRemove = 1; // id para ser deletada a conta
		conta = em.find(ContaBancaria.class, idRemove);
		
		if(conta != null) {
			em.getTransaction().begin();
			em.remove(conta);
			em.getTransaction().commit();
			System.out.println("Conta deletado com sucesso");
			
		}
	}
	
	public void findByIdContaBancaria() {
		
		int findId = 1;
		conta = em.find(ContaBancaria.class, findId);
		if (conta == null) {
			System.out.println("Conta: " + findId + ", não encontrada!!!");
			
		} else {
			System.out.println(conta);
		}
	}
	
	public void updateContaBancaria() {
		int idConta = 1; // id para identificar qual objeto sera alterado
		conta = em.find(ContaBancaria.class, idConta);
		
		if (conta != null) {
			conta.setIdConta(1);
			conta.setNomeCliente("Roberto Carlos");
			conta.setCpfCliente(12348765);
			conta.setSaldoConta(1234.88);
			em.getTransaction().begin();
			em.merge(conta);
			em.getTransaction().commit();
			
		} else {
			System.out.println("Conta " + conta.getNomeCliente() + ", não encontrado");
		}
	}
	
	public void createMovimentos() {
		
		movi.setIdCliente(1);
		movi.setTiposMovimentacao("Pix");
		movi.setValor(120.90);
		
		em.getTransaction().begin();
		em.persist(movi);
		em.getTransaction().commit();		
	}
	
	public void deleteMovimentos() {
		
		int idRemove = 1; //id para deletar a movimentação
		movi = em.find(Movimentos.class, idRemove);
		
		if (movi != null) {
			em.getTransaction().begin();
			em.remove(movi);
			em.getTransaction().commit();
			System.out.println("Movimentação deletada com sucesso");
			
		}
		
	}
	
	public void findByIdMovimentos() {
		
		int findId = 1;
		movi = em.find(Movimentos.class, findId);
		if (movi == null) {
			System.out.println("Movimentação: " + findId + ", não encontrada!!!");
			
		} else {
			System.out.println(movi);
		}
	}
	
	public void updateMovimentacao() {
		int idMovimentacao = 1; // id para identificar qual objeto sera alterado
		movi = em.find(Movimentos.class, idMovimentacao);
		
		if (movi != null) {
			movi.setIdCliente(1);
			movi.setTiposMovimentacao("Transferencia");
			movi.setValor(1236.75);
			em.getTransaction().begin();
			em.merge(movi);
			em.getTransaction().commit();
			
		} else {
			System.out.println("Movimentação " + movi.getIdCliente() + ", não encontrado");
		}
	}
}
