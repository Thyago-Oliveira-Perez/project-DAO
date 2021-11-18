package Controller;

import DAO.DaoFactory;
import DAO.Implement.PessoaDaoImplement;
import Infra.Database;
import Model.Pessoa;

public class PessoaController {

    public void saveDb(Pessoa pessoa){
        PessoaDaoImplement pessoaDaoImplement = DaoFactory.getPessoaDao();
        pessoaDaoImplement.saveDb(pessoa);
    }

}