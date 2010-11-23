package gui;

import java.io.IOException;
import java.util.Hashtable;

import com.sun.lwuit.Button;
import com.sun.lwuit.ButtonGroup;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.RadioButton;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.Style;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import gui.MainForm;


public class GuiaNutricaoMIDlet extends MIDlet implements ActionListener{

	private static MainForm form;
	
	private static final int EXIT_COMMAND = 1;
    private static final int RUN_COMMAND = 2;
    private static final int BACK_COMMAND = 3;
    private static final int ABOUT_COMMAND = 4;
    
    private static final Command runCommand = new Command("Entrar", RUN_COMMAND);
    private static final Command exitCommand = new Command("Sair", EXIT_COMMAND);
    private static final Command backCommand = new Command("Voltar", BACK_COMMAND);
    private static final Command aboutCommand = new Command("Sobre", ABOUT_COMMAND);
   
    private static int selectedIndex  = 0;    
    private final ButtonGroup btGroup = new ButtonGroup();
    
	
	public GuiaNutricaoMIDlet() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}
	
	private RadioButton createRB(String label, ButtonGroup g, Form f) {
        RadioButton b = new RadioButton(label);        
        g.add(b);
        f.addComponent(b);
        return b;
    }
	

	private void AddCommands(Form f)
	{
		f.addCommand(runCommand);
		f.addCommand(exitCommand);
		f.addCommand(backCommand);
		f.addCommand(aboutCommand);		
        		
	}
	
	private void AddCommandCadBasico(Form f)
	{
		f.addCommand(runCommand);
		f.addCommand(backCommand);
	}
    
	
	protected void startApp() throws MIDletStateChangeException {
		
		Display.init(this);
		
		try {
            Resources r = Resources.open("/theme/LWUITtheme.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));	        
        } catch (IOException ioe) {
            System.out.println("Não foi possível carregar o tema.");
        }
        
        
        form = Menu.getSingleton();                
        createRB("Adicionar Ingrediente", btGroup, form);
        createRB("Monitor Dieta", btGroup, form);
        createRB("Montar Prato", btGroup, form);
        createRB("Perfil Usuário", btGroup, form);
        createRB("Tipo Ingrediente", btGroup, form);
        createRB("Consultar Calorias", btGroup, form);
        createRB("Refeição", btGroup, form);        
        createRB("Relatório", btGroup, form);
        
        btGroup.setSelected(selectedIndex);        
        
        this.AddCommands(form);
		form.addCommandListener(this);		
		form.show();

	}


	public void actionPerformed(ActionEvent evt) {
		
		Command cmd = evt.getCommand();		
        switch (cmd.getId()) {
        
        case RUN_COMMAND:
        	switch(btGroup.getSelectedIndex())
			{        	   
				case 0:{
				    form = new AdicionarIngrediente();	
				    AddCommandCadBasico(form);
					break;
				}
				case 1:{
					form = new MonitorDieta();
					AddCommandCadBasico(form);
					break;
				}
				case 2:{
					form = new MontarPrato();
					AddCommandCadBasico(form);
					break;
				}
				case 3:{
					form = new PerfilUsuario();
					AddCommandCadBasico(form);
					break;
				}
				case 4:{
					form = new TipoIngrediente();
					AddCommandCadBasico(form);
					break;
				}
				case 5:{
					//form = new ConsultarCaloriasItens("Consultar Kcal");
					AddCommandCadBasico(form);
					break;
				}
				case 6:{
					form = new Refeicao();
					AddCommandCadBasico(form);
					break;
				}
				default:{
					System.out.println("default");
					break;
				}
			}
			selectedIndex = btGroup.getSelectedIndex();			
            break;
        case EXIT_COMMAND:
            notifyDestroyed();
            break;
        case BACK_COMMAND:
//            currentDemo.cleanup();
//            mainMenu.refreshTheme();
//            mainMenu.show();

            // for series 40 devices
//            System.gc();
//            System.gc();
            break;
        case ABOUT_COMMAND:
            Form aboutForm = new Form("Sobre");
            aboutForm.setScrollable(false);
            aboutForm.setLayout(new BorderLayout());
            TextArea aboutText = new TextArea(getAboutText(), 5, 10);
            aboutText.setEditable(false);
            aboutForm.addComponent(BorderLayout.CENTER, aboutText);
            aboutForm.addCommand(new Command("Back") {
                public void actionPerformed(ActionEvent evt) {
                    form.show();
                }
            });
            aboutForm.show();
            break;        
    }
    
		
		
	}
	
	private String getAboutText() {
        return "Sobre o Guia de Nutrição";
    }

	

}
