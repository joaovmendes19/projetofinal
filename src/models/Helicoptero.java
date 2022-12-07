package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Helicoptero extends Aeronave {

    private String cor;
    private int capacidade;

    public Helicoptero() {

    }

    public Helicoptero(int id, String marca, String modelo, String cor, int capacidade) throws Exception {
        super(id, marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;

    }

    public Helicoptero(String marca, String modelo, String cor, int capacidade) throws Exception {
        super(marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;

    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String toString() {
        return super.toString() + "Cor: " + this.getCor() + ", Capacidade: " + this.getCapacidade();
    }

    public void insert() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement(
                    "INSERT INTO helicoptero (id_helicoptero, marca, modelo, cor, capacidade) VALUES (?, ?, ?, ?, ?);");
            prep.setInt(1, this.getId());
            prep.setString(2, this.getMarca());
            prep.setString(3, this.getModelo());
            prep.setString(4, this.getCor());
            prep.setInt(5, this.getCapacidade());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement(
                    "UPDATE helicoptero SET marca = ?, modelo = ?, cor = ?, capacidade = ? WHERE id_helicoptero = ?;");
            prep.setString(1, this.getMarca());
            prep.setString(2, this.getModelo());
            prep.setString(3, this.getCor());
            prep.setInt(4, this.getCapacidade());
            prep.setInt(5, this.getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void delete() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement("DELETE FROM helicoptero WHERE id_helicoptero = ?;");
            prep.setInt(1, this.getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Pista getById(int id){
        return new Pista();
        }

}
