package gui;

import java.io.IOException;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import com.sun.lwuit.Command;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;

import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.FlowLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;


public class MainForm extends MIDlet implements ActionListener{

	Form f;  	  
	Command exitCommand;  	
	
	public MainForm() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {

            Display.init(this);
	    
	    // TEMA  
	    try {  
                Resources r = Resources.open("/tema/javaTheme.res");
	        UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));  
	    } catch (IOException ioe) {  
	         System.out.println("Não foi possível carregar o tema.");
	    }  
	    
	    //cria um form  
	    f = new Form("MainForm");
	    f.setLayout(new FlowLayout());                     
                     
	    //comando sair  
	    exitCommand = new Command("Sair");  
	    f.addCommand(exitCommand);  
	    f.setCommandListener(this);
		   
	   //mostra o form  
	   f.show();  
	}

	public void actionPerformed(ActionEvent e) {
	
	  if(e.getSource() == exitCommand){
              notifyDestroyed(); //notifica a destru���o da aplica��o ao gerenciador
	      try {
                 destroyApp(true);
	      } catch (MIDletStateChangeException e1) {
                 e1.printStackTrace();
	      }
	  }
		
	}

}
