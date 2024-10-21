package A3;

public class Pessoa {

	//AtributosDaClasse
	protected String nomeCompleto;
	protected String cpf;
	protected String endereco;
	protected String email;
	protected String telefone;
	
	//ConstrutoresDaClasse
	public Pessoa(String nomeC, String cpf, String endereco, String email, String telefone) {
		this.nomeCompleto = nomeC;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome) {
    	this.nomeCompleto = nome;
    }
	
	//AbaixoMetodosGet&setParaObterEAlterarAsInformacoesDosAtributos
	public String getNome() {
		return nomeCompleto;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setNome(String nomeC) {
		this.nomeCompleto = nomeC;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//MétodoSobrescrito
	public String toString() {
        return "Nome: " + nomeCompleto + ", Cpf: " + cpf + ", Endereço: " + endereco + ", E-mail: " + email + ", Telefone: " + telefone;
    }
	
}
