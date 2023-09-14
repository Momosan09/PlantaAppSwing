package aplicacion;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
		titulo.setSize(500, 20);
		titulo.setAlignmentX(CENTER_ALIGNMENT);
	}
	
	@Override
	public void agregarAlPanel() {
		panel.add(titulo);
	}
}
