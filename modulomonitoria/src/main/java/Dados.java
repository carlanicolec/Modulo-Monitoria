import java.util.ArrayList;


public class Dados {

    public static ArrayList<Monitor> ListaMonitores = new ArrayList<Monitor>();
    public static ArrayList<Monitoria> ListaMonitorias = new ArrayList<Monitoria>();
    public static ArrayList<Materia> ListaMaterias = new ArrayList<Materia>();

    public void addMonitor(Monitor monitor) {
        this.ListaMonitores.add(monitor);
    }

    public void addMonitoria(Monitoria monitoria){
        this.ListaMonitorias.add(monitoria);
    }

    public void addMateria(Materia materia){
        this.ListaMaterias.add(materia);
    }




}

