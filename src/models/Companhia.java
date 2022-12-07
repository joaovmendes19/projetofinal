package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Companhia {
    private int id;
    private String nome;
    private String cnpj;

    public Companhia() {

    }

    public Companhia(int id, String nome, String cnpj) throws Exception {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;

        PreparedStatement prep = DAO.createConnection()
                .prepareStatement("INSERT INTO companhia (id_companhia, nome, cnpj) VALUES (?, ?, ?);");
        prep.setInt(1, id);
        prep.setString(2, nome);
        prep.setString(3, cnpj);
        prep.execute();
        prep.close();
    }

    public Companhia(String nome, String cnpj) throws Exception {
        this.nome = nome;
        this.cnpj = cnpj;

        PreparedStatement prep = DAO.createConnection()
                .prepareStatement("INSERT INTO companhia (nome, cnpj) VALUES (?, ?);");
        {
            prep.setString(1, nome);
            prep.setString(2, cnpj);
            prep.execute();
            prep.close();

        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Companhia comp = (Companhia) obj;
        return comp.getId() == this.getId();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "CNPJ: " + cnpj;

    }

    public void insert() throws Exception {
        PreparedStatement prep = DAO.createConnection()
                .prepareStatement("INSERT INTO companhia (nome, cnpj) VALUES (?, ?);");
        {
            prep.setString(1, getNome());
            prep.setString(2, getCnpj());
            prep.execute();
            prep.close();
        }
    }

    public void update() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement("INSERT INTO companhia nome = ? cnpj = ?  WHERE id = ?;");
            {
                prep.setString(1, getNome());
                prep.setString(2, getCnpj());
                prep.setInt(3, getId());
                prep.execute();
                prep.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void delete(int id) {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM companhia WHERE id = ?;");
            {
                prep.setInt(1, id);
                prep.execute();
                prep.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Pista getById(int id){
        return new Pista();
        }
}
