
package agenda.views.news;

import java.awt.*;
import javax.swing.*;


public class NuevoPedido extends JFrame {
    
    JLabel lblTot,lblFecha,lblNombre,lblDirec,lblTel,lblPedido;
    JLabel lblTotal;
    JTextField fech,nombr,direccio,telefon;
    JButton guardar;
    JTable lista;
    JScrollPane sclista;
    
    public NuevoPedido()
    {
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Nuevo pedido"); 
        setSize(800,650);
        setLocationRelativeTo(null);
        setLayout(null);
        this.setResizable(false);
         
//       Label De Fecha Evento 
        lblFecha=new JLabel("Fecha Del Evento");
        lblFecha.setBounds(250,20,150,20);
        add(lblFecha);
                  
//       Textfield De La Fecha Del Evento
        fech=new JTextField();
        fech.setBounds(360,20,140,25);
        add(fech);
         
//       Label De Nombre Contacto
        lblNombre=new JLabel("Nombre Del Contacto");
        lblNombre.setBounds(100,60,140,25);
        add(lblNombre);
         
//       TextField Para El Nombre Del Contacto
        nombr=new JTextField();
        nombr.setBounds(100,90,285,25);
        add(nombr);
         
//       Label De El Telefono
        lblTel=new JLabel("Teléfono");
        lblTel.setBounds(410,60,140,25);
        add(lblTel);
         
//       TextField De Telefono
        telefon=new JTextField();
        telefon.setBounds(410,90,200,25);
        add(telefon);
         
//       Label De Direccion
        lblDirec=new JLabel("Dirección");
        lblDirec.setBounds(100,120,140,20);
        add(lblDirec);
        
//      TextField Para La Direccion 
        direccio=new JTextField(" ");
        direccio.setBounds(100,145,510,25);
        add(direccio);
        
//      Label Del Pedido
        lblPedido=new JLabel("Pedido");
        lblPedido.setBounds(100,175,140,20);
        add(lblPedido);
        
//      Datos Para Hacer y Llenar La Tabla 
        String [] columnas={"Id","Producto","Cantidad","En Stock","Precio"};
        String id=" ",Producto=" ",Cantidad=" ",Stock=" ",Precio=" ";
        Object[][] datos={{id,Producto,Cantidad,Stock,Precio},};
        lista=new JTable(datos,columnas);
         
//       ScrollPanel Para La Lista 
        sclista=new JScrollPane(lista);
        sclista.setBounds(30,200,750,300);      //30,70,750,300 Dimensiones de la tabla pedidos De La Agenda
        add(sclista);
         
//       Label Del Total
        lblTot=new JLabel("Total:");
        lblTot.setBounds(590,500,60,25);
        add(lblTot);
         
//      TextField Para EL Monto Del Total
        lblTotal=new JLabel();
        lblTotal.setBounds(630,500,150,25);
        lblTotal.setBorder(BorderFactory.createLineBorder(Color.black));
        add(lblTotal);
      
//       Boton Para Guardar El Pedido
        guardar=new JButton("Guardar Pedido");
        guardar.setBounds(325,550,150,35);
        add(guardar);  
    }

}

      