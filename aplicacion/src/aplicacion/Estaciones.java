package aplicacion;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Estaciones extends Window{


	JLabel titulo, horasLuz;
	
	public Estaciones(){
		super("Estaciones");
		
		crearElementos();
		modElementos();
		agregarAlPanel();
		
	}
	
	@Override
	public void crearElementos() {
		titulo = new JLabel();
		horasLuz = new JLabel();
	}
	
	@Override
	public void modElementos() {
		titulo.setText("Estaciones");
		titulo.setSize(30, 20);
		titulo.setAlignmentX(BOTTOM_ALIGNMENT);
		
		horasLuz.setText("Horas de luz: ");


		//horasLuz.setAlignmentY(CENTER_ALIGNMENT);
		
		//titulo.setBounds(this.getWidth()/2,20,200,20);
	}
	
	@Override
	public void agregarAlPanel() {
		//panel.add(titulo);
		panel.add(titulo);
	}
}
