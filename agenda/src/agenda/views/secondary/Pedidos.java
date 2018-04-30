
package agenda.views.secondary;
import agenda.views.news.*;
import java.awt.*;
import javax.swing.*;
import agenda.tables.orderTable;

/**
 *
 * @author louq
 */
public class Pedidos extends JInternalFrame{
    private NuevoPedido nuevoPedido;
    private newOrder nuevaOrden;
    private Container contenedor;
    private JPanel panelTop, panelBottom;
    private JTable tabla;
    private JScrollPane scTabla;
    private JButton nuevo;
    private JLabel lblConsulta;
    private JTextField txtConsultaFecha;
    private com.toedter.calendar.JDateChooser calendario;
    
    orderTable tablon;
    
    public Pedidos(int x){
        
        updateUI();
    }
    
    public Pedidos(orderTable tablx){
        tablon=tablx;
        this.setTitle("Pedidos");
        this.setPreferredSize(new Dimension(800,450));
        contenedor= getContentPane();

        
        panelTop = new JPanel();
        panelTop.setLayout(new BorderLayout());
        
        
        nuevo = new JButton("Nuevo");
        nuevo.addActionListener(e->{
            /*obsoleto
            nuevoPedido= new NuevoPedido();
            nuevoPedido.setVisible(true);
            */
            
            nuevaOrden = new newOrder(tablon);
            nuevaOrden.setVisible(true);
        });
        panelTop.add(nuevo,BorderLayout.WEST);
        
        
        panelBottom= new JPanel(null);
        
        lblConsulta= new JLabel("Consultar fecha: ");
        lblConsulta.setBounds(80,25,100,10);
        panelBottom.add(lblConsulta);
        
        calendario = new com.toedter.calendar.JDateChooser();
        calendario.setBounds(200,20,150,20);
        panelBottom.add(calendario);
        
        /*obsoleto
        txtConsultaFecha= new JTextField();
        txtConsultaFecha.setBounds(200,20,150,20);
        panelBottom.add(txtConsultaFecha);
        */
        
        
        
       
        tabla = tablon.getTable();
        scTabla = new JScrollPane(tabla);
        scTabla.setBounds(30,70,750,300);
        panelBottom.add(scTabla);
        
        
        contenedor.add(panelTop,BorderLayout.PAGE_START);
        contenedor.add(panelBottom,BorderLayout.CENTER);
        
        
        this.setClosable(false);
	this.setVisible(true);
        
    }
    
}
