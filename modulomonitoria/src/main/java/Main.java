import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dados dados = new Dados();
        int opcao = 555;
        Scanner scan = new Scanner(System.in);
        Funcionalidades funcionalidade = new Funcionalidades();
        while (opcao != 0) {
            System.out.println("1 - criar materia\n" +
                    "2 - criar monitoria\n" +
                    "3 - editar monitoria\n" +
                    "4 - gerar certificado do aluno\n"+
                    "5 - listar materias\n"+
                    "6 - listar monitorias\n"+
                    "7 - listar monitores");
            opcao = Integer.parseInt(scan.nextLine());

            if (opcao == 1){
                funcionalidade.criarMateria(dados);
            }
            else if (opcao == 2) {
                funcionalidade.criarMonitoria(dados);
            } else if (opcao == 3) {
                funcionalidade.editarMonitoria(dados);
            } else if (opcao == 4) {
                funcionalidade.gerarCertificado(dados);
            }else if (opcao == 5){
                dados.printMaterias();
            }else if (opcao == 6){
                dados.printMonitorias();
            }else if (opcao == 7){
                dados.printMonitores();
            }
        }
    }
}