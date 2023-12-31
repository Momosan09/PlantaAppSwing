package aplicacion;


import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class Window extends JFrame{
  public JPanel panel = new JPanel();

  public Window(String titulo){
    //setExtendedState(JFrame.MAXIMIZED_BOTH); //pantalla completa
    setSize(700,700);
    setLocationRelativeTo(null);
    //setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle(titulo);
    setResizable(true);
    setEnabled(true);
    setVisible(true);
    
    this.getContentPane().add(panel);//poner panel
    //setExtendedState(JFrame.MAXIMIZED_BOTH);
  }
  
  public abstract void crearElementos();
  
  public abstract void modElementos();
  
  public abstract void agregarAlPanel();

}
