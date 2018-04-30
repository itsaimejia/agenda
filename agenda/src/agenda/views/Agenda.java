package agenda.views;

import agenda.views.secondary.*;
import javax.swing.*;
import java.awt.*;
import agenda.tables.*;


/**
 * 
 * @author louq
 */
public class Agenda extends JFrame {

    //variables
    private Pedidos pedidos;
    private Inventario inventario;
    private Reportes reportes;
    public JPanel panelMenu, panelBase;
    private JButton pedido, invent, report;
    private orderTable tabla = new orderTable();
    private inventarioTable invTabla = new inventarioTable();
    //variables
    
    public JPanel getPane(){
        return panelBase;
    }
    public Agenda() {
        init();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pedidos = new Pedidos(tabla);
        panelBase.add(pedidos);
        repaint();
        
    }

    public static void main(String[] args) {
        new Agenda();
    }

    void init() {
        setTitle("Alquiladora San Francisco");
        setSize(1000, 550);
        setLocation(200, 10);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        crearPanelMenu();
        crearPanelBase();

        repaint();
        setVisible(true);

    }

    private void crearPanelMenu() {
        panelMenu = new JPanel();
        panelMenu.setSize(150, 700);

        panelMenu.setLocation(0, 0);
        panelMenu.setLayout(null);

        pedido = new JButton("Pedidos");
        pedido.addActionListener(e -> {
            panelBase.removeAll();
            panelBase.repaint();
            pedidos = new Pedidos(tabla);
            panelBase.add(pedidos);

        });

        invent = new JButton("Inventario");
        invent.addActionListener(e -> {
            panelBase.removeAll();
            panelBase.repaint();
            inventario = new Inventario(invTabla);
            panelBase.add(inventario);

        });
        report = new JButton("Reportes");
        report.addActionListener(e -> {
            panelBase.removeAll();
            panelBase.repaint();
            reportes = new Reportes();
            panelBase.add(reportes);

        });

        panelMenu.add(pedido);
        panelMenu.add(invent);
        panelMenu.add(report);

        pedido.setBounds(0, 0, 150, 50);
        invent.setBounds(0, 50, 150, 50);
        report.setBounds(0, 100, 150, 50);
        add(panelMenu);
    }

    private void crearPanelBase() {
        panelBase = new JPanel();
        panelBase.setLayout(new BorderLayout());
        panelBase.setLocation(150, 0);
        panelBase.setBackground(Color.LIGHT_GRAY);
        panelBase.setSize(this.getWidth() - 150, this.getHeight());
        add(panelBase);
    }

}
