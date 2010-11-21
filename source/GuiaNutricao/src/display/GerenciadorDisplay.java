package display;

import java.util.Stack;

import javax.microedition.lcdui.Display;
//import com.sun.lwuit.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class GerenciadorDisplay {

	private static GerenciadorDisplay instancia;
	private MIDlet midlet;
	private Display display;
	private Stack stack = new Stack();
	
	private GerenciadorDisplay() {
		
	}
	
	public static GerenciadorDisplay getInstancia()  {
		if (instancia==null)  {
			instancia = new GerenciadorDisplay();
	
		}
		return instancia;
	}
	
	public void setMIDlet(MIDlet midlet) {
		this.midlet = midlet;
		this.display = Display.getDisplay(midlet);
	}
	
	public void exibir(Displayable tela) {
		this.stack.push(tela);		
		this.display.setCurrent(tela);		
	}
	
	public void voltar() {
		// remove o ultimo elemento
		this.stack.pop();
		// exibe o elemento no topo atual
		Displayable telaAtual = (Displayable)this.stack.peek();
		this.display.setCurrent(telaAtual);
		
	}
	
}
