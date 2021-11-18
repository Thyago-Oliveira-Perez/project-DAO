package View;

import Controller.PessoaController;
import Model.Pessoa;

import java.util.Scanner;

public class PessoaView {

    Scanner entrada = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();
    PessoaController pessoaController = new PessoaController();

    public void cadastroPessoa(){
        System.out.println("Nome: ");
        pessoa.setNomePessoa(entrada.next());
        System.out.println("Email: ");
        pessoa.setEmailPessoa(entrada.next());
        System.out.println("Idade: ");
        pessoa.setIdadePessoa(entrada.nextInt());

        pessoaController.saveDb(pessoa);
    }

}
