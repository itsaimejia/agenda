
package agenda;


import java.awt.Dimension;
import javax.swing.*;


public class Nuevo extends JFrame {
    
   
    JLabel total,fecha,nombre,direccion,telefono,pedido,titulo;
    JTextField tota,fech,nombr,direccio,telefon;
    JButton guardar;
    JTable lista;
    JScrollPane sclista;
    
    
    public static void main(String args[])
    {
       Nuevo pedido=new Nuevo();
       pedido.setVisible(true);
    }
    
    public Nuevo()
    {
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setTitle("Nuevo Pedido");
         setSize(800,800);
         setLocationRelativeTo(null);
         setLayout(null);
         this.setResizable(false);
         titulo=new JLabel("Nuevo Pedido");
         titulo.setBounds(335,20,150,50);
         add(titulo);
         fecha=new JLabel("Fecha Del Evento");
         fecha.setBounds(230,85,150,50);
         add(fecha);
         fech=new JTextField("");
         fech.setBounds(340,100,140,30);
         add(fech);
         nombre=new JLabel("Nombre Del Contacto");
         nombre.setBounds(100,160,140,50);
         add(nombre);
         nombr=new JTextField("");
         nombr.setBounds(100,200,280,35);
         add(nombr);
         telefono=new JLabel("Telefono");
         telefono.setBounds(410,160,140,50);
         add(telefono);
         telefon=new JTextField("");
         telefon.setBounds(410,200,180,35);
         add(telefon);
        direccion=new JLabel("Direccion");
        direccion.setBounds(100,230,140,50);
        add(direccion);
        direccio=new JTextField(" ");
        direccio.setBounds(100,270,500,35);
        add(direccio);
        pedido=new JLabel("Pedido");
        pedido.setBounds(160,310,140,50);
        add(pedido);
         String [] columnas={"Id","Producto","Cantidad","En Stock","Precio"};
         String id="",Producto="",Cantidad="",Stock="",Precio="";
         Object[][] datos={{id,Producto,Cantidad,Stock,Precio},};
         lista=new JTable(datos,columnas);
         sclista=new JScrollPane(lista);
         sclista.setBounds(30,350,710,300);
         add(sclista);
         total=new JLabel("Total");
         total.setBounds(450,670,150,50);
         add(total);
         tota=new JTextField("");
         tota.setBounds(500,675,150,35);
         add(tota);
         guardar=new JButton("Guardar Pedido");
         guardar.setBounds(200,680,150,35);
         add(guardar);
         
         
         
         
      
         
         
         
    }
    
   
    
   

}



      