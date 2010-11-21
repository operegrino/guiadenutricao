package gui;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;

public class AdicionarIngrediente extends MainForm{

	Label lNome;
	TextField txNome;
	Label lValorCalorico;
	TextField txValorCalorico;
	Label lTpIngrediente;
	ComboBox cbTpIngrediente;
	Label lPorcaoGrama;
	TextField txPorcaoGrama;
	
	public AdicionarIngrediente(){}
	public AdicionarIngrediente(String nome)
	{
		super();
		this.setTitle(nome);
		
		lNome           = new Label("Nome");
		txNome          = new TextField();
		lValorCalorico  = new Label("Valor Calorico");
		txValorCalorico = new TextField();
		lTpIngrediente  = new Label("Tipo de Ingrediente");
		String[] valor  = {"A", "B", "C"};
		cbTpIngrediente = new ComboBox(valor);
		lPorcaoGrama    = new Label("Porção em Grama");
		txPorcaoGrama   = new TextField();
		
		this.addComponent(lNome);
		this.addComponent(txNome);
		this.addComponent(lValorCalorico);
		this.addComponent(txValorCalorico);
		this.addComponent(lTpIngrediente);
		this.addComponent(cbTpIngrediente);
		this.addComponent(lPorcaoGrama);
		this.addComponent(txPorcaoGrama);
		
		this.show();
	}
	
	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}
	
	

}
