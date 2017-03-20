import java.util.ArrayList;
import java.util.Date;

public class Monitoria {


	private int id_monitoria;
	private String sala;
	private Materia materia = new Materia();
	private ArrayList<Monitor> monitores = new ArrayList<Monitor>();
	private Date data;
	private String hora;

    public Monitoria() {
    }

    public Monitoria(int id_monitoria, String sala) {
        this.id_monitoria = id_monitoria;
        this.sala = sala;
    }

    void addMonitor(Monitor monitor){
		this.monitores.add(monitor);
	}

	void addMateria(Materia materia){
        this.materia = materia;

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
