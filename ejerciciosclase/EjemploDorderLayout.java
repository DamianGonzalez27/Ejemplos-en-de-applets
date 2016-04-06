package ejerciciosclase;
import java.awt.*;
import java.applet.*;

//By Erick Damian Gonzalez Aranda

public class EjemploDorderLayout extends Applet{
	public Button boton1 = new Button("Accion1");
	public Button boton2 = new Button("Accion2");
	public Button boton3 = new Button("Accion3");
	public Button boton4 = new Button("Accion4");
	public Button boton5 = new Button("Accion5");
	
	
public void init(){
		
		setLayout(new BorderLayout());
		add("North",boton1);
		add("South",boton2);
		add("East",boton3);
		add("West",boton4);
		add("Center",boton5);
		
	}

}
