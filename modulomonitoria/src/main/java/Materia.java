
import javax.management.monitor.Monitor;
import java.util.ArrayList;

public class Materia {



	private String nome;
	private String professor;
	private ArrayList<Monitor> monitores = new ArrayList<Monitor>();

	public Materia(String nome, String professor) {
		this.nome = nome;
		this.professor = professor;
	}

	public Materia() {
	}

	public void addMonitor(Monitor monitor){
		monitores.add(monitor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
