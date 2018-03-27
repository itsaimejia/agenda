
package agenda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Agenda extends JFrame{
    
    //variables
    JPanel paneMenu,paneBase,paneTop;
    JScrollPane sclist;
    JTable list;
    JButton pedido,invent,report,nuevo;
    
    //variables
    
    Agenda(){
        init();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Agenda();
        
    }
    
    void init(){
        setTitle("Alquiladora San Francisco");
        setSize(1000,500);
        setLocation(200,10);
        setLayout(null);
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        crearPanelMenu();
        crearPanelBase();
        crearPedidos();
        
        
        repaint();
        setVisible(true);
        
    }
    
    private void crearPanelMenu(){
         paneMenu = new JPanel();
        paneMenu.setSize(150,700);
        
        paneMenu.setLocation(0,0);
        paneMenu.setLayout(null);
        
        pedido = new JButton("Pedidos");
        report = new JButton("Reportes");
        invent = new JButton("Inventario");
       
        
        paneMenu.add(pedido);
        paneMenu.add(report);
        paneMenu.add(invent);
        
        pedido.setBounds(0,0,150,50);
        report.setBounds(0, 50, 150, 50);
        invent.setBounds(0,100,150,50);
        
        
        add(paneMenu);
    }
    
    private void crearPanelBase(){
        paneBase = new JPanel();
        paneBase.setLocation(150,0);
        paneBase.setBackground(Color.LIGHT_GRAY);
        paneBase.setSize(this.getWidth()-150,this.getHeight());
        paneBase.setLayout(new BorderLayout());
        add(paneBase);
    }
    
    private void crearPedidos(){
        paneTop = new JPanel();
        paneTop.setLayout(new BorderLayout());
        nuevo = new JButton("Nuevo");
        
        paneTop.add(nuevo,BorderLayout.EAST);
        
        
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
        
        list = new JTable(data, columnNames);
        sclist = new JScrollPane(list);
        sclist.setSize(paneBase. getSize());
        paneBase.add(paneTop,BorderLayout.NORTH);
        paneBase.add(sclist, BorderLayout.CENTER);
    }
    
}
