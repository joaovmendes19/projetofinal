package models;
import DAO.DAO;
import java.sql.PreparedStatement;

public class Aviao extends Aeronave {
    private String prefixoS;
    private int prefixoI;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;
    

Aviao(){

    }

Aviao(int id , String marca, String modelo, String prefixoS, int prefixoI, int capacidade, int idCompanhia) throws Exception{
        super(id, marca, modelo);
        this.prefixoS = prefixoS;
        this.prefixoI = prefixoI;
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia; 
        
       

        } 
    

public Aviao(String marca, String modelo,String prefixoS, int prefixoI, int capacidade, int idCompanhia) throws Exception{
        super(marca, modelo);
        this.prefixoS = prefixoS;
        this.prefixoI = prefixoI;
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia; 

      
        } 
        
    

public String getPrefixoS(){
        return prefixoS;    
}

public void setPrefixoS(String prefixoS){
        this.prefixoS = prefixoS;
}

public int getPrefixoI(){
    return prefixoI;    
}

public void setPrefixoI(int prefixoI){
    this.prefixoI = prefixoI;
}

public int getCapacidade(){
    return capacidade;    
}

public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
}

public int getIdCompanhia(){
    return idCompanhia;    
}

public void setIdCompanhia(int idCompanhia){
    this.idCompanhia = idCompanhia;
}

public Companhia getCompanhia(){
    return companhia;
}

public void setCompanhia(Companhia companhia){
    this.companhia = companhia;
}

@Override
 public String  toString(){
    return super.toString() + "IdCompanhia" + idCompanhia + "Capacidade" + capacidade + "Prefixo" + prefixoS + prefixoI;
 }

    public void insert() throws Exception{
        PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO aviao (marca,modelo,prefixoS,prefixoI,capacidade,idCompanhia) VALUES (?,?,?,?,?,?,?);");{
            
            prep.setString(1, getMarca());
            prep.setString(2, getModelo());
            prep.setString(3, getPrefixoS());
            prep.setInt(4, getPrefixoI());
            prep.setInt(5, getCapacidade());
            prep.setInt(6, getIdCompanhia());
            prep.execute();
            prep.close();   
        }
    }
    
    public void update() throws Exception{
        PreparedStatement prep  = DAO.createConnection().prepareStatement ("UPDATE aviao SET marca = ?, modelo = ?, prefixoS = ?, prefixoI = ?, capacidade = ?, idCompanhia = ? WHERE id = ?;");{
            
            prep.setString(1, getMarca());
            prep.setString(2, getModelo());
            prep.setString(3, getPrefixoS());
            prep.setInt(4, getPrefixoI());
            prep.setInt(5, getCapacidade());
            prep.setInt(6, getIdCompanhia());
            prep.setInt(7, getId());
            prep.execute();
            prep.close();   
        }
    

    }
    
    public void delete() throws Exception{
        PreparedStatement prep  = DAO.createConnection().prepareStatement ("DELETE FROM aviao WHERE id = ?;");{
            
            prep.setInt(1, getId());
            prep.execute();
            prep.close();   
        }

    } 



}






    
    


