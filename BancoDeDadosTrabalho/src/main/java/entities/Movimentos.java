package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movimentos")
public class Movimentos implements Serializable {
	
	@Id
	@Column(name="id_cliente")
	private int idCliente;
	
	@Column(name="tipos_movimentacao")
	private String tiposMovimentacao;
	
	@Column(name="valor")
	private Double valor;
	
	
	public Movimentos(int idCliente, String tiposMovimentacao, Double valor) {
		super();
		this.idCliente = idCliente;
		this.tiposMovimentacao = tiposMovimentacao;
		this.valor = valor;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getTiposMovimentacao() {
		return tiposMovimentacao;
	}

	public void setTiposMovimentacao(String tiposMovimentacao) {
		this.tiposMovimentacao = tiposMovimentacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Movimentos [idCliente=" + idCliente + ", tiposMovimentacao=" + tiposMovimentacao + ", valor=" + valor
				+ "]";
	}

}
