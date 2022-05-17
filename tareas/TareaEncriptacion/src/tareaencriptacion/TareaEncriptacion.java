
package tareaencriptacion;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author HP
 */
public class TareaEncriptacion extends JFrame{
 JTextField mensaje;
    JTextField desplazamiento;
    JTextField resultado;
    JLabel mensajeCifrado;
    JButton boton;
    String cifrado = "abcdefghijklmnñopqrstuvwxyz";
    public TareaEncriptacion()throws HeadlessException {
        setTitle("Cifrado César");
        setSize(300, 350);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        mensaje = new JTextField(20);
        desplazamiento = new JTextField(5);
        boton = new JButton("Cifre su texto");
        boton.setBackground(Color.PINK);
        resultado = new JTextField(15);
        resultado.setBackground(Color.PINK);
        mensaje.setToolTipText("Ingrese el texto a cifrar");
        mensaje.setBackground(Color.PINK);
        desplazamiento.setToolTipText("Letras a desplazar");
        desplazamiento.setBackground(Color.PINK);
       mensajeCifrado =new JLabel("Mensaje Cifrado");
       mensajeCifrado.setBackground(Color.PINK);
       mensajeCifrado.setBounds(450, 70, 200, 500);
        this.getContentPane().add(mensaje);
        this.getContentPane().add(desplazamiento);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
         this.getContentPane().add(mensajeCifrado);
    
        this.validate();
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String textoCifrado = "";
                String textoCifrar = mensaje.getText();
                String despla = desplazamiento.getText();
                int num = Integer.parseInt(despla);
                char caracter;
                try {
                    textoCifrar = textoCifrar.toLowerCase();
                    for(int i = 0; i < textoCifrar.length(); i++){
                    caracter = textoCifrar.charAt(i);
                    int pos = cifrado.indexOf(caracter);
                    if(pos == -1){
                        textoCifrado += caracter;
                    }else{
                        textoCifrado += cifrado.charAt((pos + num )% cifrado.length());
                    }
                }
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            resultado.setText(textoCifrado);
            }
            
        });
    }
    
}
   