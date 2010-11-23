package gui;

import negocio.ControladorCategoriaItem;
import classe.basica.Item;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;

public class AdicionarIngrediente extends MainForm{

	private Label lNome;
	private TextField txNome;
	private Label lVitamina;
	private TextField txVitamina;
	private Label lValorCalorico;
	private TextField txValorCalorico;
	private Label lTpIngrediente;
	private ComboBox cbTpIngrediente;
	private Label lPorcaoGrama;
	private TextField txPorcaoGrama;
	private String [] arrayCatg;
	private ControladorCategoriaItem ctrlCatg = new ControladorCategoriaItem();
	private Item item = new Item();
	
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
		this.lVitamina = new Label ("Vitamina");
		this.txVitamina = new TextField();
		
		this.addComponent(lNome);
		this.addComponent(txNome);
		this.addComponent(lValorCalorico);
		this.addComponent(txValorCalorico);
		this.addComponent(lTpIngrediente);
		this.addComponent(cbTpIngrediente);
		this.addComponent(lPorcaoGrama);
		this.addComponent(txPorcaoGrama);
		this.addComponent(lVitamina);
		this.addComponent(txVitamina);
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
			item.setNome(this.txNome.getText());
			item.setQtdPorcao(Integer.parseInt(this.txPorcaoGrama.getText()));
			item.setValorCalorico(Double.parseDouble(this.txValorCalorico.getText()));
			//int cod = UtilFuncoes.capturarId(this.cbTpIngrediente.getLabelForComponent().getText());
			//item.setCodCategoria(cod);
			System.out.println("01");
			item.setVitamina(this.txVitamina.getText());
			
			
			//Sucesso sucesso = new Sucesso("Item cadastrado com Sucesso!");
			//sucesso.show();
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
