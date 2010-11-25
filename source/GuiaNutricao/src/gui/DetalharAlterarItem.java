package gui;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import negocio.ControladorCategoriaItem;
import negocio.ControladorItem;
import classe.basica.CategoriaItem;
import classe.basica.Item;

import com.sun.lwuit.Command;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;

public class DetalharAlterarItem extends MainForm {

	private Label lCod;
	private TextField txCod;
	private Label lNome;
	private TextField txNome;
	private Label lVitamina;
	private TextField txVitamina;
	private Label lValorCalorico;
	private TextField txValorCalorico;
	private Label lTpIngrediente;
	private TextField txTipoIngrediente;
	private Label lPorcaoGrama;
	private TextField txPorcaoGrama;
	private ControladorCategoriaItem ctrlCatg = new ControladorCategoriaItem();
    private ControladorItem ctrlItem = new ControladorItem();
	private Item item;
	
	public DetalharAlterarItem(Item item)
	{
		super();
		this.item = item;
		this.setTitle(this.getName());
		this.addCommandListener(this);
		
		lCod = new Label("Id");
		txCod = new TextField();
		lNome           = new Label("Nome");
		txNome          = new TextField();
		lValorCalorico  = new Label("Valor Calorico");
		txValorCalorico = new TextField();
		
		lTpIngrediente  = new Label("Tipo de Ingrediente");
		txTipoIngrediente = new TextField(); 		
		
		
		lPorcaoGrama    = new Label("Porção em Grama");
		txPorcaoGrama   = new TextField();
		this.lVitamina = new Label ("Vitamina");
		this.txVitamina = new TextField();
		
		adicionarComponentes();
		
		//setando item
		configurarCampos(item);
		
		configurarVisibilidade();
		
		criarComandos();
		
		this.show();
	}


	private void criarComandos() {
		Command back = new Command("Voltar") {
            public void actionPerformed(ActionEvent evt) {
            	
            	MainForm f = Menu.getSingleton();
    			f.show();
            	
            }
        };
        
    	Command ok = new Command("Excluir") {
            public void actionPerformed(ActionEvent evt) {
            	
            	try {
            		
					ctrlItem.excluirItem(item);
					Dialog.show("Atenção", "Item " +item.getNome()+ " excluido com sucesso.", "OK", null);
					MainForm f = Menu.getSingleton();
					f.show();
					
				} catch (RecordStoreNotOpenException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidRecordIDException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RecordStoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        };
        this.addCommand(back);
        this.addCommand(ok);
	}


	private void adicionarComponentes() {
		this.addComponent(this.lCod);
		this.addComponent(this.txCod);
		
		this.addComponent(lNome);
		this.addComponent(txNome);
		
		this.addComponent(lValorCalorico);
		this.addComponent(txValorCalorico);
		
		this.addComponent(lTpIngrediente);
		this.addComponent(txTipoIngrediente);
		
		this.addComponent(lPorcaoGrama);
		this.addComponent(txPorcaoGrama);
		this.addComponent(lVitamina);
		this.addComponent(txVitamina);
	}


	private void configurarCampos(Item item) {
		this.txCod.setText(item.getId()+"");
		this.txNome.setText(item.getNome());
		this.txPorcaoGrama.setText(item.getQtdPorcao()+"");
		this.txValorCalorico.setText(item.getValorCalorico()+"");
		this.txVitamina.setText(item.getVitamina());
		CategoriaItem catgItem =ctrlCatg.buscarCategoriaItem(item.getCodCategoria());
		this.txTipoIngrediente.setText(catgItem.getNome());
	}


	private void configurarVisibilidade() {
		this.txTipoIngrediente.setEditable(false);
		this.txNome.setEditable(false);
		this.txPorcaoGrama.setEditable(false);
		this.txValorCalorico.setEditable(false);
		this.txVitamina.setEditable(false);
		this.txCod.setEditable(false);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	protected void execute(Form f) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Detalhamento de Itens";
	}

}
