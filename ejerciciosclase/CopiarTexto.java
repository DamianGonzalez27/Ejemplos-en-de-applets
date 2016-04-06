package ejerciciosclase;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.print.attribute.TextSyntax;

import java.applet.*;

public class CopiarTexto extends Applet{
TextArea area1, area2;

public void init(){
	
	/*Aqui agregamos el tipo de layout que manejara el applet*/
	setLayout(new GridLayout(2,1));
	
	/*Aqui agregamos los campos al applet*/
	add(area1 = new TextArea());
	add(area2 = new TextArea());
	area1.addTextListener(new TextSyncAdapter(area2));
	area2.addTextListener(new TextSyncAdapter(area1));
}
class TextSyncAdapter implements TextListener{
	
	TextArea areaObjetivo;
	TextSyncAdapter(TextArea areaObjetivo){
		
		this.areaObjetivo = areaObjetivo;
	}
	public void textValueChanged(TextEvent evt){
		
		TextArea areaFuente =(TextArea)evt.getSource();
		if(!areaObjetivo.getText().equals(areaFuente.getText()));
		areaObjetivo.setText(areaFuente.getText());
	}
}
}
