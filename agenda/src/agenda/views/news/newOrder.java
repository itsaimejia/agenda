
package agenda.views.news;
import agenda.crud.NuevoContacto;
import agenda.models.Contacto;

import javax.swing.*;
import agenda.views.secondary.Pedidos;
import agenda.tables.orderTable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author louq
 */
public class newOrder extends JFrame {


    public newOrder(orderTable tab) {
         tablan=tab;
        init();
        

    NuevoContacto nuevoContacto;
    public newOrder() {
        init();
        nuevoContacto=new NuevoContacto();

    }
                       
    private void init() {

        title = new JLabel();
        lbldate = new JLabel();
        lblname = new JLabel();
        lblnumber = new JLabel();
        lbladdress = new JLabel();
        txtname = new JTextField();
        txtnumber = new JTextField();
        txtaddress = new JTextField();
        lblproduct = new JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        bCancel = new JButton();
        bSave = new JButton();
        spProduct = new JScrollPane();
        lblprice = new JLabel();
        txtprice = new JTextField();

        setMaximumSize(new java.awt.Dimension(380, 550));
        setMinimumSize(new java.awt.Dimension(380, 550));
        setPreferredSize(new java.awt.Dimension(380, 550));
        setLayout(null);
        setTitle("Nuevo pedido");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocation(500,120);
        
        lbldate.setText("Fecha del evento");
        add(lbldate);
        lbldate.setBounds(10, 160, 140, 30);

        lblname.setText("Nombre del contacto");
        add(lblname);
        lblname.setBounds(10, 10, 170, 30);

        lblnumber.setText("Teléfono");
        add(lblnumber);
        lblnumber.setBounds(10, 80, 70, 30);

        lbladdress.setText("Dirección");
        add(lbladdress);
        lbladdress.setBounds(10, 120, 70, 30);

       
        add(txtname);
        txtname.setBounds(10, 40, 350, 30);
        add(txtnumber);
        txtnumber.setBounds(90, 80, 270, 30);
        add(txtaddress);
        txtaddress.setBounds(90, 120, 270, 30);

        lblproduct.setText("Productos");
        add(lblproduct);
        lblproduct.setBounds(10, 210, 80, 30);
        add(calendario);
        calendario.setBounds(150, 160, 210, 30);

        bCancel.setText("Cancelar");
        
        add(bCancel);
        bCancel.setBounds(20, 470, 150, 32);

        bSave.setText("Guardar");
        bSave.addActionListener(e->{
        
            Contacto nuevo= new Contacto();
            nuevo.setNombre(txtname.getText());
            nuevo.setDireccion(txtaddress.getText());
            nuevo.setFecha(calendario.getToolTipText());
            nuevo.setIdPedido(1);
            
            boolean correcto=nuevoContacto.crear(nuevo, Double.parseDouble(txtprice.getText()));
            JOptionPane.showMessageDialog(null, (correcto)?"Se agregó el pedido":"Algo salió mal");
            
        });
        add(bSave);
        bSave.setBounds(210, 470, 150, 32);
        
        bSave.addActionListener(e->{
          
             Object[] data = {
                 txtnumber.getText(),
                 df.format(calendario.getDate()),
                 txtname.getText(),
                 "Ninguno"
                 
                }; 
            
            tablan.insertOrder(data);
            revalidate(); repaint();
            this.dispose();
            
            
            
            
            
        });
        
        add(spProduct);
        spProduct.setBounds(0, 240, 380, 170);

        lblprice.setText("Precio total");
        add(lblprice);
        lblprice.setBounds(270, 430, 90, 30);

        txtprice.setText("$0");
        add(txtprice);
        txtprice.setBounds(120, 430, 140, 30);
        
        repaint();
    }                       
                                   

    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");              
    private JButton bCancel;
    private JButton bSave;
    private com.toedter.calendar.JDateChooser calendario;
    private JLabel lbladdress;
    private JLabel lbldate;
    private JLabel lblname;
    private JLabel lblnumber;
    private JLabel lblprice;
    private JLabel lblproduct;
    private JScrollPane spProduct;
    private JLabel title;
    private JTextField txtaddress;
    private JTextField txtname;
    private JTextField txtnumber;
    private JTextField txtprice;
    private orderTable tablan;
}
