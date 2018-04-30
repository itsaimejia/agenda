
package agenda.views.secondary;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author itsai
 */
public class Reportes extends JInternalFrame{
    
    private Container contenedor;
    
    private JPanel panelClientes, panelNegocio;
    public Reportes(){
        this.setTitle("Reportes");
        this.setPreferredSize(new Dimension(800,450));
        
        contenedor=getContentPane();
        contenedor.setLayout(null);
        
        panelClientes=new JPanel(null);
        panelClientes.setBorder(BorderFactory.createLineBorder(Color.black));
        panelClientes.setBounds(50,30,700,150);
        
        panelNegocio=new JPanel(null);
        panelNegocio.setBorder(BorderFactory.createLineBorder(Color.black));
        panelNegocio.setBounds(50,210,700,190);
        
        contenedor.add(panelClientes);
        contenedor.add(panelNegocio);
        
        this.setClosable(false);
	this.setVisible(true);
    }
    
}
