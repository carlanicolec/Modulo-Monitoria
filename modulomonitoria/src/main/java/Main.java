import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dados dados = new Dados();

        Scanner scan = new Scanner(System.in);
        Funcionalidades funcionalidade = new Funcionalidades();

        System.out.println("1 - criar monitoria\n 2- editar monitoria");
        int opcao = Integer.parseInt(scan.nextLine());

        if (opcao == 1){
            funcionalidade.criarMonitoria(dados);
        }
        else if (opcao == 2){
            funcionalidade.editarMonitoria(dados);
        }
    }
}
