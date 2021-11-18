package View;

import Controller.PessoaController;
import Model.Pessoa;

import java.util.Scanner;

public class MenusView {

    Pessoa pessoa = new Pessoa();
    PessoaView pessoaView = new PessoaView();
    Scanner entrada = new Scanner(System.in);

    public void menus(){

        System.out.println("-----------------");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Deletar");
        System.out.println("3 - Editar");
        System.out.println("4 - Mostrar");
        System.out.println("0 - Sair");
        System.out.println("-----------------");
        String escolha = entrada.next();
        if(isNumeric(escolha)){
            switch (Integer.parseInt(escolha)){

                case 1:
                    pessoaView.cadastroPessoa();
                    menus();
                    break;
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
