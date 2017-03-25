import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Funcionalidades extends Exception {
    Scanner scan = new Scanner(System.in);
    boolean done;
    int i;

    public void criarMateria(Dados dados) {

        System.out.println("Insira o nome da matéria");
        String nome = scan.nextLine();
        System.out.println("Insira o professor responsável");
        String professor = scan.nextLine();
        System.out.println("Insira o curso");
        String curso = scan.nextLine();
        System.out.println("Insira o turno");
        String turno = scan.nextLine();
        System.out.println("Insira a carga horária");
        String carga = scan.nextLine();
        int id = 0;
        done = false;
        do {
            try {
                System.out.println("Insira o Id da materia:");
                id = Integer.parseInt(scan.nextLine());
                for (int i =0; i<dados.ListaMaterias.size();i++){
                    if (dados.ListaMaterias.get(i).getId_materia() == id) throw new ExistingID();
                }
                done = true;
            }catch (ExistingID e){
                System.out.println(e);
                System.out.println("o ID informado já é atrelado a outra matéria\n");
            }catch (NumberFormatException e){
                System.out.println(e);
                System.out.println("Insira um número inteiro\n");
            }
        }while (!done);
        Materia materia = new Materia(nome,professor,curso,turno,id,carga);
        dados.ListaMaterias.add(materia);

    }

    public void criarMonitoria(Dados dados) {
        done = false;
        int id_monitoria = 0;
        int id_materia = 0;
        int index_materia = 0;
        Materia materia_temp = new Materia();

        do {
            try {
                System.out.println("Informe o Id da materia:\n");
                id_materia = Integer.parseInt(scan.nextLine());
                int count = 0;
                for (index_materia = 0; index_materia<dados.ListaMaterias.size(); index_materia++) {
                    if (dados.ListaMaterias.get(index_materia).getId_materia() != id_materia) {
                        count++;
                    }
                    if (count == dados.ListaMaterias.size()) {//se o count for igual ao size é pq percorreu todo o arraylist e não encontrou o id
                        throw new EmptyID();
                    }
                }
                done = true;
            }catch (EmptyID e){
                System.out.println(e);
                System.out.println("Insira o ID de uma matéria existente\n");
            }catch (NumberFormatException e){
                System.out.println(e);
                System.out.println("Insira um número inteiro\n");
            }
        }while (!done);
        done = false;
        do {
            try {
                System.out.println("Crie o ID da monitoria");
                id_monitoria = Integer.parseInt(scan.nextLine());
                for (int i = 0; i< dados.ListaMonitorias.size(); i++){
                    if (dados.ListaMonitorias.get(i).getId_monitoria() == id_monitoria) throw new ExistingID();
                }
                done = true;
            } catch (NumberFormatException e) {
                System.out.println("Insira um numero inteiro\n");
            }catch (IndexOutOfBoundsException e){
                System.out.println(e);
            }catch (ExistingID e){
                System.out.println("ID já atrelado a outra monitoria. Insira um ID novo.");
            }
        } while (!done);
        java.sql.Date data = null;
        done = false;
        String data_inicio = null;
        do {
            System.out.println("Insira a data de inicio da monitoria:");
            data_inicio = scan.nextLine();
            try{
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
                data = new java.sql.Date(format.parse(data_inicio).getTime());
                done = true;
            }catch (Exception e) {
                System.out.println("Insira uma data no formato dd/mm/aa \n");
            }
        }while (!done);

        Monitoria monitoria = new Monitoria(id_monitoria, data);
        dados.ListaMaterias.get(index_materia-1).addMonitoria(monitoria);
        monitoria.addMateria(dados.ListaMaterias.get(index_materia-1)); //salvando materia em monitoria
        dados.ListaMonitorias.add(monitoria);

    }

    public void editarMonitoria(Dados dados) {
        done = false;
        int opcao = 0;
        int id = 0;
        int index_monitoria = 0;
        do {
            try {
                System.out.println("Informe o Id da monitoria:\n");
                id = Integer.parseInt(scan.nextLine());
                int count = 0;
                for (index_monitoria = 0; index_monitoria<dados.ListaMonitorias.size(); index_monitoria++){
                    if (dados.ListaMonitorias.get(index_monitoria).getId_monitoria() != id){
                        count++;
                    }
                    if (count == dados.ListaMonitorias.size()){//se o count for igual ao size é pq percorreu todo o arraylist e não encontrou o id
                        throw new EmptyID();
                    }
                }
                done = true;
            }catch (EmptyID e){
                System.out.println(e);
                System.out.println("Insira o ID de uma monitoria existente\n");
            }catch (NumberFormatException e){
                System.out.println(e);
                System.out.println("Insira um número inteiro\n");
            }
        }while (!done);
        done = false;

        do {
            try {
                System.out.println("Escolha a opção desejada:\n" +
                        "1 - Adicionar monitor\n" +
                        "2 - Adicionar data\n" +
                        "3 - Alterar sala");

                opcao = Integer.parseInt(scan.nextLine());
                if (opcao < 1 || opcao > 3) throw new IntegerOutOfRangeException();
                done = true;
            }catch (IntegerOutOfRangeException e){
                System.out.println(e);
                System.out.println("Insira um número de 1 a 3");
            }catch (NumberFormatException e){
                System.out.println(e);
                System.out.println("Insira um número inteiro\n");

            }
        }while (!done);
        done = false;

        if (opcao == 1) {
            Monitor monitor = new Monitor();
            monitor = addMonitor(dados);
            monitor.setMonitoria(dados.ListaMonitorias.get(index_monitoria-1));
            dados.ListaMonitorias.get(index_monitoria-1).addMonitor(monitor);

        } else if (opcao == 2) {
            java.sql.Date data = null;
            done = false;
            do {
                System.out.println("Insira a data de término da monitoria:");
                String data_termino = scan.nextLine();
                try{
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
                    data = new java.sql.Date(format.parse(data_termino).getTime());
                    done = true;
                }catch (Exception e) {
                    System.out.println("Insira uma data no formato dd/mm/aa \n");
                }
            }while (!done);
            dados.ListaMonitorias.get(index_monitoria-1).setData_fim(data);
        }
        else if (opcao == 3){
            System.out.println("Insira a sala para a monitoria");
            String sala = scan.nextLine();
            dados.ListaMonitorias.get(index_monitoria-1).setSala(sala);

        }
    }

    public Monitor addMonitor(Dados dados) {
        System.out.println("Insira o nome do monitor :");
        String nome = scan.nextLine();
        done = false;
        int matricula= 0;
        do {
            try{
                System.out.println("Insira a matricula do monitor :");
                matricula = Integer.parseInt(scan.nextLine());
                for(int i = 0; i<dados.ListaMonitores.size();i++){
                    if (dados.ListaMonitores.get(i).getMatricula() == matricula) throw new ExistingID();
                }
                done = true;
            }catch (NumberFormatException e){
                System.out.println("Insira um número inteiro");
            }catch (ExistingID e){
                System.out.println("Essa matricula é de outro monitor. Insira uma matricula nova");
            }

        }while (!done);

        System.out.println("Insira o curso :");
        String curso = scan.nextLine();

        Monitor monitor = new Monitor(matricula, nome, curso);
        dados.ListaMonitores.add(monitor); // add monitor no BD
        return monitor;
    }

    public void gerarCertificado(Dados dados){
       done = false;
       int matricula = 0;
       do {
           try{
               System.out.println("Insira a matrícula do aluno");
               matricula = Integer.parseInt(scan.nextLine());
               done = true;
           }catch (NumberFormatException e){
               System.out.println("Insira um número inteiro");
           }

       }while (!done);

      for (int i = 0; i < dados.ListaMonitores.size(); i++){
          if (dados.ListaMonitores.get(i).getMatricula() == matricula) {
              Monitor monitor_temp = new Monitor();
              monitor_temp = dados.ListaMonitores.get(i);
              if (dados.ListaMonitores.get(i).getMonitoria().getData_fim() != null) {
                  Monitoria monitoria_temp = new Monitoria();
                  monitoria_temp = dados.ListaMonitores.get(i).getMonitoria();
                  System.out.println("----- Certificado de monitoria -----");
                  System.out.println("Nome: " + monitor_temp.getNome());
                  System.out.println("Matrícula: " + monitor_temp.getMatricula());
                  System.out.println("Curso: " + monitor_temp.getCurso());
                  System.out.println("Matéria" + monitoria_temp.getMateria().getNome());
                  System.out.println("Início da monitoria" + monitoria_temp.getData_inicio());
                  System.out.println("Fim da monitoria" + monitoria_temp.getData_fim());
                  System.out.println("--------------------------");
              }else{
                  System.out.println("A monitoria não terminou. O certificado só é gerado após o término da monitoria");
              }
          }
      }
    }

    public void ListarMonitorias(Dados dados) {
        for (int i = 0; i < dados.ListaMonitorias.size(); i++) {
            dados.ListaMonitorias.get(i).printMonitoria();
        }
    }

    public void ListarMonitores(Dados dados){
        for (int i = 0; i < dados.ListaMonitores.size(); i++){
            dados.ListaMonitores.get(i).printMonitor();
        }
    }

    public void ListarMaterias(Dados dados){
        for (int i = 0; i < dados.ListaMaterias.size(); i++){
            dados.ListaMaterias.get(i).printMateria();
        }
    }


}
