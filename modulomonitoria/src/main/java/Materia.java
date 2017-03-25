
import java.util.ArrayList;

public class Materia {

	private String nome;
	private String professor;
	private String curso;
	private String turno;
	private int id_materia;
	private String carga_horaria;
    private ArrayList<Monitoria> monitorias = new ArrayList<Monitoria>();

	public Materia(String nome, String professor) {
		this.nome = nome;
		this.professor = professor;
	}

	public Materia() {
	}

    public Materia(String nome, String professor, String curso, String turno, int id_materia, String carga_horaria) {
        this.nome = nome;
        this.professor = professor;
        this.curso = curso;
        this.turno = turno;
        this.id_materia = id_materia;
        this.carga_horaria = carga_horaria;
    }

    public void addMonitoria(Monitoria monitoria){
	    monitorias.add(monitoria);
    }

	public void printMateria(){
		System.out.println("Materia: " + this.nome);
		System.out.println("Professor: " + this.professor);
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(String carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
}
