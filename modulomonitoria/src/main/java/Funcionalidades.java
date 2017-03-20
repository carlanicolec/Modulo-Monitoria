import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Funcionalidades extends Exception {
    Scanner scan = new Scanner(System.in);
    boolean done;
    int i;

    public void criarMonitoria(Dados dados) {
        done = false;
        int id = 0;
        System.out.println("Insira o nome da materia: ");
        String materia = scan.nextLine();
        System.out.println("Insira o nome do professor: ");
        String professor = scan.nextLine();
        System.out.println("Insira a sala : ");
        String sala = scan.nextLine();

        do {
            try {
                System.out.println("Insira o ID da monitoria");
                id = Integer.parseInt(scan.nextLine());
                done = true;
            } catch (NumberFormatException e) {
                System.out.println("Insira um numero inteiro\n");

            }
        } while (!done);

        Monitoria monitoria = new Monitoria(id, sala);
        Materia nova_materia = new Materia(materia, professor);

        monitoria.addMateria(nova_materia); //salvando materia em monitoria

        dados.ListaMaterias.add(nova_materia); // salvando materia no BD
        dados.ListaMonitorias.add(monitoria);

    }

    public void editarMonitoria(Dados dados) {
        done = false;
        int opcao = 0;
        int id = 0;
        Monitoria monitoria_temp = null;
        do {
            try {
                System.out.println("Insira o ID da monitoria que deseja editar :"); // id desejado
                id = Integer.parseInt(scan.nextLine());
                done = true;
            } catch (NumberFormatException e) {
                System.out.println("Insira um número inteiro\n");
            }
        } while (!done);

        for (i = 0; i < dados.ListaMonitorias.size(); i++) {
            if (dados.ListaMonitorias.get(i).getId_monitoria() == id) { //salvando em uma variavel temporaria a monitoria q se dejesa editar
                monitoria_temp = dados.ListaMonitorias.get(i);
            } else {
                System.out.println("O ID inserido nao existe :");
            }
        }

        done = false;
        do {
            try {
                System.out.println("Insira a opção desejada\n" +
                        "1 - Adicionar monitor\n" +
                        "2 - Adicionar horario da monitoria");
                opcao = Integer.parseInt(scan.nextLine());
                if (opcao < 1 || opcao > 2) throw new IntegerOutOfRangeException();
                done = true;
            } catch (IntegerOutOfRangeException e) {
                System.out.println("Insira o número 1 ou o número 2\n");
            } catch (NumberFormatException e) {
                System.out.println("Insira um número inteiro\n");

            }
        } while (!done);

        if (opcao == 1) {
            addMonitor(dados, monitoria_temp);
        } else if (opcao == 2) {
            addDataHora(dados, monitoria_temp);
        }
    }


    public void addMonitor(Dados dados, Monitoria monitoria) {
        System.out.println("Insira o nome do monitor :");
        String nome = scan.nextLine();
        System.out.println("Insira a matricula do monitor :");
        int matricula = Integer.parseInt(scan.nextLine());
        System.out.println("Insira o curso :");
        String curso = scan.nextLine();

        Monitor monitor = new Monitor(matricula, nome, curso);
        monitoria.addMonitor(monitor); //add monitor à monitoria
        monitor.addMateria(monitoria.getMateria()); // add a materia ao monitor
        dados.ListaMonitores.add(monitor); // add monitor no BD
    }





    public void addDataHora(Dados dados, Monitoria monitoria){
        Date data = null;
        done = false;
        do {
            System.out.println("Insira a data da monitoria :");
            String data_inicio = scan.nextLine();
            try{
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
                data = new java.sql.Date(format.parse(data_inicio).getTime());
                done = true;
            }catch (Exception e) {
                System.out.println("Insira uma data no formato dd/mm/aa \n");
            }
        }while (!done);

        System.out.println("Insira a hora da monitoria :");
        String hora = scan.nextLine();

        monitoria.setData(data);
        monitoria.setHora(hora);
    }

}
