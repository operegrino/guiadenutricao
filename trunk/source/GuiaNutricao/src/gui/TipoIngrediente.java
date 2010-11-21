package gui;

import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;

public class TipoIngrediente extends MainForm {
	
    Label lNomeIngrediente;
    TextField txNomeIngrediente;
    


	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}
	
	public TipoIngrediente(){}
	public TipoIngrediente(String nome)
	{
		super();
		this.setTitle(nome);
		
		lNomeIngrediente  = new Label("Nome do Ingrediente");
		txNomeIngrediente = new TextField();
		
		this.addComponent(lNomeIngrediente);
		this.addComponent(txNomeIngrediente);
		this.show();
	}
	
	

}
