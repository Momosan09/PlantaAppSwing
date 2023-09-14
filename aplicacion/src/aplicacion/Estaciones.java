package aplicacion;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Estaciones extends Window{

	JLabel titulo;
	
	public Estaciones(){
		super("Estaciones");
		panel = new JPanel();
		
		crearElementos();
		modElementos();
		agregarAlPanel();
		
		ponerPanel(panel);
	}
	
	@Override
	public void crearElementos() {
		titulo = new JLabel("Estaciones");
	}
	
	@Override
	public void modElementos() {
		titulo.setBounds(this.getWidth()/2,20,200,20);
	}
	
	@Override
	public void agregarAlPanel() {
		panel.add(titulo);
	}
}
