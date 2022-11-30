package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Hangar {
    private int id;
    private String local;
    private int idAviao;
    private Aviao aviao;

    public Hangar(){

    }
    public Hangar(int id, String local, int idAviao) throws Exception {
        this.id=id;
        this.local=local;
        this.idAviao=idAviao;

        PreparedStatement prep  = DAO.createConnection().prepareStatement("INSERT INTO hangar (id_hangar, local, id_aviao) VALUES (?, ?, ?);");
        prep.setInt(1, id); 
        prep.setString(2, local);
        prep.setInt(3, idAviao);
        prep.execute();
        prep.close();

    }
    public Hangar (String local, int idAviao){

        this.local=local;
        this.idAviao=idAviao;

    }
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getLocal(){
        return  local;
    }
    public void setLocal(String local){
        this.local=local;

    }
    public int getIdAviao(){
        return  idAviao;
    }
    public void setIdAviao(int idAviao){
        this.idAviao=idAviao;
    }
    public Aviao getAviao(){
        return aviao;
    }
    public void setAviao(Aviao aviao){
        this.aviao=aviao;
    }
    @Override
    public String toString() {
        return "Local"+ this.getLocal()+ "Id do avião"+ this.getIdAviao();
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(obj.getClass() != getClass()){
            return false;
        }
        Hangar hang= (Hangar) obj;
        return hang.getId() == this.getId();
    }
}
