
package agenda;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author 
 */
public class Pedidos extends JInternalFrame{
    
    private Container contenedor;
    private JPanel paneTop, paneBottom;
    private JTable tabla;
    private JScrollPane scTabla;
    private JButton nuevo;
    private JLabel lblConsulta;
    private JTextField txtConsultaFecha;
    
    public Pedidos(){
        this.setTitle("Pedidos");
        this.setPreferredSize(new Dimension(800,450));
        contenedor= getContentPane();

        
        paneTop = new JPanel();
        paneTop.setLayout(new BorderLayout());
        nuevo = new JButton("Nuevo");
        
        paneTop.add(nuevo,BorderLayout.WEST);
        
        
        paneBottom= new JPanel(null);
        
        lblConsulta= new JLabel("Consultar fecha: ");
        lblConsulta.setBounds(80,25,100,10);
        paneBottom.add(lblConsulta);
        
        txtConsultaFecha= new JTextField();
        txtConsultaFecha.setBounds(200,20,150,20);
        paneBottom.add(txtConsultaFecha);
        
        String feSol="23/03/18";
        String feEno="30/03/18";
        String nombreC= "Juan Perez";
        String det ="Ninguno";

        String [] columnNames = {"Fecha de Solicitud",
                "Fecha de Entrega",
                "Nombre de Cliente",
                "Detalles"};
        Object[][] data = {
                {feSol,feEno,
                        nombreC,det},
        };
        
        tabla = new JTable(data, columnNames);
        scTabla = new JScrollPane(tabla);
        scTabla.setBounds(30,70,750,300);
        paneBottom.add(scTabla);
        
        
        contenedor.add(paneTop,BorderLayout.PAGE_START);
        contenedor.add(paneBottom,BorderLayout.CENTER);
        
        
        this.setClosable(true);
        this.setResizable(true);
	this.setVisible(true);
        
    }
    
}
