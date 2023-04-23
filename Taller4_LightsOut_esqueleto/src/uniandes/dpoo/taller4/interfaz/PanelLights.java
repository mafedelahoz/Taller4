package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelLights extends JPanel implements MouseListener {
	
	private boolean lights[][];
	
	private PanelInfo info;
	// Atributos 
	
	private InterfazLights principal;
	private Vector v;
	int jugadas = 0;

	
	//Constructor 
	
	public PanelLights(InterfazLights pPrincipal) {
		addMouseListener(this);
		v = new Vector();
		principal = pPrincipal;	     
		setBorder( new CompoundBorder( new EmptyBorder( 15, 15, 60, 15 ), new TitledBorder( "" ) ) );
		lights = new boolean[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                lights[i][j] = true;
            }
        }
    }
	

	
	//Paint cuadrícula 
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		/** Agregar el mouselistener **/
		GradientPaint yellow2 = new GradientPaint(50, 50, Color.YELLOW,
		300, 100, Color.WHITE);
		GradientPaint gray2= new GradientPaint(50,50,Color.GRAY,300,100,Color.WHITE);
		g2d.setPaint(Color.yellow);
		// Base de la cuadrícula
		Rectangle2D.Double rectangle=
		new Rectangle2D.Double(26,16,370,370);
		g2d.setColor(Color.black);
		g2d.draw(rectangle);
		g2d.fill(rectangle);

						
		//Casillas
		for (int j=0;j<6;j++) {
		for (int pos=40;pos<380;pos=pos+70) {
		for(int pos2=30;pos2<320;pos2=pos2+70) {
		Rectangle2D.Double casilla=
			new Rectangle2D.Double(pos,pos2,60,60);
		g2d.setPaint(yellow2);
		g2d.draw(casilla);
		g2d.fill(casilla);	
	}}}
				
	}
	
	public String darJugadas() {
		String jugadas1= String.valueOf(jugadas);
		return jugadas1;
	}
	@Override
	public void mouseClicked(MouseEvent e) {  
			  v.add(e.getPoint());	
			  jugadas=jugadas+ 1;
			  repaint();
		}
		
	

	@Override
	public void mousePressed(MouseEvent e) {
		 int mouseX = e.getX();
	        int mouseY = e.getY();

	        int panelWidth = getWidth();
	        int panelHeight = getHeight();

	        int boxWidth = panelWidth / lights[0].length;
	        int boxHeight = panelHeight / lights.length;

	        int col = mouseX / boxWidth;
	        int row = mouseY / boxHeight;

	        toggle(row, col);
	        repaint();
	    }

	    // called to "toggle" the selected row and column, as well as the four
	    // adjacent lights
	    public void toggle(int row, int col) {

	        if (row >= 0 && col >= 0 && row < lights.length && 
	            col < lights[0].length)
	        {
	            if (lights[row][col] = true) {
	                lights[row][col] = false;
	            } else {
	                lights[row][col] = true;
	            }
	        }

	    }
		// TODO Auto-generated method stub

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
