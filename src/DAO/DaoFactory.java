package DAO;

import DAO.Implement.PessoaDaoImplement;
import Infra.Database;

public class DaoFactory {
    public static PessoaDaoImplement getPessoaDao(){
        return new PessoaDaoImplement(Database.getConnection());
    }
}
