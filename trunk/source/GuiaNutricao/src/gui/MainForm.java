package gui;

import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;


public abstract class MainForm extends Form {
  	  
	Command exitCommand;  
	private GuiaNutricaoMIDlet parent;
	
	/**
     * returns the name of the demo to display in the list
     */
    //public abstract String getName();
    
    public MainForm(){
    	this.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
    }
	
	public MainForm(GuiaNutricaoMIDlet parent, String title) {

		this.parent = parent;
//	    this.setTitle(title);
	    this.setLayout(new BoxLayout(BoxLayout.Y_AXIS));

	}

	public final void run(final Command backCommand, ActionListener commandListener, Form formulario) {
        System.gc();
        //final Form mainForm = new Form(getName());
        
        formulario.addCommand(new Command("Help") {
            public void actionPerformed(ActionEvent evt) {
                Form helpForm = new Form("Help");
                helpForm.setLayout(new BorderLayout());
                TextArea helpText = new TextArea(getHelpImpl(), 5, 10);
                helpText.setEditable(false);
                helpForm.addComponent(BorderLayout.CENTER, helpText);
                Command c = new Command("Back") {
                    public void actionPerformed(ActionEvent evt) {
                    	//mainForm.show();
                    }
                };
                helpForm.addCommand(c);
                helpForm.setBackCommand(c);
                helpForm.show();
            }
        });
        formulario.addCommand(backCommand);
        formulario.addCommandListener(commandListener);
        formulario.setBackCommand(backCommand);
        execute(formulario);
        formulario.show();
    }
	
	/**
     * The demo should place its UI into the given form 
     */
    protected abstract void execute(Form f);
	
    /**
     * Returns the text that should appear in the help command
     */
    private String getHelpImpl() {
        String h = getHelp();
        return UIManager.getInstance().localize(h, h);
    }

    /**
     * Returns the text that should appear in the help command
     */
    protected String getHelp() {
        // return a key value for localization
        String n = getClass().getName();
        return n.substring(n.lastIndexOf('.') + 1) + ".help";
    }
    
    public void cleanup() {
    	
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
