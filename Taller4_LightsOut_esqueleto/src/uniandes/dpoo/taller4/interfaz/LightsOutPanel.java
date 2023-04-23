package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LightsOutPanel extends JPanel implements MouseListener {
	    private boolean[][] lights;

	    public static void main(String[] args) throws Exception {
	        JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setTitle("Lights Out!");
	        frame.setResizable(false);
	        frame.setVisible(true);

	        LightsOutPanel panel = new LightsOutPanel();
	        if (panel.lights == null) {
	            System.out.println("You did not initialize your light array!" +
	                               "It's still null...");
	            System.exit(-1);
	        }
	        panel.addMouseListener(panel);
	        panel.setPreferredSize(new Dimension(601, 501));
	        panel.setMinimumSize(new Dimension(601, 501));

	        Container c = frame.getContentPane();
	        c.setLayout(new BorderLayout());
	        c.add(panel, BorderLayout.CENTER);
//ME FALTA EL PACK 
	        frame.pack();
	    }

	    public LightsOutPanel() {
	        lights = new boolean[5][6];
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 6; j++) {
	                lights[i][j] = true;
	            }
	        }

	    }

	    // unused methods
	    public void mouseClicked(MouseEvent e) {}

	    public void mouseReleased(MouseEvent e) {}

	    public void mouseEntered(MouseEvent e) {}

	    public void mouseExited(MouseEvent e) {}

	    public void paint(Graphics g) {
	        int boxWidth = 600 / 6;
	        int boxHeight = 500 / 5;

	        int y = 0;
	        for (int row = 0; row < 5; row++) {
	            int x = 0;
	            for (int col = 0; col < 6; col++) {
	                if (lights[row][col]==true) {
	                    g.setColor(Color.YELLOW);
	                } else {
	                    g.setColor(Color.BLACK);
	                }
	                g.fillRect(x, y, boxWidth, boxHeight);

	                g.setColor(Color.BLUE);
	                g.drawRect(x, y, boxWidth, boxHeight);
	                x += boxWidth;
	            }
	            y += boxHeight;
	        }
	    }

	    // called when the mouse is pressed - determines what row/column the user
	    // has clicked
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
	        System.out.println('H');
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
	}

