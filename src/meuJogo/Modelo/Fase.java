package meuJogo.Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image fundo;
	
	public Fase(){
		ImageIcon referencia = new ImageIcon("res\\background.jpg");
		fundo = referencia.getImage();
	}
	
	public void paint(Graphics g){
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		g.dispose();
	}
	

}
