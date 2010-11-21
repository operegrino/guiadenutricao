package gui;

import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;

public class TipoIngrediente extends MainForm {
	
    Label lNomeIngrediente;
    TextField txNomeIngrediente;
    


	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}
	
	public TipoIngrediente()
	{
		super();
		this.setTitle(this.getName());
		
		lNomeIngrediente  = new Label("Nome do Ingrediente");
		txNomeIngrediente = new TextField();
		
		this.addCommandListener(this);
		this.addComponent(lNomeIngrediente);
		this.addComponent(txNomeIngrediente);
		this.show();
	}

	public String getName() {		
		return "Tipo de Ingrediente";
	}

	public void actionPerformed(ActionEvent e) {
		Command cmd = e.getCommand();
		switch (cmd.getId()) {
		case RUN_COMMAND:{
			System.out.println("click.entrou: "+this.getName());
			break;
		}
		case BACK_COMMAND:{
			MainForm f = Menu.getSingleton();
			f.show();
			break;
		}
		default:{}
		}
		
		
	}
	
	

}
