package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class InterfazLights extends JFrame {
	
	//Atributos 
	
	private PanelLights panelLights;
	
	private PanelOpciones panelOpciones;
	
	private PanelInfo panelInfo;
	
	private PanelDiseno panelDiseno;
	
	//Constructor 
	
	public InterfazLights() {
		
		setTitle( "Lights-Out" );
        setSize( 600, 600 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        panelLights = new PanelLights(this);
        panelOpciones = new PanelOpciones(this);  
        panelDiseno = new PanelDiseno(this);
        setLayout( new BorderLayout( ) );   
        add( panelLights, BorderLayout.CENTER );
        add( panelOpciones, BorderLayout.EAST );
        add(panelDiseno, BorderLayout.NORTH);
        
        JPanel panelInfo1 = new JPanel( );
        panelInfo1.setLayout( new GridLayout( 2, 2 ) );
        panelInfo = new PanelInfo(this);
        panelInfo1.add(panelInfo);
        
        add(panelInfo1,BorderLayout.SOUTH );

        setLocationRelativeTo( null );
        setResizable( false );}

	public String Jugadas() {
		return panelLights.darJugadas();
	}
	
	//Método main
	public static void main( String[] pArgs )
    {
        try
        {
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

            InterfazLights i = new InterfazLights( );
            i.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }
}


