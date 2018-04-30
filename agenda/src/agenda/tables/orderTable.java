/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.tables;

import java.awt.Color;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author louq

 */
public class orderTable {
    
    private DefaultTableModel dtModel;
    private JTable tabla;
    
    String tCliente="6613195267",fEntrega="-1/marz/18",nCliente="18",details="Ninguno";
    String [] nColumnas = {
                "Teléfono de Cliente",
                "Fecha de Entrega",
                "Nombre de Cliente",
                "Detalles"
                };
    
    Object[] data = {
        
            tCliente,
            fEntrega,
            nCliente,
            details

    };    

    
    public orderTable(){
        
        dtModel = new DefaultTableModel(null,nColumnas);
        tabla= new JTable(dtModel);
    }
    
    public JTable getTable(){
        return tabla;
    }
    
    /**
     * Método para insertar una nueva orden a la tabla
     * @param datos Contiene Strings de información de la orden | Fecha de solicitud, Fecha de Entrega,
     * Número del cliente, Detalles
     */
    public void insertOrder(Object[] datos){
        dtModel.insertRow(dtModel.getRowCount(), datos);
    }
    
}
