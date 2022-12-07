package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Jato extends Aeronave {

    private String cor;
    private int velocidade;

    public Jato() {

    }

    public Jato(int id, String marca, String modelo, String cor, int velocidade) throws Exception {
        super(id, marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;
      
    }

    public Jato(String marca, String modelo, String cor, int velocidade) throws Exception {
        super(marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;

      
        }

    

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "cor=" + this.getCor() + "velocidade" + this.getVelocidade();
    }

    public void insert(){
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("INSERT INTO jato (id_jato, marca, modelo, cor, velocidade) VALUES (?, ?, ?, ?, ?);");
            prep.setInt(1, this.getId());
            prep.setString(2, this.getMarca());
            prep.setString(3, this.getModelo());
            prep.setString(4, this.getCor());
            prep.setInt(5, this.getVelocidade());
            prep.execute();
            prep.close();
        } catch (Exception e) {
         System.out.println(e);
        }


    }

    public void update(){
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("UPDATE jato SET marca = ?, modelo = ?, cor = ?, velocidade = ? WHERE id_jato = ?;");
            prep.setString(1, this.getMarca());
            prep.setString(2, this.getModelo());
            prep.setString(3, this.getCor());
            prep.setInt(4, this.getVelocidade());
            prep.setInt(5, this.getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
         System.out.println(e);
        }
    }

    public void delete(){
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM jato WHERE id_jato = ?;");
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
