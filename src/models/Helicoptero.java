package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Helicoptero extends Aeronave{

    private String cor;
    private int capacidade;

    public Helicoptero(){

    }
    public Helicoptero(int id,String marca, String modelo, String cor, int capacidade) throws Exception {
        super( id, marca,  modelo);
        this.cor=cor;
        this.capacidade=capacidade;

        PreparedStatement prep  = DAO.createConnection().prepareStatement("INSERT INTO helicoptero (id_helicoptero, marca, modelo, cor, capacidade) VALUES (?, ?, ?, ?, ?);");
        prep.setInt(1, id);
        prep.setString(2, marca);
        prep.setString(3, modelo);
        prep.setString(4, cor);
        prep.setInt(5, capacidade);
        prep.execute();
        prep.close();
    }
    public Helicoptero(String marca, String modelo, String cor, int capacidade){
        super( marca,  modelo);
        this.cor=cor;
        this.capacidade=capacidade;

    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor=cor;
    }
    public int getCapacidade(){
        return this.capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade=capacidade;
    }
    public String toString() {
        return super.toString() + "Cor: " + this.getCor() + ", Capacidade: " + this.getCapacidade();
    }
     

}
