package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelOpciones extends JPanel implements ActionListener{
	
	//Constantes
	
	/** Comando para inicializar el juego **/
	
	private static final String NUEVO="NUEVO";
	
	/** Comando para reiniciar el juego **/
	
	private static final String REINICIAR="REINICIAR";
	
	/** Comando para mostrar el Top 10 **/
	
	private static final String TOP10="TOP10";
	
	/** Comando para cambiar de jugador **/
	
	private static final String CAMBIAR_JUGADOR="CAMBIAR_JUGADOR";
	
	//Atributos 
	
	/** Ventana principal de la aplicación **/
	
	private InterfazLights principal;
	
	/** Botones con las opciones **/
	 
	private JButton botonNuevo;
	private JButton botonReiniciar;
	private JButton botonTop10;
	private JButton botonCambiarJugador;
	private JTextField nombre;
	
	//Constructores
	
	public PanelOpciones( InterfazLights interfazLights) {
		
		principal= interfazLights;
		
		setBorder(new TitledBorder("Opciones") );
		setLayout(new GridLayout(4,4));
		
		botonNuevo= new JButton("Nuevo juego");
		//botonNuevo.setSize(5,5);
		botonNuevo.setActionCommand(NUEVO);
		botonNuevo.addActionListener(this);
		add(botonNuevo);
		
		botonReiniciar= new JButton("Reinicar juego");
		botonReiniciar.setActionCommand(REINICIAR);
		//botonReiniciar.setSize(5,5);
		botonReiniciar.addActionListener(this);
		add(botonReiniciar);
		
		botonTop10= new JButton("Top 10");
		botonTop10.setActionCommand(TOP10);
		
		//botonTop10.setSize(5,5);
		botonTop10.addActionListener(this);
		add(botonTop10);
		
		botonCambiarJugador= new JButton("Cambiar jugador");
		botonCambiarJugador.setActionCommand(CAMBIAR_JUGADOR);
		//botonCambiarJugador.setSize(5,5);
		botonCambiarJugador.addActionListener(this);
		add(botonCambiarJugador);
	}
	
	//Métodos 
	
	/**
     * Manejo de los eventos de los botones.
     * @param pEvento Acción que generó el evento.
     */
	
	public void ActionPerformed(ActionEvent pEvento) {
		
		String comando= pEvento.getActionCommand();
		if (comando.equals(NUEVO)) {
			principal.nuevo();
		}
		else if( comando.equals(REINICIAR)){
            principal.reiniciar();
        }
        else if( comando.equals(TOP10)){
            principal.top10();
        }
        else if( comando.equals(CAMBIAR_JUGADOR) )
        {
            principal.cambiarJugador();
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	}
	
	
	
	
	


