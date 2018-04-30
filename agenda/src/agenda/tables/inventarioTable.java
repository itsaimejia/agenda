package agenda.tables;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author louq
 */
public class inventarioTable {
    
    private DefaultTableModel iModel;
    private JTable iTabla;
    String [] nColumnas = {
                "ID",
                "Producto",
                "Cantidad",
                "Disponible",
                "En alquiler"
                };
    
public inventarioTable(){
    iModel = new DefaultTableModel(null,nColumnas);
    iTabla = new JTable(iModel){
          @Override
          public boolean isCellEditable(int row, int column){
              return false;
          }  
        };
}

public JTable getTable(){
    return iTabla;
}

public void insertProduct(Object[] datos){
    iModel.insertRow(iModel.getRowCount(), datos);
}


    
}
