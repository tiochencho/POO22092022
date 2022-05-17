
package cifradocesarvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CifradoCesarVent extends JFrame{
     
     private JTextField cuadroTexto   ;
     private JTextField  posicion  ;
     private JButton boton  ;
     private  JLabel cifrado ;
    
    //constructor por defecto

    public CifradoCesarVent() throws HeadlessException {
        
   
        setTitle ( "Cifrado Cesar" );
        setSize(800 , 200 ); 
        setLayout(new FlowLayout(FlowLayout.CENTER));
       
       // cuadroTexto.setText("Introduce una frase");
        cuadroTexto = new  JTextField ( 10 );
        //cuadroTexto.setText("Introduce una palabra");
      
        posicion = new JTextField ( 7 );
        boton = new  JButton ( "Cifrar" );
        boton.setToolTipText("Click  para cifrar");
        boton.setBackground(Color.LIGHT_GRAY);
        boton.setOpaque(true);
        cifrado = new  JLabel ( "Resultado" );
        
        this.getContentPane().add(posicion);
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(boton);
        this.getContentPane().add(cifrado);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
           System.exit(0);
            }

        });
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
                try {
                    cifrar();
                } catch (Exception ex) {
                    System.out.println(e.toString());
                    JOptionPane.showMessageDialog(null,"Error de captura", "Error", JOptionPane.ERROR_MESSAGE );
                }
            }
        
        });
        
    }   
         private void cifrar(){
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        int desplazamiento;
        String mensaje;
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        desplazamiento = Integer.parseInt(posicion.getText());
        
        mensaje = cuadroTexto.getText();
        
        System.out.println(desplazamiento);
        System.out.println(cuadroTexto.getText());
        System.out.println(mensaje);
        
        String texto = codigo(letras,mensaje);
        
        
        cifrado.setText(texto);  
         }
         private String codigo(String letras, String texto){
        String textoCodificado = "";
        int desplazamiento;
        desplazamiento = Integer.parseInt(posicion.getText());
        texto = texto.toUpperCase();
        
        char caracter;
        for(int i = 0; i<texto.length();i++){
            caracter = texto.charAt(i);
            
            int pos = letras.indexOf(caracter);
            
            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt((pos + desplazamiento)% letras.length());
            }
        }
        
        return textoCodificado;
    }

   
    
    }
