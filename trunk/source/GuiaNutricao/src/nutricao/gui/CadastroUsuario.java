package nutricao.gui;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class CadastroUsuario extends MIDlet implements CommandListener {

	public CadastroUsuario() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

    /** Indicates if the application is initialized. */
    private boolean isInitialized = false;
    
    /** The number of characters in numeric text field. */
    private static final int NUM_SIZE = 20;
    
    /** A text field to keep the result of calculation. */
    private final TextField tr = new TextField("Nome", "", NUM_SIZE, TextField.ANY);

    /** Soft button for exiting the game. */
    private final Command exitCmd = new Command("Exit", Command.EXIT, 2);

	
	protected void startApp() throws MIDletStateChangeException {
		if (isInitialized) {
            return;
        }
		
		Form f = new Form("Guia de Nutrição");
		f.append(tr);
		f.addCommand(exitCmd);
		Display.getDisplay(this).setCurrent(f);
		isInitialized = true;
		

	}

	public void commandAction(Command c, Displayable d) {
		if (c == exitCmd) {
            destroyApp(false);
            notifyDestroyed();

            return;
        }
		
	}

}
