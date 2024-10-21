package A3;
import java.util.*;

public class Turma {

	//AtributosDaClasse
	private String nomeTurma;
	private List<Aluno> alunos;
	private Professor professor;
	private Curso curso;
	private Salas sala;
	private String dia;
	
	//ConstrutorDaClasse
	public Turma(List<Aluno> alunos, Professor professor, Curso curso, Salas sala, String dia, String nomeTurma) {
		this.nomeTurma = nomeTurma;
		this.alunos = alunos;
		this.professor = professor;
		this.curso = curso;
		this.sala = sala;
		this.dia = dia;
	}
	
	//AbaixoMetodosGet&setParaObterEAlterarAsInformacoesDosAtributos
	
	public List<Aluno> getQuantidadeAlunos() {
		return alunos;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public String getDiaDaSemana() {
		return dia;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public Salas getSala() {
		return sala;
	}
	
	public String getNome() {
		return nomeTurma;
	}
	
	public void setProfessor(Professor _professor) {
		this.professor = _professor;
	}
	
	public void setDiaDaSemana(String _dia) {
		this.dia = _dia;
	}
	
	public void setCurso(Curso _curso) {
		this.curso = _curso;
	}
	
	public void setSala(Salas _sala) {
		this.sala = _sala;
	}
	
	public void setNomeTurma(String _nomeTurma) {
		this.nomeTurma = _nomeTurma;
	}
	
	public String toString() {
        return "Turma: " + nomeTurma + "\nProfessor: " + professor.getNome() + "\nCurso: " + curso.getNomeCurso() + "\nSala: " + sala.getNome() + "\nDia e horário: " + dia + " 19:00 as 23:00 horas" + "\nAlunos:\n" + alunos;
    }
	
	
}
