package agenda.views.news;

import java.awt.*;
import javax.swing.*;
import agenda.tables.inventarioTable;
/**
 *
 * @author itsai, louq
 */
public class NuevoProducto extends JFrame{
    
    private Container contenedor;
    private JPanel panelIzq, panelDer;
    private JLabel lblId,lblNombre,lblCantAct,lblCantAgr,lblPrecioInd;
    private JTextField txtId,txtNombre,txtCantidadAgregar,txtPrecioIndividual;
    private JLabel lblCantidadActual,lblFoto;
    private JButton cargarImagen,agregar;
    private inventarioTable tabla;
    
    
    public NuevoProducto(inventarioTable tabla){
        this.tabla=tabla;
        setTitle("Productos");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500,400);  
        setLocationRelativeTo(null);
        setResizable(false);
        
        contenedor=getContentPane();
        
        panelIzq=new JPanel();
        panelIzq.setLayout(new FlowLayout());
        panelIzq.setPreferredSize(new Dimension(250,contenedor.getHeight()-200));
        
        lblId=new JLabel("ID de Producto");
        lblNombre=new JLabel("Nombre");
        lblCantAct=new JLabel("Cantidad actual");
        lblCantAgr=new JLabel("Cantidad agregar");
        lblPrecioInd=new JLabel("Precio individual");
        
        txtId=new JTextField();
        txtId.setPreferredSize(new Dimension(240,30));
        
        txtNombre=new JTextField();
        txtNombre.setPreferredSize(new Dimension(240,30));
        
        lblCantidadActual=new JLabel("0");
        lblCantidadActual.setBorder(BorderFactory.createLineBorder(Color.black));
        lblCantidadActual.setPreferredSize(new Dimension(200,30));
        
        txtCantidadAgregar=new JTextField();
        txtCantidadAgregar.setPreferredSize(new Dimension(240,30));
        
        txtPrecioIndividual=new JTextField();
        txtPrecioIndividual.setPreferredSize(new Dimension(240,30));
        
        panelIzq.add(lblId);
        panelIzq.add(txtId);
        
        panelIzq.add(lblNombre);
        panelIzq.add(txtNombre);
        
        panelIzq.add(lblCantAct);
        panelIzq.add(lblCantidadActual);
        
        panelIzq.add(lblCantAgr);
        panelIzq.add(txtCantidadAgregar);
        
        panelIzq.add(lblPrecioInd);
        panelIzq.add(txtPrecioIndividual);
        
        panelDer=new JPanel();
        panelDer.setLayout(null);
        panelDer.setPreferredSize(new Dimension(250,contenedor.getHeight()-200));
        
        lblFoto=new JLabel("Foto");
        lblFoto.setBorder(BorderFactory.createLineBorder(Color.black));
        lblFoto.setBounds(50,65,150,150);
        
        cargarImagen=new JButton("Cargar imagen...");
        cargarImagen.setBounds(50,215,150,30);
        
        agregar=new JButton("Agregar");
        agregar.setBounds(50,270,150,30);
        
        agregar.addActionListener(e->{
            Object[] data ={
                txtId.getText(),
                txtNombre.getText(),
                lblCantidadActual.getText(),
                "0",
                "0"
            };
            this.tabla.insertProduct(data);
            revalidate(); repaint();
            this.dispose();
        
        });
        
        panelDer.add(lblFoto);
        panelDer.add(cargarImagen);
        panelDer.add(agregar);
                
        contenedor.add(panelIzq,BorderLayout.WEST);
        contenedor.add(panelDer,BorderLayout.EAST);
        
        
    }
}
