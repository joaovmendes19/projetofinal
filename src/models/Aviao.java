package models;

import java.sql.PreparedStatement;
import DAO.DAO;
import com.mysql.cj.xdevapi.PreparableStatement;

public class Aviao extends Aeronave{

        private String prefixo;
        private int capacidade;
        private int idCompanhia;
        private Companhia companhia;

    
        public Aviao(){
    
        }
        public Aviao(int id,String marca, String modelo, String prefixo, int capacidade, int idCompanhia) throws Exception{
            super( id, marca,  modelo);
            this.prefixo=prefixo;
            this.capacidade=capacidade;
            this.idCompanhia=idCompanhia;

            PreparedStatement prep = DAO.createConnection().prepareStatement("INSERT INTO aviao (id_aviao, marca, modelo, prefixo, capacidade, id_companhia) VALUES (?, ?, ?, ?, ?, ?);");
            prep.setInt(1, id);
            prep.setString(2, marca);
            prep.setString(3, modelo);
            prep.setString(4, prefixo);
            prep.setInt(5, capacidade);
            prep.setInt(6, idCompanhia);
            prep.execute();
            prep.close();

        }
        public Aviao(String marca, String modelo, String prefixo, int capacidade, int idCompanhia){
            super( marca,  modelo);
            this.prefixo=prefixo;
            this.capacidade=capacidade;
            this.idCompanhia=idCompanhia;
    
        }
    
        public String getPrefixo(){
            return this.prefixo;
        }
        public void setPrefixo(String prefixo) {
            this.prefixo=prefixo;
        }
        public int getCapacidade(){
            return this.capacidade;
        }
        public void setCapacidade(int capacidade) {
            this.capacidade=capacidade;         
        }
        public int getIdCompanhia(){
            return idCompanhia;

        }
        public void setIdCompanhia(int idCompanhia){
            this.idCompanhia=idCompanhia;
        }
        public Companhia getCompanhia(){
            return companhia;
        }
        public void setCompanhia(Companhia companhia){
            this.companhia=companhia;

        }
        public String toString(){
            return super.toString() + "Prefixo: " + this.getPrefixo() + "Capacidade: " + this.getCapacidade() + "IdCompanhia: " + this.getIdCompanhia();
        }
    
    }
    
    

