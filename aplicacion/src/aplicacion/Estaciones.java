package aplicacion;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Estaciones extends Window{

	JLabel titulo;
	
	public Estaciones(){
		super("Estaciones");
		
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
		titulo.setSize(200, 20);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		
	}
	
	@Override
	public void agregarAlPanel() {
		panel.add(titulo);
	}
}
