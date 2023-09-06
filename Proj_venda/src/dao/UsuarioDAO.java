/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import modelo.Cliente;


/**
 *
 * @author bianc
 */
public class UsuarioDAO {
    private final Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Cliente cliente){
        String sql = "INSERT INTO Cliente(cli_nome) VALUES(?)";
        try {
            // String id_aux=Integer.toString(cliente.getId());
             try (PreparedStatement stmt = connection.prepareStatement(sql)) {
              
                stmt.setString(1, cliente.getNome());
                stmt.execute();
                stmt.close();
            }
            
            }
            catch (SQLException u){
                    throw new RuntimeException(u);
             }
            
        }
    
}
