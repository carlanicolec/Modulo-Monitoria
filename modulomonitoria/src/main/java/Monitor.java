
public class Monitor {
	private int matricula;
	private String nome;
	private String curso;
	private Monitoria monitoria = new Monitoria();

	public Monitor(int matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public Monitor() {
	}


	public void printMonitor(){
		System.out.println("Monitor: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
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


	public Monitoria getMonitoria() {
		return monitoria;
	}

	public void setMonitoria(Monitoria monitoria) {
		this.monitoria = monitoria;
	}
}


