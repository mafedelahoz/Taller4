package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelDiseno extends JPanel {
	
	//Atributos 
	private InterfazLights principal;
	
	//Atributos interfaz  
	
	/** Etiqueta de tamaño **/
	private JLabel lblTamano;
	
	/** Etiqueta de dificultad **/
	private JLabel lblDificultad;
	
	/** ComboBox de tamaños **/
	private JComboBox tamaños;
	
	/** RadioButton dificultades **/
	private JRadioButton facil;
	private JRadioButton medio;
	private JRadioButton dificil;


	
	//Constructor
	
	public PanelDiseno(InterfazLights pPrincipal) {
		
		principal = pPrincipal;
		
		setLayout(new BorderLayout());
		JPanel disenoJuego= new JPanel();
		add(disenoJuego, BorderLayout.CENTER);
		
		disenoJuego.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        disenoJuego.setLayout(new GridLayout(1,1,2,2));
        
        lblTamano = new JLabel("Tamaño: ");
        lblDificultad = new JLabel("Dificultad: ");
        disenoJuego.add(lblTamano);
        tamaños = new JComboBox();
        tamaños.addItem("5x5");
        tamaños.addItem("6x6");
        tamaños.addItem("7x7");
        tamaños.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				//tf.setText(tamaños.getSelectedItem().toString());
			}
        });
        disenoJuego.setBackground(Color.WHITE);
        disenoJuego.add(tamaños);
        disenoJuego.add(lblDificultad);
        facil = new JRadioButton("Fácil",true);
        medio = new JRadioButton("Medio",false);
        dificil = new JRadioButton("Difícil",false);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(facil);
        grupo.add(medio);
        grupo.add(dificil);
        disenoJuego.add(facil);
        disenoJuego.add(medio);
        disenoJuego.add(dificil);
        
        
	}
	

}
