package agenda.views;

import agenda.views.secondary.*;

import javax.swing.*;
import java.awt.*;


public class Agenda extends JFrame{
    
    //variables
    private Pedidos pedidos;
    private Inventario inventario;
    private Reportes reportes;
    
    private JPanel paneMenu, paneBase;
    private JButton pedido,invent,report;
    
    //variables
    
    public Agenda(){
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
        setResizable(false);
        
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
            paneBase.removeAll();
            paneBase.repaint();
            pedidos= new Pedidos();
            paneBase.add(pedidos);
             
         });
        
       
        
        invent = new JButton("Inventario");
        invent.addActionListener(e->{
            paneBase.removeAll();
            paneBase.repaint();
            inventario= new Inventario();
            paneBase.add(inventario);
            
        });
         report = new JButton("Reportes");
        report.addActionListener(e->{
            paneBase.removeAll();
            paneBase.repaint();
            reportes= new Reportes();
            paneBase.add(reportes);
             
         });
       
        
        paneMenu.add(pedido);
        paneMenu.add(invent);
        paneMenu.add(report);
        
        
        pedido.setBounds(0,0,150,50);
        invent.setBounds(0, 50, 150, 50);
        report.setBounds(0,100,150,50);
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
