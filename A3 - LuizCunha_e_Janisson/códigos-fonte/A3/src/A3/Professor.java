package A3;

import A3.Pessoa; //ImportandoAClassePessoa
public class Professor extends Pessoa { //UtizandoHenranca

	//AtributosDaClasse
	private String codigoFuncionario;
	
	//ConstrutoresDaClasse	
	public Professor(String nomeC, String cpf, String endereco, String email, String telefone, String codigoFuncionario) {
		super(nomeC, cpf, endereco, email, telefone);
		this.codigoFuncionario = codigoFuncionario;
	}

	public Professor(String nome) {
    	super(nome);
    }
	
	//AbaixoMetodosGet&setParaObterEAlterarAsInformacoesDosAtributos
	public String getCodigoFuncionario() {
		return codigoFuncionario;
	}
		
	public void setCodigoFuncionario(String codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	//MétodoSobrescrito
	public String toString() {
        return "Nome: " + nomeCompleto + ", Cpf: " + cpf + ", Endereço: " + endereco + ", E-mail: " + email + ", Telefone: " + telefone + ", Código do Funcionário: " + codigoFuncionario;
    }
			
}