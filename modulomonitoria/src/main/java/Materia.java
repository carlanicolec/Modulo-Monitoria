package Monitoria;

import java.util.ArrayList;
import java.util.Scanner;

public class Materia {
	private Scanner input;
	private String nome;
	private String professor;
	public ArrayList <Monitor> monitores = new ArrayList<Monitor>();
	
	//salas datas e horarios
	
	
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
	public ArrayList<Monitor> getMonitores() {
		return monitores;
	}
	public void setMonitores(Monitor novo) {		//Checar
		this.monitores.add(novo);
	}
	
	
	
	public void AddMonitoria()
	{		//Checar
		input = new Scanner(System.in);
		boolean v = true;
		while(v)
		{
			System.out.println("Disciplina: ");
			String nome = input.nextLine();
			if(nome != null && !nome.isEmpty())
			{
				setNome(nome);
				break;
			}
			else System.out.println("Nome inválido");
		}
		while(v)
		{
			System.out.println("Professor: ");
			String professor = input.nextLine();
			if(professor != null && !professor.isEmpty())
			{
				setProfessor(professor);
				break;
			}		
		}		
	}
	
	public void Add_Monitor(ArrayList <Monitor> monitor){
		input = new Scanner(System.in);
		boolean v = true;
		while(v){
			System.out.println("Nome do monitor: ");
			String nome = input.nextLine();
			if(monitor.contains(nome))
			{
				int x = monitor.indexOf(nome);
				setMonitores(monitor.get(x));
				System.out.println(nome + " adicionado.");
			}
			else System.out.println("Nome inválido");
		}
		
	}
	
	public void RemoveMonitor(){
		input = new Scanner(System.in);
		boolean v = true;
		while(v){
			System.out.println("Nome do monitor: ");
			String nome = input.nextLine();
			if(this.monitores.contains(nome))
			{
				this.monitores.remove(nome);
				System.out.println(nome + " removido");
			}
			else System.out.println("Nome inválido");
		}
	}
}
