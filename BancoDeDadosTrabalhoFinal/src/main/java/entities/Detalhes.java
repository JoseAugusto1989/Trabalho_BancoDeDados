package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalhes")
public class Detalhes {
	
	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;
	
	@Column(name="nome_usuario")
	private String nomeUsuario;
	
	@Column(name="cpf_usuario")
	private String cpfUsuario;
	
	@Column(name="telefone_usuario")
	private String telefone;
	
	@OneToOne
	@JoinColumn(name="conta_fk")
	@Column(name="conta_fk1")
	private Conta contaFk;
	
	public Detalhes() {
		
	}

	public Detalhes(long idUsuario, String nomeUsuario, String cpfUsuario, String telefone, Conta contaFk) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.cpfUsuario = cpfUsuario;
		this.telefone = telefone;
		this.contaFk = contaFk;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Conta getContaFk() {
		return contaFk;
	}

	public void setConta_fk(Conta contaFk) {
		this.contaFk = contaFk;
	}

	@Override
	public String toString() {
		return "Detalhes [idUsuario=" + idUsuario + ", nomeUsuario=" + nomeUsuario + ", cpfUsuario=" + cpfUsuario
				+ ", telefone=" + telefone + ", conta_fk=" + contaFk + "]";
	}

}
