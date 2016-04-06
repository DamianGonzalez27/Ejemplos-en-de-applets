package ejerciciosclase;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//By Erick Damian Gonzalez Aranda

public class Texto extends Applet{
	/*Aqui vamos a crear los objetos que usaremos en el applet*/
	TextField campoTexto = new TextField();
	TextArea campoArea = new TextArea();
	Button agregar = new Button("Agregar");
	Button limpiar = new Button("Limpiar");
	public void init(){

		/*Aqui vamos a quitar el layout del applet*/
		setLayout(null);
		
		/*Le damos las coordenadas de en donde colocaremos los objetos al applet*/
		campoTexto.setBounds(10,10,250,30);
		campoArea.setBounds(10,50,250,150);
		agregar.setBounds(10,200,80,30);
		limpiar.setBounds(100,200,80,30);
		
		/*Aqui vamos a agregar los manejadores de eventos a los botones*/
		agregar.addActionListener(new ButtonHandler());
		limpiar.addActionListener(new ButtonHandler());
		
		/*Agregamos los objetos al applet*/
		add(campoTexto);
		add(campoArea);
		add(agregar);
		add(limpiar);
		
		
	}
	
	class ButtonHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent evt){
		
			String bot=evt.getActionCommand();
			if(bot.equals("Agregar")){
				
				String text = campoArea.getText()+campoTexto.getText();
				campoArea.setText(text);
			}else if (bot.equals("Limpiar"))campoArea.setText("");
			
		}
	
	}

}
