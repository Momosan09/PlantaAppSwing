package aplicacion;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window extends JFrame{
  public JPanel panel = new JPanel();

  public Window(String titulo){
    //setExtendedState(JFrame.MAXIMIZED_BOTH); //pantalla completa

    setSize(700,700);
    setLocationRelativeTo(null);
    //setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle(titulo);
    setResizable(false);
    setEnabled(true);
    setVisible(true);
    
    //setExtendedState(JFrame.MAXIMIZED_BOTH);
  }

  public void ponerPanel(JPanel panel){
    panel.setLayout(null);
    this.getContentPane().add(panel);

  }


}
