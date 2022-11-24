public class Aeronave{

    private int id;
    private String marca;
    private String modelo;
    

    public Aeronave(){

    }

    public Aeronave(int id, String marca, String modelo){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;

    }

    public Aeronave(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
       this.id=id;
    }
    
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca=marca;
    }
    public String getModelo() {
        return   this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo=modelo;
    }
    

    



}