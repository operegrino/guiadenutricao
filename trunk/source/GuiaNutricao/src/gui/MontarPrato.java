/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;

import Util.ArrayList;
import Util.UtilFuncoes;

import com.sun.lwuit.Button;
import com.sun.lwuit.CheckBox;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Container;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.layouts.GridLayout;

import negocio.ControladorCategoriaItem;
import classe.basica.CategoriaItem;

/**
 * @author Jefferson
 */
public class MontarPrato extends MainForm{


	Label lNomePrato;
	TextField txNomePrato;
	Label lIngrediente;
	CheckBox ckValor1;
	CheckBox ckValor2;
	Label lValorCalorico;	
	Label lTipoRefeicao;
	ComboBox cbTpRefeicao;
	Label lTpIngrediente;
	ComboBox cbTpIngrediente;
	Button btFiltrar;
	private ControladorCategoriaItem controlCat = new ControladorCategoriaItem();
	private static final int CMD_FILTRAR = 5;
	
    public MontarPrato()
    {
    	
        super();
        this.setTitle(this.getName());
        lNomePrato     = new Label("Nome do Prato");
        txNomePrato    = new TextField();
        lTipoRefeicao  = new Label("Tipo de Refeição");
        
        String[] valor1 = {"Jantar", "Almoço", "Lanche"};
        cbTpRefeicao   = new ComboBox(valor1);
        
        lTpIngrediente = new Label("Tipo de Ingrediente");        
        cbTpIngrediente= new ComboBox(getCategoriaItem());       
        
        lIngrediente   = new Label("Ingredientes");
        ckValor1       = new CheckBox("Arroz");
        ckValor2       = new CheckBox("Peixe");
        lValorCalorico = new Label("Valor Calorico: 122");
        
        Command cmd    = new Command("Add.Ingrediente", CMD_FILTRAR);
        btFiltrar      = new Button(cmd);
//        this.addCommand(cmd);
        //btFiltrar.setTextPosition(CENTER);
        
        //GridLayout grid = new GridLayout(2, 2);
        //this.setLayout(grid);
        //this.addComponent(new CheckBox("value 1"));
        //this.addComponent(new CheckBox("value 2"));
        
        this.addComponent(lNomePrato);
        this.addComponent(txNomePrato);
        this.addComponent(lTipoRefeicao);
        this.addComponent(cbTpRefeicao);
        this.addComponent(lTpIngrediente);
        this.addComponent(cbTpIngrediente);
        this.addComponent(btFiltrar);
        this.addComponent(lIngrediente);
        this.addComponent(ckValor1);
        this.addComponent(ckValor2);
        this.addComponent(lValorCalorico);

        this.getCategoriaItem();
        
        this.addCommandListener(this);
        this.show();
        
    }

	public String getName() {
		// TODO Auto-generated method stub
		return "Montar Prato";
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getCommand());
		
		Command cmd = e.getCommand();
		switch (cmd.getId()) {
		case RUN_COMMAND:{
			salvarPrato();
			break;
		}
		case BACK_COMMAND:{
			MainForm f = Menu.getSingleton();
			f.show();
			break;
		}
		case CMD_FILTRAR:{
			filtarIngrediente();			
		}
		default:{}
		}

	}
	
	public void filtarIngrediente()
	{
		if(this.cbTpIngrediente.size() > 0)
		{
			int pk = UtilFuncoes.capturarId(this.cbTpIngrediente.getSelectedItem().toString());
			
			try {
				FiltroIngrediente ingr = new FiltroIngrediente(pk);
			} catch (NumberFormatException e) {
				
				e.printStackTrace();
			} catch (InvalidRecordIDException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			} catch (RecordStoreException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void salvarPrato()
	{
		validarPrato();
	}
	
	// chamar esse método: consultarTodas()
	public String[] getCategoriaItem()
	{	
		
		ArrayList lista = new ArrayList();
		try
		{			
			lista = this.controlCat.consultarTodasCategoriasItens();		
		}catch(Exception e){
			Dialog.show("Atenção", e.getMessage(), "OK", null);
		}
		
		String[] value = new String[lista.size()];
		for(int i=0; i<lista.size(); i++)
		{
			CategoriaItem item = (CategoriaItem)lista.get(i);
			value[i] = item.getId()+"-"+item.getNome();
		}
		
		System.out.println(value.length);
		
		return value;	
		
	}

	public boolean validarPrato()
	{
		boolean resp = false;
		
		if((this.txNomePrato.getText() == null) || (this.txNomePrato.getText() == ""))
		{
			Dialog.show("Atenção", "Preencha o Nome do Prato", "OK", null);
   			resp = false;
		}
		
		System.out.println( (Display.getInstance()).getCurrent().getComponentCount() );
		
		
		return resp;
	}
}
