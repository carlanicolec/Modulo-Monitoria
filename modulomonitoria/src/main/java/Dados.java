import java.util.ArrayList;


public class Dados {

    public ArrayList<Monitor> ListaMonitores = new ArrayList<Monitor>();
    public ArrayList<Monitoria> ListaMonitorias = new ArrayList<Monitoria>();
    public ArrayList<Materia> ListaMaterias = new ArrayList<Materia>();

    public void addMonitor(Monitor monitor) {
        this.ListaMonitores.add(monitor);
    }

    public void addMonitoria(Monitoria monitoria){
        this.ListaMonitorias.add(monitoria);
    }

    public void addMateria(Materia materia){
        this.ListaMaterias.add(materia);
    }

    public void printMonitores(){
        for(int i = 0; i < ListaMonitores.size(); i++){
            System.out.println("Nome do monitor: "+ListaMonitores.get(i).getNome());
            System.out.println("Matricula do monitor: "+ListaMonitores.get(i).getMatricula());
        }
    }

    public void printMonitorias(){
        for(int i = 0; i < ListaMonitorias.size(); i++){
            System.out.println("Id da monitoria: "+ListaMonitorias.get(i).getId_monitoria());
            System.out.println("Matéria: "+ListaMonitorias.get(i).getMateria().getNome());
        }
    }

    public void printMaterias(){
        for(int i = 0; i < ListaMaterias.size(); i++){
            System.out.println("Nome da matéria: " +ListaMaterias.get(i).getNome());
            System.out.println("Professor: "+ ListaMaterias.get(i).getProfessor());
        }
    }


}

