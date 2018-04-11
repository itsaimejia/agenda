/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.views.secondary;

import agenda.views.news.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author itsai
 */
public class Inventario extends JInternalFrame{
   private NuevoProducto nuevoProducto;
    
    private Container contenedor;
    private JPanel paneTop, paneBottom;
    private JTable tabla;
    private JScrollPane scTabla;
    private JButton nuevo;
    
    public Inventario(){
        this.setTitle("Inventario");
        this.setPreferredSize(new Dimension(800,450));
        contenedor= getContentPane();

        
        paneTop = new JPanel();
        paneTop.setLayout(new BorderLayout());
        
        
        nuevo = new JButton("Nuevo");
        nuevo.addActionListener(e->{
            nuevoProducto= new NuevoProducto();
            nuevoProducto.setVisible(true);
            
        });
        paneTop.add(nuevo,BorderLayout.WEST);
        
        
        paneBottom= new JPanel(null);
        
       String id="ABC3";
        String producto="SILLAS METALICAS";
        String cantidad= "300";
        String disponible ="200";
        String noDisponible="100";

        String [] columnNames = {"ID",
                "Producto",
                "Cantidad",
                "Disponible",
                "No disponible"};
        Object[][] data = {
                {id,producto,cantidad,disponible,noDisponible}
        };
        
        tabla = new JTable(data, columnNames){
          @Override
          public boolean isCellEditable(int row, int column){
              return false;
          }  
        };
        scTabla = new JScrollPane(tabla);
        scTabla.setBounds(30,40,750,300);
        paneBottom.add(scTabla);
        
        
        contenedor.add(paneTop,BorderLayout.PAGE_START);
        contenedor.add(paneBottom,BorderLayout.CENTER);
        
        
        this.setClosable(false);
	this.setVisible(true);
        
    }
}
