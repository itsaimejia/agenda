/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.tables;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author louq
 */
public class orderTable {
   
    String fSolicitud="Juan Perez",fEntrega="31/feb/2018",nCliente="18",details="Ninguno";
    
    
    String [] columnNames = {"Fecha de Solicitud",
                "Fecha de Entrega",
                "Nombre de Cliente",
                "Detalles"};
    
    Object[][] data = {
        {fSolicitud,fEntrega,nCliente,details}
    };
    
     JTable tabla= new JTable(data,columnNames){
          @Override
          public boolean isCellEditable(int row, int column){
              return false;
          }  
        };
    
    public orderTable(){
        
       //tabla
        
        
    }
    
    public JTable getTable(){
        tabla.setBackground(Color.BLUE);
        return tabla;
    }
    public void setDate(){
        
    }
    public void setSize(){
        tabla.setLocation(0, 0);
       //setSize(400,400);
    }
    
}
