package av2_3pob;
import java.util.*;
import java.text.*;

public class Cliente {
	
	private int id;
	private String nome;
	private String endereco;
	private String postalCode;
	private String pais;
	private String cpf;
	private String passaporte;
	private String email;
	private Date dataNascimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Cliente(int id, String nome, String endereco, String postalCode, String pais, String cpf, String passaporte,
			String email, Date dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.postalCode = postalCode;
		this.pais = pais;
		this.cpf = cpf;
		this.passaporte = passaporte;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Id=" + id + "\nNome=" + nome + "\nEndereço=" + endereco + "\nCódigo Postal=" + postalCode
				+ "\nPais=" + pais + "\nCPF=" + cpf + "\nPassaporte=" + passaporte + "\nEmail=" + email
				+ "\nData de Nascimento=" + sdf.format(dataNascimento);
	}

}
