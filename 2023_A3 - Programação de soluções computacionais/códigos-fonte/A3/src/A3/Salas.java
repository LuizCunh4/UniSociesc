package A3;

public class Salas { 
	
	//AtributosDaClasse
	private String nome;
	private String local;
	
	//ConstrutoresDaClasse
	public Salas(String nomeSala, String localSala) {
		this.nome = nomeSala;
		this.local = localSala;
	}
	
	public Salas(String nome) {
		this.nome = nome;
	}
	
	//AbaixoMetodosGet&setParaObterEAlterarAsInformacoesDosAtributos
	public String getNome() {
		return nome;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setNome(String _nomeSala) {
		this.nome = _nomeSala;
	}
	
	public void setLocal(String _localSala) {
		this.local = _localSala;
	}
	
	//MétodoSobrescrito
	public String toString() {
        return "Nome da Sala: " + nome + ", Local: " + local;
    }

}