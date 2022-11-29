public class Companhia {
      private int id;
      private   String nome;
      private String cnpj;

      public Companhia(){

      }
    public Companhia(int id, String nome, String cnpj){
        this.id=id;
        this.nome=nome;
        this.cnpj=cnpj;
    }

    public Companhia (String nome, String cnpj){
        this.nome=nome;
        this.cnpj=cnpj;
    }
     
    public int getId(){
        return  id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public  String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj=cnpj;

    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(obj.getClass() != getClass()){
            return false;
        }
        Companhia comp= (Companhia) obj;
        return comp.getId() == this.getId();
    }
    @Override
    public String toString(){
        return "Nome: " + nome + "CNPJ: " + cnpj ;

    }
}