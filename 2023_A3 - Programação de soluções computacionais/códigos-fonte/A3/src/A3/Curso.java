package A3;

public class Curso {

	//AtributosDaClasse
	private String nomeCurso;
	private int codigoCurso;
	private int cargaHoraria;
	private String descCurso;
	
	//ConstrutoresDaClasse
	public Curso(String nomeC, int codeC, int cargaH, String descC) {
		this.nomeCurso = nomeC;
		this.codigoCurso = codeC;
		this.cargaHoraria = cargaH;
		this.descCurso = descC;
	}
	
	public Curso(String nome) {
		this.nomeCurso = nome;
	}
	
	//AbaixoMetodosGet&setParaObterEAlterarAsInformacoesDosAtributos
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public int getCodigoCurso() {
		return codigoCurso;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public String getDescricaoCurso() {
		return descCurso;
	}
	
	public void setNomeCurso(String _nomeC) {
		this.nomeCurso = _nomeC;
	}
	
	public void setCodigoCurso(int _codigoC) {
		this.codigoCurso = _codigoC;
	}
	
	public void setCargaHoraria(int _cargaH) {
		this.cargaHoraria = _cargaH;
	}
	
	public void setDescricaoCurso(String _descC) {
		this.descCurso = _descC;
	}
	
	//MétodoSobrescrito
	public String toString() {
        return "Nome do Curso: " + nomeCurso + ", Código do Curso: " + codigoCurso + ", Carga Horária: " + cargaHoraria + "horas" +", Descrição do Curso: " + descCurso;
    }

}
