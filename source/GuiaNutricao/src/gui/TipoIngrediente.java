package gui;

import negocio.ControladorCategoriaItem;
import classe.basica.CategoriaItem;

import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;

public class TipoIngrediente extends MainForm {
	
	private Label lNomeIngrediente;
    private TextField txNomeIngrediente;
    private ControladorCategoriaItem ctrlCategoria = new ControladorCategoriaItem(); 
    


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
			CategoriaItem ctgItem = new CategoriaItem();
			ctgItem.setNome(this.txNomeIngrediente.getText());
			ctrlCategoria.cadastrarCatgItem(ctgItem);
			
			MainForm form = Menu.getSingleton();
			form.show();
		
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
