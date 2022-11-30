package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Jato extends Aeronave{

    private String cor;
    private int velocidade;

    public Jato(){

    }
    public Jato(int id,String marca, String modelo, String cor, int velocidade) throws Exception{
        super( id, marca,  modelo);
        this.cor=cor;
        this.velocidade=velocidade;
        PreparedStatement prep = DAO.createConnection().prepareStatement("INSERT INTO jato (id_jato, marca, modelo, cor, velocidade) VALUES (?, ?, ?, ?, ?);");
        prep.setInt(1, id);
        prep.setString(2, marca);
        prep.setString(3, modelo);
        prep.setString(4, cor);
        prep.setInt(5, velocidade);
        prep.execute();
        prep.close();
    }
    public Jato(String marca, String modelo, String cor, int velocidade){
        super(  marca,  modelo);
        this.cor=cor;
        this.velocidade=velocidade;

    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor=cor;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade=velocidade;
    }
    @Override
    public String toString() {
       return "cor=" + this.getCor() + "velocidade" + this.getVelocidade();
    }
    


}
