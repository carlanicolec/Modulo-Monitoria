package Monitoria;

import java.util.Scanner;

public class Monitor {
	private Scanner input;
	private String matricula;
	private String nome;
	private String curso;
	private String materia;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
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
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void AddMonitor(){
		input = new Scanner(System.in);
		boolean v = true;
		//exception
		while(v)
		{
			System.out.println("Nome: ");
			String nome = input.nextLine();
			if(nome != null && !nome.isEmpty())
			{
				setNome(nome);
				break;
			}
			else System.out.println("Digite um nome válido");
			}
			
		while (v)
			{
			System.out.println("Matrícula: ");
			String matricula = input.nextLine();
			if(matricula != null && !matricula.isEmpty())
			{
				setMatricula(matricula);
				break;
			}
			else System.out.println("Digite uma matrícula válida");
			}
		
		while(v)
		{
			System.out.println("Curso: ");
			String curso = input.nextLine();
			if(curso != null && !curso.isEmpty())
			{
				setCurso(curso);
				break;
			}
			else System.out.println("Digite um curso válido");
		}
		while(v)
		{
			System.out.println("Disciplina: ");
			String materia = input.nextLine();
			if(materia != null && !materia.isEmpty())
			{
				setMateria(materia);
				break;
			}
			else System.out.println("Digite uma disciplina válida");		
		}
		
	}
	
}
