
import java.util.ArrayList;

public class Monitor {
	private int matricula;
	private String nome;
	private String curso;
	private ArrayList<Materia> materias_monitoradas = new ArrayList<Materia>();

	public Monitor(int matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public Monitor() {
	}

	public void addMateria(Materia materia){
		materias_monitoradas.add(materia);
	}


	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

}
