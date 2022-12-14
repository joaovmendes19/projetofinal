package models;

public class Aeronave{
    private int id;
    private String marca;
    private String modelo;
    
    Aeronave(){

    }
    Aeronave(int id, String marca, String modelo) throws Exception{
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
        
    }
    public Aeronave(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    @Override
    public String toString(){
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
    @Override 
    public boolean equals(Object obj){
        if(obj==null || !(obj instanceof Aeronave)){
            return false;

        }
        final Aeronave other = (Aeronave) obj;
        if(this.id != other.id){
            return false;

        }
        return true;

        


}
}
    