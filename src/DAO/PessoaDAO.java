package DAO;

import Model.Pessoa;

import java.util.List;

public interface PessoaDAO {
    Pessoa saveDb(Pessoa pessoa);
    Pessoa getById(int id);
    Pessoa update(Pessoa entity);
    void deleteById(int id);
    List<Pessoa> findAll();
}
