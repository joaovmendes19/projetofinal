public class Aviao extends Aeronave{

        private String cor;
        private int capacidade;
        private String 
    
        public Aviao(){
    
        }
        public Aviao(int id,String marca, String modelo, String cor, int capacidade) {
            super( id, marca,  modelo);
            this.cor=cor;
            this.capacidade=capacidade;
        }
        public Aviao(String marca, String modelo, String cor, int capacidade){
            super( marca,  modelo);
            this.cor=cor;
            this.capacidade=capacidade;
    
        }
    
        public String getCor(){
            return this.cor;
        }
        public void setCor(String cor) {
            this.cor=cor;
        }
        public int getCapacidade(){
            return this.capacidade;
        }
        public void setCapacidade(int capacidade) {
            this.capacidade=capacidade;
        }
        
    
    
    }
    
    

