import java.util.ArrayList;
import java.util.Date;

public class Monitoria {

	private int id_monitoria;
	private String sala;
	private Materia materia = new Materia();
	private ArrayList<Monitor> monitores = new ArrayList<Monitor>();
	private Date data_inicio;
	private Date data_fim;
	private String hora;

    public Monitoria() {
    }

    public Monitoria(int id_monitoria, Date data_inicio) {
        this.id_monitoria = id_monitoria;
        this.data_inicio = data_inicio;
    }

    public void addMonitor(Monitor monitor){
		this.monitores.add(monitor);
	}

	public void addMateria(Materia materia){
        this.materia = materia;
	}

	public void printMonitoria(){
		System.out.println("ID: " + this.id_monitoria);
		System.out.println("Matéria: " + this.materia.getNome());
        System.out.println("Professor: " + this.materia.getProfessor());
        System.out.println("Curso" + this.materia.getCurso());
        System.out.println("Data inicio: "+ this.data_inicio);
        System.out.println("Data fim: "+ this.data_fim);
    }

	public int getId_monitoria() {
		return id_monitoria;
	}

	public void setId_monitoria(int id_monitoria) {
		this.id_monitoria = id_monitoria;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
}
