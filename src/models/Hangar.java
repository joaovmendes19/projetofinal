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
    public Hangar (String local, int idAviao)throws Exception{

        this.local=local;
        this.idAviao=idAviao;
        
        PreparedStatement prep = DAO.createConnection().prepareStatement("INSERT INTO hangar (local, id_aviao) VALUES (?, ?);");{
        prep.setString(1, local);
        prep.setInt(2, idAviao);
        prep.execute();
        prep.close();

        }
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

    public void insert() throws Exception {
        try{
        PreparedStatement prep = DAO.createConnection().prepareStatement("INSERT INTO hangar (local, id_aviao) VALUES (?, ?);");
        prep.setString(1, this.getLocal());
        prep.setInt(2, this.getIdAviao());
        prep.execute();
        prep.close();
        }catch(Exception e){
            throw new Exception("Erro ao inserir hangar");
        }
    }

    public void update() throws Exception {
        try{
        PreparedStatement prep = DAO.createConnection().prepareStatement("UPDATE hangar SET local = ?, id_aviao = ? WHERE id_hangar = ?;");
        prep.setString(1, this.getLocal());
        prep.setInt(2, this.getIdAviao());
        prep.setInt(3, this.getId());
        prep.execute();
        prep.close();
        }catch(Exception e){
            throw new Exception("Erro ao atualizar hangar");
        }
    }
    public static void delete(int id) throws Exception {
        try{
        PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM hangar WHERE id_hangar = ?;");
        prep.setInt(1, id);
        prep.execute();
        prep.close();
        }catch(Exception e){
            throw new Exception("Erro ao deletar hangar");
        }
    }

    public static Pista getById(int id){
        return new Pista();
        }
}
