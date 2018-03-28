
package agenda.views;

import agenda.views.secondary.Pedidos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Agenda extends JFrame{
    
    //variables
    Pedidos pedidos;
    JPanel paneMenu, paneBase;
    JButton pedido,invent,report;
    
    //variables
    
    Agenda(){
        init();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pedidos= new Pedidos();
        paneBase.add(pedidos);
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
        
        
        
        
        repaint();
        setVisible(true);
        
    }
    
    private void crearPanelMenu(){
        paneMenu = new JPanel();
        paneMenu.setSize(150,700);
        
        paneMenu.setLocation(0,0);
        paneMenu.setLayout(null);
        
        pedido = new JButton("Pedidos");
        pedido.addActionListener(e->{
            pedidos= new Pedidos();
            paneBase.add(pedidos);
             
         });
        
        report = new JButton("Reportes");
        report.addActionListener(e->{
            
             
         });
        
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
        add(paneBase);
    }
    
   
    
}
