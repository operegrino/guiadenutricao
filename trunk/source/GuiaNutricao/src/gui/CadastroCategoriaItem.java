package gui;

import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;

public class CadastroCategoriaItem extends MainForm {

	private Label lCodCategoria;
	private TextField txCodCategoria;
	private Label lNomeCategoria;
	private TextField txNomeCategoria;
	
	// private static final int OK_COMMAND = 5;
	 private static final Command okCommand = new Command("OK");
	
	
	public CadastroCategoriaItem(){
		
	}
	
	public CadastroCategoriaItem(String title){
		this.setTitle(title);
		
		this.lCodCategoria = new Label("Codigo: ");
		this.txCodCategoria = new TextField();
		this.lNomeCategoria = new Label("Nome: ");
		this.txNomeCategoria = new TextField();
		
		
		this.addComponent(this.lCodCategoria);
		this.addComponent(this.txCodCategoria);
		this.addComponent(this.lNomeCategoria);
		this.addComponent(this.txNomeCategoria);
		
		this.txCodCategoria.setEditable(false);
		this.txCodCategoria.setSize(getPreferredSize());
		this.txNomeCategoria.setFocus(true);
		
		this.addCommand(okCommand);
		this.show();
		
		
	}
	
	public void actionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
     // if(evt.getSource() == okCommand){}
        
     
    }
	protected void execute(Form f) {
		// TODO Auto-generated method stub

	}

}
