/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.crud;
import agenda.models.Contacto;
import java.sql.Statement;

/**
 *
 * @author itsai
 */
public class NuevoContacto {

    private Conexion con;
    private Statement stmt; 
    public NuevoContacto() {
        con= new Conexion();
        stmt=null;
    }
    
    public boolean crear(Contacto contacto, double total){
        try{
            stmt=con.getConnection().createStatement();
            stmt.executeUpdate("INSERT INTO 'cliente' ('nombre', 'telefono', 'direccion', 'fechaEvento', 'idPedido', 'total') "
                    + "VALUES ('"+contacto.getNombre()+"', '"+contacto.getTelefono()+"', '"+contacto.getDireccion()+"', '"+contacto.getFecha()+"', '"+contacto.getIdPedido()+"', '"+total+"')");
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    
    
}
