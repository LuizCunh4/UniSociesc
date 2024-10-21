package A3;

import A3.Pessoa; //ImportandoAClassePessoa
public class Aluno extends Pessoa { //UtilizacaoHeranca

	//AtributosDaClasse
	private int matricula;
	
	//ConstrutoresDaClasse
    public Aluno(String nomeC, String cpf, String endereco, String email, String telefone, int matricula) {
		super(nomeC, cpf, endereco, email, telefone);
		this.matricula = matricula;
	}
    
    public Aluno(String nome) {
    	super(nome);
    }
	
    //AbaixoMetodosGet&setParaObterEAlterarAsInformacoesDosAtributos
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	//MétodoSobrescrito
	public String toString() {
        return "\nNome: " + nomeCompleto + ", Cpf: " + cpf + ", Endereço: " + endereco + ", E-mail: " + email + ", Telefone: " + telefone + ", Matrícula: " + matricula;
    }
	
}