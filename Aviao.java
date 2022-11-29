public class Aviao extends Aeronave{

        private String prefixo;
        private int capacidade;
        private int idCompanhia;
        private Companhia companhia;

    
        public Aviao(){
    
        }
        public Aviao(int id,String marca, String modelo, String prefixo, int capacidade, int idCompanhia) {
            super( id, marca,  modelo);
            this.prefixo=prefixo;
            this.capacidade=capacidade;
            this.idCompanhia=idCompanhia;
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
    
    

