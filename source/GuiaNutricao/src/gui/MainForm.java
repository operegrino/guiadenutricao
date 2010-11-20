package gui;

import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;


public class MainForm extends Form implements ActionListener{

	Form f;  	  
	Command exitCommand;  	
	
	public MainForm() {
		// TODO Auto-generated constructor stub

            // TEMA
		/*
	    try {
                Resources r = Resources.open("/tema/javaTheme.res");
	        UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
	    } catch (IOException ioe) {
	         System.out.println("Não foi possível carregar o tema.");
	    }

	    //cria um form
	    f = new Form("Guia de Nutrição");
            f.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
*/
	   //mostra o form
	   f.show();

	}

	public void actionPerformed(ActionEvent e) {
	
//	  if(e.getSource() == exitCommand){
//              notifyDestroyed(); //notifica a destru���o da aplica��o ao gerenciador
//	      try {
//                 destroyApp(true);
//	      } catch (MIDletStateChangeException e1) {
//                 e1.printStackTrace();
//	      }
//	  }

		
	}


}
