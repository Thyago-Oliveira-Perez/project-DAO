package DAO.Implement;

import DAO.DaoFactory;
import DAO.PessoaDAO;
import Infra.Database;
import Model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PessoaDaoImplement implements PessoaDAO {

    private Connection connect;

    public PessoaDaoImplement(Connection connect) {
        this.connect = connect;
    }

    @Override
    public Pessoa saveDb(Pessoa pessoa) {

        PreparedStatement preparedStatement;
        ResultSet resultSet = null;

            String sql = "INSERT INTO dadospessoas" + "(nomePessoa, emailPessoa, idadePessoa)" + "VALUES (?,?,?)";

        try{

            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, pessoa.getNomePessoa());
            preparedStatement.setString(2, pessoa.getEmailPessoa());
            preparedStatement.setInt(3, pessoa.getIdadePessoa());
            preparedStatement.execute();
            preparedStatement.close();

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public Pessoa getById(int id) {

        return null;
    }

    @Override
    public Pessoa update(Pessoa entity) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Pessoa> findAll() {
        return null;
    }

}
