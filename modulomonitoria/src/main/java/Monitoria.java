package Monitoria;

import java.util.ArrayList;
import java.util.Scanner;

public class Monitoria {
	
	static ArrayList <Monitor> ListaMonitores = new ArrayList <Monitor>();
	static ArrayList <Materia> ListaMaterias = new ArrayList <Materia>();
	
	private static void ListarMaterias(ArrayList<Materia> listaMaterias2) {
		System.out.println("Disciplinas disponíveis: ");
		for(int i = 0; i < listaMaterias2.size(); i++)
		{
			System.out.println(i + " " +listaMaterias2.get(i).getNome());
		}
	}

	public static void main(String[] args) {
		boolean v = true;
		Scanner input = new Scanner(System.in);
	
	/*	System.out.println("add materia");
		Materia nova = new Materia();
		nova.AddMonitoria();
		ListaMaterias.add(nova);
		
		ListarMaterias(ListaMaterias);
		System.out.println("Indice da materia p/ adicionar um monitor: ");
		
		while(v){
			int s = 0;
			int x = input.nextInt();
			try{				
				ListaMaterias.get(x);
				Monitor novo = new Monitor();
				novo.AddMonitor();
				ListaMaterias.get(x).monitores.add(novo);
			}	catch(java.lang.IndexOutOfBoundsException e){
				System.out.println("Entre com um indice valido");
				s = 1;
			}
			if(s == 0)break;
			}
	*/	
		}
	
		



}
