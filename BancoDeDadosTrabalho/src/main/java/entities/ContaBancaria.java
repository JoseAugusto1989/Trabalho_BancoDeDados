package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conta_bancaria")
public class ContaBancaria implements Serializable {

	@Id
	@Column(name="id_conta")
	private int idConta;
	
	@Column(name="cpf_cliente")
	private int cpfCliente;
	
	@Column(name="nome_cliente")
	private String nomeCliente;
	
	@Column(name="saldo_conta")
	private Double saldoConta;
	
	
	public ContaBancaria(int idConta, int cpfCliente, String nomeCliente, Double saldoConta) {
		this.idConta = idConta;
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.saldoConta = saldoConta;
	}
	
	public ContaBancaria() {
		
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente (int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(Double saldoConta) {
		this.saldoConta = saldoConta;
	}

	@Override
	public String toString() {
		return " \n******************************************************************"
				+ "\n ContaBancaria \n IdConta: " + idConta + ", \n CPF Cliente: " + cpfCliente + ", \n nome Cliente: " + nomeCliente
				+ ", \n Saldo da Conta=" + saldoConta + " \n"
				+ "****************************************************************** \n";
	}
	
}
