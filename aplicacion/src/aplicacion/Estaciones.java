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
<<<<<<< HEAD
		titulo.setText("Estaciones");
		titulo.setBounds(this.getWidth()/2,20,200,20);
=======
		titulo.setSize(200, 20);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		
>>>>>>> 352bda254483e3204138ff216875ce0be951a2b2
	}
	
	@Override
	public void agregarAlPanel() {
		panel.add(titulo);
	}
}
