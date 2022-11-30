package models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.DAO;

public class Voo {
    private int id;
    private String numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idPista;
    private int idAviao;
    private Aviao aviao;
    private int idHelicoptero;
    private Helicoptero helicoptero;
    private int idJato;
    private Jato jato;
    
    Voo(){

    }
    Voo(int id, String numero, String data, String hora, String origem, String destino, String  piloto, String copiloto, String observacao, int idPista, int idAviao, int idHelicoptero, int idJato) throws Exception{
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idPista = idPista;
        this.idAviao = idAviao;
        this.idHelicoptero = idHelicoptero;
        this.idJato = idJato;
        
        PreparedStatement prep  = DAO.createConnection().prepareStatement("INSERT INTO pista (id_pista, numero, data, hora, origem, destino, piloto, copiloto, observacao, id_pista, id_aviao, id_helicoptero, id_jato) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
        prep.setInt(1,id);
        prep.setString(2, numero);
        prep.setString(3, data);
        prep.setString(4, hora);
        prep.setString(5, origem);
        prep.setString(6, destino);
        prep.setString(7, piloto);
        prep.setString(8, copiloto);
        prep.setString(9, observacao);
        prep.setInt(10, idPista);
        prep.setInt(11, idAviao);
        prep.setInt(12, idHelicoptero);
        prep.setInt(13, idJato);
        prep.execute();
        prep.close();

    }

    Voo(String numero, String data, String hora, String origem, String destino, String  piloto, String copiloto, String observacao, int idPista, int idAviao, int idHelicoptero, int idJato) throws SQLException{
        
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idPista = idPista;
        this.idAviao = idAviao;
        this.idHelicoptero = idHelicoptero;
        this.idJato = idJato;
        
        PreparedStatement prep = DAO.createConnection().prepareStatement("INSERT INTO pista (numero, data, hora, origem, destino, piloto, copiloto, observacao, id_pista, id_aviao, id_helicoptero, id_jato) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
        prep.setString(1, numero);
        prep.setString(2, data);
        prep.setString(3, hora);
        prep.setString(4, origem);
        prep.setString(5, destino);
        prep.setString(6, piloto);
        prep.setString(7, copiloto);
        prep.setString(8, observacao);
        prep.setInt(9, idPista);
        prep.setInt(10, idAviao);
        prep.setInt(11, idHelicoptero);
        prep.setInt(12, idJato);
        prep.execute();
        prep.close();   
    }

public int getId() {
    return id;
}

public void setId(int id){
    this.id = id;   
}
public String getNumero() {
    return numero;
}

public void setNumero(String numero){
    this.numero = numero;   
} 
public String getData() {
    return data;
}

public void setData(String data){
    this.data = data;   
}

public String getHora() {
    return hora;
}

public void setHora(String hora){
    this.hora = hora;   
} 

public String getOrigem() {
    return origem;
}

public void setOrigem(String origem){
    this.origem = origem;   
} 

public String getDestino() {
    return destino;
}

public void setDestino(String destino){
    this.destino = destino;   
} 

public String getPiloto() {
    return piloto;
}

public void setPiloto(String piloto){
    this.piloto = piloto;   
}

public String getCopiloto() {
    return copiloto;
}

public void setCopiloto(String copiloto){
    this.copiloto = copiloto;   
}

public String getObservacao() {
    return observacao;
}

public void setObservacao(String observacao){
    this.observacao = observacao;   
}

public int getIdPista() {
    return idPista;
}

public void setIdPista(int idPista){
    this.idPista = idPista;   
}

public int getIdAviao() {
    return idAviao;
}

public void setIdAviao(int idAviao){
    this.idAviao = idAviao;   
} 

public int getIdHelicoptero() {
    return idHelicoptero;
}

public void setIdHelicoptero(int idHelicoptero){
    this.idHelicoptero = idHelicoptero;   
}

public int getIdJato() {
    return idJato;
}

public void setIdJato(int idJato){
    this.idJato = idJato;   
} 

public Aviao getAviao() {
    return aviao;
}

public void setAviao(Aviao aviao){
    this.aviao = aviao;   
} 
public Helicoptero getHelicoptero() {
    return helicoptero;
}

public void setHelicoptero(Helicoptero helicoptero){
    this.helicoptero = helicoptero;   
} 

public Jato getJato() {
    return jato;
}

public void setJato(Jato jato){
    this.jato = jato;   
} 

@Override
 public String  toString(){
    return super.toString() + "Número" + numero + "Data" + data 
    + "Hora" + hora + "Origem" + origem + "Destino" + destino 
    + "Piloto" + piloto + "Copiloto" + copiloto + "Observação" + observacao
    + "IdPista" + idPista + "IdAvião" + idAviao + "IdHelicoptero" + idHelicoptero
    + "IdJato" + idJato;
}

@Override
public boolean equals(Object obj){
    if(obj==null || !(obj instanceof Voo))
    {
        return false;
    }
    final Voo other = (Voo) obj;
        if(this.id != other.id)
        {
            return false;
    
        }
        return true;  
}

}