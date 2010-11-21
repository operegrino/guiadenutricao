/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import com.sun.lwuit.Button;
import com.sun.lwuit.CheckBox;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;

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
	
	
    public MontarPrato(){}
    
    public MontarPrato(String nome)
    {
    	
        super();
        this.setTitle(nome);
        lNomePrato     = new Label("Nome do Prato");
        txNomePrato    = new TextField();
        lTipoRefeicao  = new Label("Tipo de Refeição");
        String[] valor1 = {"Jantar", "Almoço"};
        cbTpRefeicao   = new ComboBox(valor1);
        lTpIngrediente = new Label("Tipo de Ingrediente");
        String[] valor2= {"Legume","Fruta","Massas"};
        cbTpIngrediente= new ComboBox(valor2);        
        lIngrediente   = new Label("Ingredientes");
        ckValor1       = new CheckBox("Arroz");
        ckValor2       = new CheckBox("Peixe");
        lValorCalorico = new Label("Valor Calorico: 122");
        btFiltrar      = new Button("Pesquisar");
        //btFiltrar.setTextPosition(CENTER);
        
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

        this.show();
        
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}
   

    /*
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
     *
     * Local para implementar os Commands.
     *
    }
    */
}
