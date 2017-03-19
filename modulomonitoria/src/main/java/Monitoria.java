import java.util.ArrayList;
import java.util.Date;

public class Monitoria {


	private int id_monitoria;
	private Materia materia = new Materia();
	private ArrayList<Monitor> monitores = new ArrayList<Monitor>();
	private Date data;
	private String hora;

	void addMonitor(Monitor monitor){
		this.monitores.add(monitor);
	}
	void addMateria(String nome, String professor){
		materia.setNome(nome);
		materia.setProfessor(professor);
	}

	public Materia getMateria() {
		return materia;
	}
	public int getId_monitoria() {
		return id_monitoria;
	}

	public void setId_monitoria(int id_monitoria) {
		this.id_monitoria = id_monitoria;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
}
