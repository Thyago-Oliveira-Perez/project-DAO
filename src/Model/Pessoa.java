package Model;

public class Pessoa {

    private String nomePessoa;
    private String emailPessoa;
    private int idadePessoa;

    public Pessoa() {
    }

    public Pessoa(String nomePessoa, String emailPessoa, int idadePessoa) {
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.idadePessoa = idadePessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", emailPessoa='" + emailPessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }
}
