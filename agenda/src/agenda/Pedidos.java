
package agenda;
import javax.swing.*;

/**
 *
 * @author 
 */
public class Pedidos extends JPanel{
    JTable list;
    
    
    Pedidos(){
        
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
        
    }
    
}
