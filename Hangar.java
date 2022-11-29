public class Hangar {
    private int id;
    private String local;
    private String idAviao;
    private Aviao aviao;

    public Hangar(){

    }
    public Hangar(int id, String local, String idAviao){
        this.id=id;
        this.local=local;
        this.idAviao=idAviao;

    }
    public Hangar (String local, String idAviao){

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
    public String getIdAviao(){
        return  idAviao;
    }
    public void setIdAviao(String idAviao){
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
