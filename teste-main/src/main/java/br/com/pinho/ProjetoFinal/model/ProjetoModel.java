package br.com.pinho.ProjetoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class ProjetoModel {

	@NotNull(message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Nome deve conter entre 5 e 254 caracteres")
	private String nome;
	
	private char sexo;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="E-mail deve conter entre 5 e 254 caracteres")
	private String email;
	
	private int telefone;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Endereço deve conter entre 5 e 254 caracteres")
	private String endereco;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Bairro deve conter entre 5 e 254 caracteres")
	private String bairro;
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Cidade deve conter entre 5 e 254 caracteres")
	private String cidade;
	
	private int cep;
	private String uf;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
