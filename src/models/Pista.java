package models;
public class Pista {
    private int id;
    private String numero;

    public Pista(){

    }
    public Pista(int id, String numero){
        this.id=id;
        this.numero=numero;
    }
    public Pista(String numero){
        this.numero=numero;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    @Override
    public String toString() {
        
        return "Numero da pista: " + numero;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Voo))
    {
        return false;
    }
    final Pista other = (Pista) obj;
        if(this.id != other.id)
        {
            return false;
    
        }
        return true;  
    }
}
