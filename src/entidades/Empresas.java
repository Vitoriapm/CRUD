package entidades;

public class Empresas {
	
	private String cnpj;
	private String nome;
	private String endereco;
	private String email;
	
	//construtor
	public Empresas(String cnpj, String nome, String endereco, String email) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}

	//getters e setters
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
