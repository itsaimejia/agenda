
package agenda;

import javax.swing.*;


public class Login extends JFrame  {
    
    
    JLabel usuario,contrasena,iniciars;
    JButton ingresar,salir;
    JPasswordField contra;
    JTextField nombre;
    
    
    public static void main(String args[])
    {
       Login entrar=new Login();
       entrar.setVisible(true);
      
    }
    public Login()
    {  
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setTitle("Ingreso");
         setSize(500,400);
         setLocationRelativeTo(null);
         setLayout(null);
         iniciars=new JLabel("Alquiladora San Francisco");
         iniciars.setBounds(150,20,300,50);
         add(iniciars);
         usuario=new JLabel("Usuario");
         usuario.setBounds(90,120,150,50);
         add(usuario);
         nombre=new JTextField("");
         nombre.setBounds(230,130,210,30);
         add(nombre);
         contrasena=new JLabel("Contraseña");
         contrasena.setBounds(90,170,150,50);
         add(contrasena);
         contra=new JPasswordField("");
         contra.setBounds(230,180,210,30);
         add(contra);
         ingresar=new JButton("Ingresar");
         ingresar.setBounds(90,250,150,50);
         add(ingresar);
         salir=new JButton("Salir");
         salir.setBounds(290,250,150,50);
         add(salir);
         salir.addActionListener(e->
         {
         this.dispose();
         }
         );
    
    }
    
  
       
       
           

    

}

