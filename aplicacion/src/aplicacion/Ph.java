package aplicacion;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public final class Ph extends Window{
	
	protected JLabel labelSueloAc, labelSueloAlc,tituloPh,infoPh;
	protected GridLayout gl;
	
	public Ph() {
		super("Ph");
		crearElementos();
		modElementos();
		agregarAlPanel();
		
		ponerPanel(panel);
	}
	
	@Override
	public void crearElementos() {
		gl = new GridLayout(2,2);
		panel = new JPanel();
		labelSueloAc = new JLabel("Suelo Acido");
		labelSueloAlc = new JLabel("Suelo Alcanino");
		tituloPh = new JLabel("PH");
		infoPh = new JLabel("Medida del grado de acidez o alcalinidad de una sustancia o una solución. El pH se mide en una escala de 0 a 14.");
	}
	
	@Override
	public void modElementos() {
		//panel.setLayout(gl);
		panel.setLayout(null);
		labelSueloAc.setSize(100, 100);
		labelSueloAc.setAlignmentX(CENTER_ALIGNMENT);
		labelSueloAc.setAlignmentY(CENTER_ALIGNMENT);
		
		
	}
	
	@Override
	public void agregarAlPanel() {
		panel.add(labelSueloAc);
		panel.add(labelSueloAlc);
	}
}
