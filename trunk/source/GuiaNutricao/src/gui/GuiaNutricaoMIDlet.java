package gui;

import java.io.IOException;
import java.util.Hashtable;

import com.sun.lwuit.Command;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;

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
    
    private static final MainForm[] Tela = {
//    	new PerfilUsuario("Perfil do Usuário"), new MontarPrato("Montar Prato")
//         PERFIL_USUARIO, MONTAR_PRATO
//        new TransitionDemo(), new FontDemo(), new TabbedPaneDemo(), new DialogDemo(), new LayoutDemo(), new ScrollDemo()
    };
    
    private MainForm currentDisplay;
    private Hashtable MainFormHash = new Hashtable();
    private static MainForm formPrincipal;
	
	public GuiaNutricaoMIDlet() {
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
		
		try {
            Resources r = Resources.open("/tema/javaTheme.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));	        
        } catch (IOException ioe) {
            System.out.println("Não foi possível carregar o tema.");
        }
		
        //form = new Menu("Tela Inicial");
        //form = new PerfilUsuario("Perfil do Usuário");
        //form = new MontarPrato("Montar Prato");
		//form = new TipoIngrediente("Tipo de Ingrediente");
		//form = new AdicionarIngrediente("Adicionar Ingrediente");
		//form = new MonitorDieta("Monitor da Dieta Alimentar");  
        //form = new CadastroCategoriaItem("Cadastro de Categoria Itens");
        //form = new CadastroItens("Cadastrar Item");
        form = new ConsultarCaloriasItens("Consultar Calorias");
        /*
        for(int i=0; i<Tela.length; i++)
        {        	
        	form.addComponent(new CheckBox(Tela[i]));
        }
        */        
		form.addCommand(runCommand);
		form.addCommand(exitCommand);
		form.addCommand(backCommand);
		form.addCommand(aboutCommand);
		form.addCommandListener(this);
		form.show();

	}
	
	void setTelaInicial()
	{
		formPrincipal = new MainForm(this,"Tela Principal") {
			
			protected void execute(Form f) {
				// TODO Auto-generated method stub
				
			}
		};
		
		// chamada das telas
	}

	public void actionPerformed(ActionEvent evt) {
		
		Command cmd = evt.getCommand();
        switch (cmd.getId()) {
        case RUN_COMMAND:
//            currentDemo = ((Demo) (demosHash.get(mainMenu.getFocused())));
//            currentDemo.run(backCommand, this);        	
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
//                    form.show();
                }
            });
            aboutForm.show();
            break;        
    }
    
		
		
	}
	
	private String getAboutText() {
        return "Sobre o Guia de Nutricao";
    }

	

}
