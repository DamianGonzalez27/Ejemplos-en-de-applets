package ejerciciosclase;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

/*By Erick Damian Gonzalez Aranda */

/*En este programa se usa un aplet con unos botones para que el usuario pueda seleccionar 
 * y desifrar la personalidad del programador*/


public class ejercicio1 extends Applet{

/*Aqui estamos creando 2 etiquetas para que los usuarios sepan usar el programa*/
	
 Label etiqueta1 = new Label("Mi personalidad");
 Label etiqueta2 = new Label ("Selecciona una opcion");
 
 /*Aqui vamos a generar los botones que el usuario va a poder seleccionar*/
 
 Button boton1 = new Button("Cualidad 1");
 Button boton2 = new Button("Cualidad 2");
 Button boton3 = new Button("Cualidad 3");
 
 /*Aqui vamos a crear los paneles que contendran a los botones que se usaran*/
 
 Panel panel1 = new Panel();
 Panel panel2 = new Panel();
 Panel panel3 = new Panel();
 
 //Esta metodo es el que se encarga de llamar los elementos y posteriormente mostrarlos
 public void init(){
	 
	 /*Aqui esta el layout de la ventana*/
	 setLayout(new BorderLayout());
	 /*Aqui estamos agregando a los paneles las etiquetas que generamos */
	 panel1.add(etiqueta1);
	 panel2.add(etiqueta2);
	 
	 /*Jugando un poco haremos que la etiqueta 2 aparesca en cuanto precionamos en ella*/
	 
	 
	 
	 /*Aqui vamos a darle un evento a cada boton para poder ser usados*/
	 boton1.addActionListener(new ButtonHandler());
	 boton2.addActionListener(new ButtonHandler());
	 boton3.addActionListener(new ButtonHandler());
	 
	 
	 /*Aqui vamos a meter los botones en los paneles correspondientes */
	 panel3.add(boton1);
	 panel3.add(boton2);
	 panel3.add(boton3);
	 
	 /*Aqui vamos a darle la orientacion a los paneles*/
	 add("North", panel1);
	 add("Center", panel2);
	 add("South", panel3);
	 
	 
	 
	 
 }
 
 /*Con esta clase se activan los eventos de los botones que se conienen en los paneles*/
 class ButtonHandler implements ActionListener{
	 
	 public void actionPerformed(ActionEvent evt){
		 
		 String bot=evt.getActionCommand();
		 etiqueta2.setText(bot);
		 
	 }
	 
 }
 
}





                             



