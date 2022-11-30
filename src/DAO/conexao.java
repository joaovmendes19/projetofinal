package DAO;

import java.sql.Connection;
public class conexao {

    public static void main(String[] args) {
    try{      
        Connection conexao = DAO.createConnection();// TODO Auto-generated method stub
        final Aviao aviao = new Aviao( "Boeing", "737", "PR-AXX", 150, 1);

        PreparedStatement stmt = conexao.prepareStatement(
            "INSERT INTO aviao (ID_AERONAVE, MODELO, MARCA, NUMERO, CAPACIDADE, ID_PISTA) VALUES (?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, aviao.getId());
        stmt.setString(2, aviao.getModelo());
        stmt.setString(3, aviao.getMarca());
        stmt.setString(4, aviao.getNumero());
        stmt.setInt(5, aviao.getCapacidade());
        stmt.setInt(6, aviao.getId_pista());
        stmt.execute();
        
    }  catch (Exception e) {
            System.out.println("Erro ao conectar com o banco de dados");
        }

       

       
}
}