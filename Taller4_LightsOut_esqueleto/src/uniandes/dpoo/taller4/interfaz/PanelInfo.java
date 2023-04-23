package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelInfo extends JPanel {

	//Atributos
	private InterfazLights principal;
	private PanelLights juego;
	
	//Atributos de interfaz
	/** Etiqueta jugadas **/
	private JLabel lblJugadas;
	
	/** Etiqueta jugador **/
	private JLabel lblJugador;
	
	/** Campo con las jugadas **/
	private JTextField txtJugadas;
	
	/** Campo con el jugador **/
	private JTextField txtJugador;

	
	//Constructores
	
	public PanelInfo( InterfazLights pPrincipal) {
		principal = pPrincipal;
		
		setBorder(new TitledBorder("Información") );
		setLayout(new BorderLayout());
		JPanel datosJuego= new JPanel();
		add(datosJuego, BorderLayout.CENTER);
		
		datosJuego.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        datosJuego.setLayout(new GridLayout(1,1,2,2));
        
        lblJugadas = new JLabel("Jugadas: ");
        txtJugadas = new JTextField(1);
        txtJugadas.setText(principal.Jugadas());
        //txtJugadas.setEditable(false);
        datosJuego.add(lblJugadas);
        datosJuego.add(txtJugadas);
        
        lblJugador = new JLabel("Jugador: ");
        txtJugador = new JTextField(1);
        txtJugador.setText("Prueba");
        //txtJugador.setEditable(false);
        datosJuego.add(lblJugador);
        datosJuego.add(txtJugador);
        
	}
	public void actualizar() {
	   txtJugadas.setText(principal.Jugadas());
		}
	}

