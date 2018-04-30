package agenda.views.secondary;

import agenda.views.news.*;
import java.awt.*;
import javax.swing.*;
import agenda.tables.inventarioTable;

/**
 *
 * @author louq
 */
public class Inventario extends JInternalFrame{
    
    private NuevoProducto nuevoProducto;
    private Container contenedor;
    private JPanel panelTop, panelBottom;
    private JTable tabla;
    private JScrollPane scTabla;
    private JButton nuevo;
    private inventarioTable tablon;
    
    public Inventario(inventarioTable table){
        
        this.setTitle("Inventario");
        this.setPreferredSize(new Dimension(800,450));
        contenedor= getContentPane();

        panelTop = new JPanel();
        panelTop.setLayout(new BorderLayout());
          
        nuevo = new JButton("Nuevo");
        nuevo.addActionListener(e->{
            nuevoProducto= new NuevoProducto(tablon);
            nuevoProducto.setVisible(true);     
            
            
        });
        panelTop.add(nuevo,BorderLayout.WEST); 
        
        panelBottom= new JPanel(null);
        
        tablon = table;
        tabla = tablon.getTable();
        
        scTabla = new JScrollPane(tabla);
        scTabla.setBounds(30,40,750,300);
        panelBottom.add(scTabla);
        
        contenedor.add(panelTop,BorderLayout.PAGE_START);
        contenedor.add(panelBottom,BorderLayout.CENTER);
        
        this.setClosable(false);
	this.setVisible(true);
        
    }
}
