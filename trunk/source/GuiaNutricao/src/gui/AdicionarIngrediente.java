package gui;

import negocio.ControladorCategoriaItem;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;

public class AdicionarIngrediente extends MainForm{

	private Label lNome;
	private TextField txNome;
	private Label lValorCalorico;
	private TextField txValorCalorico;
	private Label lTpIngrediente;
	private ComboBox cbTpIngrediente;
	private Label lPorcaoGrama;
	private TextField txPorcaoGrama;
	private String [] arrayCatg;
	private ControladorCategoriaItem ctrlCatg = new ControladorCategoriaItem();
	
	public AdicionarIngrediente()
	{
		super();
		this.setTitle(this.getName());
		this.addCommandListener(this);
		
		lNome           = new Label("Nome");
		txNome          = new TextField();
		lValorCalorico  = new Label("Valor Calorico");
		txValorCalorico = new TextField();
		lTpIngrediente  = new Label("Tipo de Ingrediente");
		
		arrayCatg = this.ctrlCatg.consultarTodasCategoriasItens();
		this.cbTpIngrediente = new ComboBox(arrayCatg);
		
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
	public String getName() {		
		return "Adicionar Ingrediente";
	}

	public void actionPerformed(ActionEvent e) {
		Command cmd = e.getCommand();
		switch (cmd.getId()) {
		case RUN_COMMAND:{
			System.out.println("click.entrou");
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
