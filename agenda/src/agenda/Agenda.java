/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import javax.swing.*;
import java.awt.*;



public class Agenda extends JFrame{
    
    //variables
    JPanel paneIz,paneTop,base;
    JScrollPane sclist;
    JTable list;
    JButton pedido,invent,report,nuevo;
    
    //variables
    
    Agenda(){
        init();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        Agenda iniciar = new Agenda();
        
    }
    
    void init(){
        setTitle("Alquiladora San Francisco");
        setSize(1000,500);
        setLocation(200,10);
        setLayout(null);
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        paneIz = new JPanel();
        paneIz.setSize(150,700);
        
        paneIz.setLocation(0,0);
        paneIz.setLayout(null);
        
        pedido = new JButton("Pedidos");
        report = new JButton("Reportes");
        invent = new JButton("Inventario");
        
        paneIz.add(pedido);
        paneIz.add(report);
        paneIz.add(invent);
        
        pedido.setBounds(0,0,150,50);
        report.setBounds(0, 50, 150, 50);
        invent.setBounds(0,100,150,50);
       
        base = new JPanel();
        base.setLocation(150,0);
        base.setBackground(Color.LIGHT_GRAY);
        base.setSize(this.getWidth()-150,this.getHeight());
        base.setLayout(new BorderLayout());
        
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
        sclist.setSize(base.getSize());
        base.add(paneTop,BorderLayout.NORTH);
        base.add(sclist, BorderLayout.CENTER);
        
        
        add(paneIz);
        add(base);
        
        repaint();
        setVisible(true);
        
    }
    
}
